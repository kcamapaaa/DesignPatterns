package Vladislav.patterns.structural.proxy;

public class RealImage implements Image {
    String url;

    public RealImage(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading the image from " + url + "...");
    }

    @Override
    public void show() {
        System.out.println("Showing the picture...");
    }
}
