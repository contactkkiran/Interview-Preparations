
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import org.testng.Assert;

public class login {

	WebDriver driver;

	@BeforeClass
	private void instatiateWebdriver() {

		System.setProperty("webdriver.chrome.driver", "./misc/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

	@Test

	public void signIn() {

		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement signInLnk = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-link-accountList\"]/div/span")));
		signInLnk.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.id("ap_email")).sendKeys("contactkkiran@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Mutti@143");
		driver.findElement(By.id("signInSubmit")).click();

		WebElement userHomePage = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-link-accountList\"]/div/span")));
		Assert.assertEquals(userHomePage.getText(), "Hello, kiran");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div/a")).click();

		// Actions mouseHover = new Actions(driver);
		// mouseHover.moveToElement(userHomePage);
		// mouseHover.perform();
		// driver.findElement(By.id("nav-item-signout")).click();
		// *[@id="nav-item-signout"]/span

	}
}


mvn test –DCucumber.options=”Your Options”

mvn test -Dcucumber.options=”–tags @tag Name”	


mvn test –
cucumber.options=”src/test/resources/functionalTests/End2End_Tests.feature” -Dcucumber.options=”–tags @Smoke”

mvn test -Dcucumber.options=”–plugin junit:target/cucumber-reports/report.xml”.
