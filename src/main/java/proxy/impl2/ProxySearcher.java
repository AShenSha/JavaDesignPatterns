package proxy.impl2;

/**
 * @author ShenSha on 2018/12/14
 */
public class ProxySearcher implements  Searcher {
    private RealSearcher realSearcher = new RealSearcher();
    private Logger logger;
    private AccessValidator accessValidator;

    @Override
    public String doSearch(String userId, String keyWord) {
        //如果身份验证成功，则执行查询
        if (this.validate(userId))
        {
            String result = realSearcher.doSearch(userId, keyWord); //调用真实主题对象的查询方法
            this.log(userId); //记录查询日志
            return result; //返回查询结果
        }
        else
        {
            return null;
        }
    }
    public boolean validate(String userId){
        accessValidator = new AccessValidator();
        return accessValidator.validate(userId);
    }

    public void log(String userId){
        logger = new Logger();
        logger.log(userId);
    }
}
