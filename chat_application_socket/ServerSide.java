package chat_application_socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSide extends Thread {

    @Override
    public void run() {
      try {

        ServerSocket serverSocket = new ServerSocket(8080, 50, InetAddress.getByName("0.0.0.0"));
        System.out.println("Server is running on port 8080");
        System.out.println("Waiting for client to connect...");

        Scanner sc = new Scanner(System.in);


        while (true) {
          Socket socket = serverSocket.accept();
          System.out.println("Client connected");
          System.out.println("Client connected: " + socket.getLocalAddress());

          new Thread(){
              @Override
            public void run() {

              while (true) {
                byte[] buffer = new byte[4096];
                try {
                  socket.getInputStream().read(buffer);
                  System.out.println(new String(buffer));
                } catch (IOException e) {
                  System.out.println(e);
                }
              }

              }

          }.start();


          new Thread(){
            @Override
            public void run() {
              while (true) {
                try {
                  socket.getOutputStream().write(sc.nextLine().getBytes());

                } catch (Exception e) {
                  System.out.println(e);
                }
              }
            }
          }.start();

        }

      } catch (IOException e) {
        System.out.println(e);
      }

    }



}
