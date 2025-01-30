import java.io.InputStream;
import java.net.Socket;

public class SocketProgrammingClientSide {

  public static void main(String[] args) {

    try {

      Socket socket = new Socket("localhost", 6666);
      System.out.println("Client is running on port 6666");

      InputStream is = socket.getInputStream();

      byte[] buffer = new byte[4096];

      while (true) {

        is.read(buffer);

        String message = new String(buffer);
        System.out.println(message);

      }

    }catch(Exception e){
      System.out.println(e);
    }

  }

}
