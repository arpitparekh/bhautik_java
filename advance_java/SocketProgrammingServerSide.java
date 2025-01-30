package advance_java;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketProgrammingServerSide {

  // server socket and client socket
  // server socket is used to listen to client socket
  // client socket is used to connect to server socket

  public static void main(String[] args) {

    try {
      ServerSocket serverSocket = new ServerSocket(6666);
      System.out.println("Server is running on port 6666");
      System.out.println("Waiting for client to connect...");
      Socket socket = serverSocket.accept();
      System.out.println("Client connected");
      System.out.println("Client connected: " + socket.getInetAddress());

      Scanner sc = new Scanner(System.in);

      while (true) {

        OutputStream os = socket.getOutputStream();
      
        String message = sc.nextLine();
        os.write(message.getBytes());

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          System.out.println(e);
        }

      }



      // os.close();

      // socket.close();
      // serverSocket.close();

    } catch (IOException e) {
      System.out.println(e);
    }

  }

}
