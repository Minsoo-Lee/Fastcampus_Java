package ch02_DesignPattern.Proxy;

public class Browser implements IBrowser {

    private String url;

    public Browser(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser loading hrml from : " + url);
        return new Html(url);
    }
}
