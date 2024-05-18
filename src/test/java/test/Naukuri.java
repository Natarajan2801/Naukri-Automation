// package test;

// import io.github.bonigarcia.wdm.WebDriverManager;
// import org.openqa.selenium.By;
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.remote.RemoteWebDriver;
// import org.testng.Assert;
// import org.testng.annotations.AfterClass;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.Test;

// import java.util.Base64;
// import java.util.concurrent.TimeUnit;

// import javax.crypto.Cipher;
// import javax.crypto.KeyGenerator;
// import javax.crypto.SecretKey;
// import javax.crypto.spec.SecretKeySpec;

// import java.time.Duration;
// import java.net.URL;


// public class Naukuri {
// 	private WebDriver driver;
// 	 private static final String ALGORITHM = "AES";

// 	@BeforeClass
// 	public void setUp() throws Exception {
// 		//WebDriverManager.chromedriver().setup();
// 		// ChromeOptions options = new ChromeOptions();
// 		// options.addArguments("--no-sandbox");
// 		// options.addArguments("--disable-dev-shm-usage");
// 		// options.addArguments("--headless");
// 		// options.addArguments("--disable-gpu");
// 		// options.addArguments("--window-size=1920,1080");
// 		//  options.addArguments("--disable-blink-features=AutomationControlled");
// 		//  options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3");
// 		// driver = new ChromeDriver(options);
// 		// driver.navigate().to("https://www.naukri.com/nlogin/login");
// 		   DesiredCapabilities capabilities = new DesiredCapabilities();
//      		   capabilities.setCapability("browserName", "chrome");
//      		   capabilities.setCapability("enableVNC", true);
//    		     capabilities.setCapability("enableVideo", false);
//     	 driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
//         driver.get("https://www.naukri.com/nlogin/login");
// 		driver.manage().window().maximize();
// 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
// 	}

// 	@Test
// 	public void updateProfile() throws Exception {
// 		String key=encrypt("q8kZWlKAk1gyWfBaL7QqzA==", "q8kZWlKAk1gyWfBaL7QqzA==");
// 		String userName=decrypt("ev/D2KxcHKRS7tJ9HX+ktmsPruQm2h97Ufq5rRrk6lM=",decrypt(key,"q8kZWlKAk1gyWfBaL7QqzA=="));
// 		String password=decrypt("AqqnO796MrQGyFxKOzpljg==",decrypt(key,"q8kZWlKAk1gyWfBaL7QqzA=="));
// 		WebElement inputEmail = driver.findElement(By.id("usernameField"));
// 		inputEmail.click();
// 		inputEmail.sendKeys(userName);

// 		WebElement inputPassword = driver.findElement(By.id("passwordField"));
// 		inputPassword.click();
// 		inputPassword.sendKeys(password);
// 		driver.findElement(By.xpath("//button[text()='Login' and @class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform' and @data-ga-track='spa-event|login|login|Save||||true']")).click();
// 		Thread.sleep(2000);
// 		driver.findElement(By.xpath("//a[text()='View']")).click();
// 		Thread.sleep(1000);
// 		driver.findElement(By.xpath("//ul/li/span[text()='IT skills']")).click();
// 		driver.findElement(By.xpath("//span[text()='Rest Assured']/following-sibling::span[text()='editOneTheme']"))
// 				.click();
// 		Thread.sleep(1000);
// 		WebElement expInput = driver.findElement(By.xpath("//*[@id='expMonthDroopeFor']"));
// 		String value = driver.findElement(By.xpath("//*[@id='hid_expMonthDroope']")).getAttribute("value");
// 		expInput.click();
// 		if (value.equals("4")) {
// 			expInput.clear();
// 			expInput.sendKeys("3 Months");
// 			expInput.sendKeys(Keys.ENTER);
// 		} else {
// 			expInput.clear();
// 			expInput.sendKeys("4 Months");
// 			expInput.sendKeys(Keys.ENTER);
// 		}

// 		driver.findElement(By.xpath("//*[@id='saveITSkills']")).click();
// 		Thread.sleep(1000);
// 		driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon-img-wrapper']")).click();
// 		Thread.sleep(1000);
// 		driver.findElement(By.xpath("//a[@title='Logout']")).click();
// 		System.out.println("--------------Sucessfully Profile Updated -----------");

// 	}
//     public static String decrypt(String encryptedData, String key) throws Exception {
//         SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
//         Cipher cipher = Cipher.getInstance(ALGORITHM);
//         cipher.init(Cipher.DECRYPT_MODE, secretKey);
//         byte[] decryptedData = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
//         return new String(decryptedData);
//     }
//     public static String encrypt(String data, String key) throws Exception {
//         SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
//         Cipher cipher = Cipher.getInstance(ALGORITHM);
//         cipher.init(Cipher.ENCRYPT_MODE, secretKey);
//         byte[] encryptedData = cipher.doFinal(data.getBytes());
//         return Base64.getEncoder().encodeToString(encryptedData);
	    
//     }
// 	@AfterClass
// 	public void tearDown() {
// 		if (driver != null) {
// 			driver.quit();
// 		}
// 	}
// }


package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukuri {
	@Test
    public  void main() {
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);

        try {
         driver.get("https://www.naukri.com/nlogin/login");
	System.out.println(driver.getTitle());
	System.out.println("--------------Sucessfully Profile Updated -----------");

            // Your test code here

        } catch (Exception e) {
		System.out.println("-------------error -----------");
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
