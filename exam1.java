package seleniumtutorials;

import org.openqa.selenium.chrome.ChromeDriver;

public class exam1 {

	public static void main(String[] args) {
		//1 Validate title of page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get(\"http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html\"); 
		
		
	
		String expectedTitle="WebDriver | Dropdown Menu";
		String titleOfPage = driver.getTitle();
		
		if(expectedTitle.equals(titleOfPage)) {
		System.out.println("Test case 1 passed.");
		}
		

				
			

	}

}
