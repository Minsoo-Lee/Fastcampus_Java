package ch02.Proxy;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
        Browser browser1 = new Browser("www.naver.com");
        browser1.show();
        browser1.show();
        browser1.show();
        browser1.show();
        System.out.println();

        IBrowser browser2 = new BrowserProxy("www.naver.com");
        browser2.show();
        browser2.show();
        browser2.show();
        browser2.show();
        browser2.show();
        System.out.println();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()-> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()-> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        String new_id = "33";
        System.out.println(new_id);
        StringBuilder sb = new StringBuilder (new_id);
    }
}
