package cn.seehoo.store.service;

import java.util.logging.Logger;

public class UserService {

    private static Logger logger = Logger.getLogger(String.valueOf(UserService.class));
    public void Test(String string){
        logger.info("UserService.Test---------------------"+string);
        logger.warning("UserService.Test---------------------"+string);
    }
}
