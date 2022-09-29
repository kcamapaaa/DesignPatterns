package Vladislav.patterns.structural.proxy;

public class ProxyImage implements Image {
    String url;
    RealImage realImage;

    public ProxyImage(String URL) {
        this.url = URL;
    }

    @Override
    public void show() {
        if(realImage == null) {
            realImage = new RealImage(url);
        }
        realImage.show();
    }
}
