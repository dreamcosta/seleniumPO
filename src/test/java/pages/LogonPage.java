package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * @author chenxiaoqin
 *         测试场景：打开页面输入手机号、密码点击登录
 */

public class LogonPage extends GeneralPage{



    @FindBy(id="nickName0")
    private WebElement nickName;

    @FindBy(id="logPsw")
    private WebElement passWord;

    @FindBy(css="button.ant-btn.ant-btn-primary.login-btn")
    private WebElement loginButton;

    public LogonPage(WebDriver driver) {
        super(driver);
    }

    public LogonPage nameInput() throws InterruptedException {

        nickName.sendKeys("13701453844");
        Thread.sleep(3000);


        return this;

    }

    public LogonPage passWordInput() throws InterruptedException {
        passWord.sendKeys("84617195cxq");
        Thread.sleep(3000);
        return this;

    }

    public LogonPage buttonClick() throws InterruptedException {
        loginButton.click();
        Thread.sleep(3000);
        return this;


    }
}


