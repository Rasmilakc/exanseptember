package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam3 {

	public static void main(String[] args) {
		// 3.Select orange a radio button and asset whether it is checked
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement orange=driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(7)"));
		orange.click();
		boolean q5 = orange.isSelected();
		if(q5==true) {
			System.out.println("Orange radio button is selected.");
		}

		

	}

}
