package Vladislav.patterns.structural.proxy;

public class ImageRunner {

    private static final String URL = "https://static.probusiness.io/720x480c/n/03/d/38097027_439276526579800_2735888197547458560_n.jpg";
    public static void main(String[] args) {
        Image realImage = new ProxyImage(URL);

        realImage.show();
    }
}
