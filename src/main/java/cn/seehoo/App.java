package cn.seehoo;

import cn.seehoo.store.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        UserService userService = new UserService();
        userService.Test("Log4j打印测试");
        System.out.println( "Hello World!" );
    }
}
