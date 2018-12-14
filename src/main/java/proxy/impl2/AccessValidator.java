package proxy.impl2;

import java.io.Console;

/**
 * @author ShenSha on 2018/12/14
 */
public class AccessValidator {
    public boolean validate(String userId){
        System.out.println("在数据库中验证用户"+userId+"是否为合法用户");
        if(userId.equals("zhangsan")){
            System.out.println("验证通过");
            return true;
        }else{
            System.out.println("验证失败");
            return false;
        }
    }
}
