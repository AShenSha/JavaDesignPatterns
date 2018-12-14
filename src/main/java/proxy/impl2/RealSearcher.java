package proxy.impl2;

import java.io.Console;

/**
 * @author ShenSha on 2018/12/14
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userId, String keyWord) {
        System.out.println("用户"+userId+"使用关键词"+keyWord+"查询商务信息！");
        return "返回具体内容";
    }
}
