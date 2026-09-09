import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathExamples {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
      
        //known attribute and unknown tag
        driver.findElement(By.xpath("//*[@HEIGHT='24']"));
      
        //known attribute and known tag
        driver.findElement(By.xpath("//span[@class='bmc-btn-text']"));

        // Known visible text
        driver.findElement(
            By.xpath("//a[text()='Join Telegram Channel']")
        );

        // Partial visible text
        driver.findElement(
            By.xpath("//a[contains(text(),'Join')]")
        );

        // Starts-with
        driver.findElement(
            By.xpath("//a[starts-with(text(),'Join')]")
        );

      //Locating elements with dynamic attribute values
       driver.findElement(
            By.xpath("//*[contains(@class,'tm')]"));
      driver.findElement(By.xpath("//*[starts-with(@class,'menu')]"));
      
        driver.quit();
    }
}
