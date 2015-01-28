package com.training.architecture.src.clean_code.common;

import java.io.*;
import java.net.Socket;

public class MessageUtils {
    public static String getMessage(final Socket socket) throws IOException {
        InputStream stream = socket.getInputStream();
        ObjectInputStream objectinputStream = new ObjectInputStream(stream);
        return objectinputStream.readUTF();
    }

    public static void sendMessage(final Socket socket, final String message) throws IOException {
        OutputStream stream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);
        objectOutputStream.writeUTF(message);
        objectOutputStream.flush();
    }
}
