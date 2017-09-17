package core;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import java.net.MalformedURLException;

/**
 * Created by chenxiaoqin on 9/10/17.
 */
public class TestBase {

    {
      // System.setProperty("webdriver.firefox.marionette", "/Users/chenxiaoqin/Downloads/geckodriver");
         System.setProperty("webdriver.chrome.driver", "/Users/chenxiaoqin/Downloads/chromedriver");
    }

   // protected WebDriver driver = new FirefoxDriver();//打开火狐浏览器
   ChromeOptions options =new ChromeOptions();
    protected WebDriver driver = new ChromeDriver(options);


    //获取当前类的类名传值给logger,该句的作用就是用log4j打印日志时知道是哪个类下面的打印输出信息

    public TestBase(){
        try {
            _newTest1();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected String getUrl() {
        return "https://www.1000.com";
    }

    protected Logger logger =  LogManager.getLogger(getClass().getSimpleName());

    /**
     *
     * 程序入口，打开需要测试的url地址
     * */
    protected void _newTest1() throws MalformedURLException, InterruptedException {
        driver.get(getUrl());//打开需要测试页面的url
        Thread.sleep(2000);
        //chrome最大化
         options.addArguments("--start-maximized");
        //driver.manage().window().maximize();//获取当前窗口最大化，这个方法是不支持IE跟谷歌浏览器
        Thread.sleep(1000);
    }

    @AfterMethod
    protected void tearDown(){
        driver.quit();
    }


}
