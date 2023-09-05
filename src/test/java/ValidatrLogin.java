import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidatrLogin {


    WebDriver driver;

    @BeforeClass
    public void SetUp () throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://validatr.io/");
        System.out.println("1. Chrome open with ValidatrURL");
        System.out.println(">> Page URL  : "+driver.getCurrentUrl());

        Thread.sleep(3000);


    }

    @Test
    public void UserSignIn() throws InterruptedException {

        WebElement LoginButton = driver.findElement(By.xpath("//p[contains(.,'Login / Sign up')]"));
        LoginButton.click();

        Thread.sleep(3000);
        WebElement EmailAddress = driver.findElement(By.name("email"));
        EmailAddress.sendKeys("AUSvn-vali@yopmail.com");

        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("Saad1996**");

        //WebElement PrivacyPolicyCheckBox = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[1]/form/div[1]/div[5]/span/input"));
        // PrivacyPolicyCheckBox.click();

        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
        buttonSubmit.click();

        Thread.sleep(6000);
//        WebElement ButtonOkmodal = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div/button"));
  //      ButtonOkmodal.click();

        System.out.print("2. User Login Successfully\n");
        System.out.println("=====+++*****=========");
        System.out.println(">> Page URL  : "+driver.getCurrentUrl());
        Thread.sleep(6000);


        driver.quit();

    }





}
