package tests;

import core.TestBase;
import org.testng.annotations.Test;
import pages.LogonPage;

/**
 * Created by chenxiaoqin on 9/10/17.
 */
public class LoginTest extends TestBase {


    @Test(priority = 0)
    public void login1() {

        try {
            LogonPage logonPage = new LogonPage(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }



       logger.info("测试成功");


    }

}
