package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertNotNull;

public class Test4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();

        WebElement searchElement = driver.findElement(By.name("k"));
        searchElement.sendKeys("Laptop");

        driver.findElement(By.className("gaMakD")).click();

//        String u = driver.getCurrentUrl();
//        if(u.equals("https://www.gittigidiyor.com/dizustu-laptop-notebook-bilgisayar?k=Laptop&qm=1")){
//            System.out.println("Pass");
//        }else {
//            System.out.println("Fail");
//        }

        WebElement searchResults = driver.findElement(By.linkText("Laptop, Dizüstü Bilgisayar (Laptop)"));

        assertNotNull(searchResults);
    }

}
