package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();

        WebElement searchElement = driver.findElement(By.name("k"));
        searchElement.sendKeys("Laptop");

        driver.findElement(By.className("gaMakD")).click();

        String u = driver.getCurrentUrl();
        if(u.equals("https://www.gittigidiyor.com/makyaj/goz-makyaji/rimel-maskara?k=Maskara&qm=1")){
          System.out.println("Pass");
        }else {
         driver.quit();
       }
    }
}
