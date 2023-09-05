import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidatrSignUp {

    WebDriver driver;

    @BeforeClass
    public void SetUp () throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://validatr.io/sign-up");
        System.out.println("1. Chrome open with Validatr SignUp URL");
        System.out.println(">> Page URL  : "+driver.getCurrentUrl());

        Thread.sleep(3000);


    }

    @Test
    public void UserRegistration() throws InterruptedException {

        WebElement EnterFullNameText = driver.findElement(By.name("fullName"));
        EnterFullNameText.sendKeys("Automation User seven");

        Thread.sleep(3000);
        WebElement EmailAddress = driver.findElement(By.name("email"));
        EmailAddress.sendKeys("AUSvn-vali@yopmail.com");

        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("Saad1996**");

        WebElement ConfirmPassword = driver.findElement(By.name("confirmPassword"));
        ConfirmPassword.sendKeys("Saad1996**");

        Thread.sleep(3000);
        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
        buttonSubmit.click();

        Thread.sleep(3000);
//        WebElement ButtonOkmodal = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div/button"));
        //      ButtonOkmodal.click();

        System.out.print("2. User SignUp/Login Successfully\n");
        System.out.println("=====+++*****=========");
        System.out.println(">> Page URL  : "+driver.getCurrentUrl());
        Thread.sleep(3000);

    }
@Test(dependsOnMethods = "UserRegistration")
    public void AddProject() throws InterruptedException {


        WebElement AddProjectName = driver.findElement(By.name("Project Name"));
        AddProjectName.sendKeys("Auto Driving Sensor");

        WebElement AddNiche = driver.findElement(By.name("industryName"));
        AddNiche.sendKeys("Selenium Automation");

        WebElement SubmitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        SubmitButton.click();

        Thread.sleep(3000);

    System.out.print("ProjectAdded Successfully\n");
        driver.quit();
    }






}
