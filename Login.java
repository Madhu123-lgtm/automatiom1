package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		//launch the website
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//id to entire the username
		driver.findElement(By.id("user-name")).sendKeys("stand_user");
		//id to entire the password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//id to click login button
		driver.findElement(By.id("login-button")).click();
		

	}

}
