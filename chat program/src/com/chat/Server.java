package com.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private SocketServer socketServer;


    {
        try {
            if (!serverSocket.isClosed()) {
                do {
                } while (!serverSocket.isClosed());
            }

            Socket socket;
            try {
                socket = serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("A new client has conected");
            ClientHandler clientHandler = new ClientHandler(socket);

            Thread thread = new Thread(clientHandler);
            thread.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    {
    }

    public void ClassServerSocket() {

        try {
            if (ServerSocket != null) {
                ServerSocket.close();
            }
        } catch (IoException e) {
            e.printStackTrace();
        }
    }

    public void startServer() {
        IOException e;
    }

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;

    }


    private ServerSocket serverSocket;

    public static void main(String[] args) throws IOException {


        ServerSocket serverSocket = new ServerSocket(1234);
        Server server = new Server(serverSocket);
        Server.startServer();
    }

}
