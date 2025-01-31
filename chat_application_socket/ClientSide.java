package chat_application_socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientSide extends Thread {

  @Override
  public void run() {
    try {
      Socket socket = new Socket("localhost", 8080);
      System.out.println("Client is running on port 8080");
      System.out.println("Connected to server");

      Scanner sc = new Scanner(System.in);

      new Thread() {
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

      new Thread() {
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

    } catch (IOException e) {
      System.out.println(e);
    }
  }

}
