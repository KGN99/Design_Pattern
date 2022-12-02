package aop;

import proxy.Html;
import proxy.IBrowser;

public class AopBrowser implements IBrowser {

    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;

    public AopBrowser(String url,Runnable before, Runnable after){
        this.url = url;
        this.after = after;
        this.before = before;

    }

    @Override
    public Html show() {
        before.run();

        if (html == null) {
            this.html = new Html(url);
            System.out.println("AopBrowser html loading from : " + url);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("AopBrowser html cache : " + url);
        }

        after.run();
        return html;
    }
}
