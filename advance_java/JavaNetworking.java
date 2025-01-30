import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import javax.net.ssl.HttpsURLConnection;

class FileDownload{
    static void downloadFile(String url) throws URISyntaxException, FileNotFoundException, IOException{

        String urlstr = "https://file-examples.com/storage/fef09afdeb679921392cb49/2017/04/file_example_MP4_480_1_5MG.mp4";

        String extension = urlstr.substring(urlstr.lastIndexOf(".")+1, urlstr.length());

        URI uri = new URI(urlstr);

        HttpURLConnection connection =(HttpsURLConnection) uri.toURL().openConnection();
        int responseCode = connection.getResponseCode();
        System.out.println(responseCode);

        if(responseCode==HttpURLConnection.HTTP_OK){

        InputStream is = connection.getInputStream();

        FileOutputStream fos = new FileOutputStream("/home/arpit-parekh/files/myFile."+extension);

        int x = 0;

        while((x =is.read())!=-1){
            // System.out.println(x);
            fos.write(x);
        }
        System.out.println("Image Download Successfully");
        fos.close();
        is.close();
    }
}

}

public class JavaNetworking{
    public static void main(String[] args) {

        try {
            FileDownload.downloadFile("https://file-examples.com/storage/fef09afdeb679921392cb49/2017/04/file_example_MP4_480_1_5MG.mp4");
        } catch (Exception ex) {

            System.out.println(ex);
        }
    }
}



