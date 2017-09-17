package pages;

import core.TestBase;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

/**
 * Created by chenxiaoqin on 9/10/17.
 */
public class GeneralPage {


    protected  WebDriver driver;

    public GeneralPage (WebDriver driver) {
        this.driver = driver;
        //通过initElements方法初始化的各个页面对象，AjaxElementLocatorFactory方法可以查找元素时都会在指定的TIMEOUT时间内不断重试，如果在指定时间内定位到元素则马上继续，如果指定时间内未找到则抛出NoSuchElementException异常。
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 3000), this);

    }

    /**
     * 封装sendKey文本框输入方法
     * 封装click点击事件方法
     *
     * */
    protected void sendKeys(By by, String value) {

        driver.findElement(by).sendKeys(value);
    }

    protected void click(By by) {
        driver.findElement(by).click();
    }

}
