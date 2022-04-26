package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com/uye-girisi?s=1");
        driver.manage().window().maximize();

        driver.findElement(By.id("L-UserNameField")).sendKeys("test@hotmail.com");
        driver.findElement(By.id("L-PasswordField")).sendKeys(("testtest123"));
        driver.findElement(By.xpath("//*[@id=\"gg-login-enter\"]")).click();

        String u = driver.getCurrentUrl();
        if(u.equals("https://www.gittigidiyor.com/")){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}
