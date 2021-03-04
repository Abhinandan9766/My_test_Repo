package Database;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class LoginDatabase {

	public void verifyDatabaselogin() throws InterruptedException
	{
//		System.setProperty("webdriver.gecko.driver","D:\\Abhinandan\\E drive\\geckodriver-v0.24.0-win64\\geckodriver.exe");
//		Thread.sleep(20000);
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//System.out.println("databas is loaded ");
//		driver.get("http://192.168.10.242/mes-web-app");
		
		System.setProperty("webdriver.gecko.driver", "D:\\Abhinandan\\E drive\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		Thread.sleep(20000);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://192.168.10.242/mes-web-app");
		
		Connectdatabase connectdatabase = new Connectdatabase();
	
}
}