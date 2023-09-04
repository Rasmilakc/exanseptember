package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exam4 {

	public static void main(String[] args) {
	//4.From first Drop down select python and assert	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("driver.get(\"http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html\");"); 
		
		Select python = new Select(driver.findElement(By.cssSelector("#dropdowm-menu-1")));
		python.selectByVisibleText("Python");

		String selectedOption = python.getFirstSelectedOption().getText();
        if (selectedOption.equals("Python")) {
            System.out.println("Python is selected from the dropdown.");
        } else {
            System.out.println("Python is not selected from the dropdown.");
        }


	}

}
