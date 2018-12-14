package proxy.impl1;

import com.sun.jndi.toolkit.url.UrlUtil;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author ShenSha on 2018/12/10
 */
public class Client {
    public static void main(String[] args) {
        String imageUrl = "xx.jpg";
        try {
            URL url= new URL(imageUrl);
            HighResolutionImage highResolutionImage = new HighResolutionImage(url);
            ImageProxy proxy = new ImageProxy(highResolutionImage);
            proxy.showImage();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
