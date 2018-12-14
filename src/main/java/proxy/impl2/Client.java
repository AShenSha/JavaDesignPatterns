package proxy.impl2;

/**
 * @author ShenSha on 2018/12/14
 */
public class Client {
    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher();
        searcher.doSearch("zhangsan","123456");
    }
}
