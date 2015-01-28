package com.training.architecture.src.clean_code.concurrency;


import com.training.architecture.src.clean_code.common.MessageUtils;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Logger;

public class Server implements Runnable {

    private final Logger logger = Logger.getLogger("");
    private volatile boolean keepProcessing = true;
    private ServerSocket serverSocket;

    public Server(final int port, final int millisecondsTimeout) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(millisecondsTimeout);
    }

    @Override
    public void run() {
        logger.info("Server Starting");

        while (keepProcessing) {
            try {
                logger.info("accepting client");
                Socket socket = serverSocket.accept();
                logger.info("go client");
                process(socket);
            } catch (Exception e) {
                handle(e);
            }
        }
    }

    private void process(final Socket socket) {
        if (socket == null) {
            return;
        }
        Runnable clientHandler = new Runnable() {
            @Override
            public void run() {

                try {
                    logger.info("Server: getting message");
                    final String message = MessageUtils.getMessage(socket);
                    logger.info("Server: got message: " + message);
                    Thread.sleep(1000);
                    logger.info("Server: sending reply: " + message);
                    MessageUtils.sendMessage(socket, "Processed: " + message);
                    logger.info("Server: sent");
                    closeIgnoringException(socket);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread clientConnection = new Thread(clientHandler);
        clientConnection.start();
    }

    private void closeIgnoringException(final Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void handle(final Exception e) {
        if (!(e instanceof SocketException)) {
            e.printStackTrace();
        }
    }

    private void closeIgnoringException(final ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopProcessing() {
        keepProcessing = false;
        closeIgnoringException(serverSocket);
    }
}
