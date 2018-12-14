package proxy.impl1;

import java.net.URL;

/**
 * @author ShenSha on 2018/12/10
 */
public class HighResolutionImage implements Image {
    private URL imageUrl;
    private long startTime;
    private int height;
    private int width;

    public URL getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public HighResolutionImage(URL imageUrl) {
        this.imageUrl = imageUrl;
        this.startTime = System.currentTimeMillis();
        this.height = 600;
        this.width = 600;
    }

    public boolean isLoad() {
        long endTime = System.currentTimeMillis();
        return endTime - startTime > 3000;
    }

    @Override
    public void showImage() {
        System.out.println("Real Image: " + imageUrl);
    }
}
