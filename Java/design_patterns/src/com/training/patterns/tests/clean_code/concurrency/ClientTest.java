package com.training.patterns.tests.clean_code.concurrency;

import com.training.architecture.src.clean_code.common.MessageUtils;
import com.training.architecture.src.clean_code.concurrency.Server;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.Socket;

public class ClientTest {
    private static final int PORT = 8009;
    private static final int TIMEOUT = 2000;

    private Server server;
    private Thread serverThread;

    @Before
    public void createServer() throws Exception {
        try {
            server = new Server(PORT, TIMEOUT);
            serverThread = new Thread(server);
            serverThread.start();
        } catch (Exception e) {
            e.printStackTrace(System.err);
            throw e;
        }
    }

    @After
    public void shutdownServer() throws Exception {
        if (server != null) {
            server.stopProcessing();
            serverThread.join();
        }
    }

    void connectSendReceive(final int clientNumber) throws IOException {
        System.out.println("Client " + clientNumber + " connecting");
        Socket socket = new Socket("localhost", PORT);
        System.out.println("Client " + clientNumber + " sending message");
        MessageUtils.sendMessage(socket, Integer.toString(clientNumber));
        System.out.println("Client " + clientNumber + " getting reply");
        MessageUtils.getMessage(socket);
        System.out.println("Client " + clientNumber + " finished");
        socket.close();
    }

    @Test(timeout = 10000)
    public void shouldRunInUnder10Seconds() throws Exception {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; ++i) {
            threads[i] = new Thread(new TrivialClient(i));
            threads[i].start();
        }

        for (final Thread thread : threads) {
            thread.join();
        }
    }

    final class TrivialClient implements Runnable {
        int clientNumber;

        TrivialClient(final int clientNumber) {
            this.clientNumber = clientNumber;
        }

        @Override
        public void run() {
            try {
                connectSendReceive(clientNumber);
            } catch (IOException ignored) {
            }
        }
    }
}
