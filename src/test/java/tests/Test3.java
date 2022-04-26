package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com/kayit-ol");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"RegisterPost\"]/div[2]/div/div/div[2]/input")).sendKeys("TestName");
        driver.findElement(By.xpath("//*[@id=\"RegisterPost\"]/div[3]/div/div/div[2]/input")).sendKeys("TestSurname");
        driver.findElement(By.name("email")).sendKeys("test123@yandex.com");
        driver.findElement(By.id("pwdField")).sendKeys("testtest123");
        driver.findElement(By.id("gsmData")).sendKeys("5312345678");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        String u = driver.getCurrentUrl();
        if(u.equals("https://www.gittigidiyor.com/")){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}
