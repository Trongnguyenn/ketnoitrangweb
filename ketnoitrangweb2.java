// Chuong trinh java download https://www.google.com

import java.io.*;
import java.net.URL;
import java.net.MalformedURLException;
public class ketnoitrangweb2 {

    public static void DownloadWebPage(String webpage)
    {
        try {

            // Create URL object
            URL url = new URL(webpage);
            BufferedReader readr =
                    new BufferedReader(new InputStreamReader(url.openStream()));

            // Enter filename in which you want to download
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("Google.html"));

            // read each line from stream till end
            String line;
            while ((line = readr.readLine()) != null) {
                writer.write(line);
            }

            readr.close();
            writer.close();
            System.out.println("Successfully Downloaded.");
        }

        // Exceptions
        catch (MalformedURLException mue) {
            System.out.println("Malformed URL Exception raised");
        }
        catch (IOException ie) {
            System.out.println("IOException raised");
        }
    }

    public static void main(String args[])
            throws IOException
    {
        // insert the webpage you want to download
        String url = "https://www.google.com";
        DownloadWebPage(url);
    }
}