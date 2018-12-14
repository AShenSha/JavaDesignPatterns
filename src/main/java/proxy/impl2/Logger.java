package proxy.impl2;

/**
 * @author ShenSha on 2018/12/14
 */
public class Logger {
    public void log(String userId){
        System.out.println("更新数据库,用户"+userId+"查询次数加1");
    }
}
