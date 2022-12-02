package proxy;

public class BrowserProxy implements IBrowser{
    private String url;
    private Html html;

    public BrowserProxy(String url){
        this.url = url;
    }

    @Override
    public Html show() {
        if (html == null){
            this.html = new Html(url);
            System.out.println("browser loadin html from : " + url);
        } else {
            System.out.println("browser use cache html : " + url);
        }
        return html;
    }
}
