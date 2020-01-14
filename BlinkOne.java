import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BlinkOne
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver ObjDriver=new ChromeDriver();
		ObjDriver.manage().window().maximize();
		ObjDriver.get("https://demo.opencart.com");
		WebElement username=ObjDriver.findElement(By.name("search"));
		highLightElement(ObjDriver,username);
	}
	public static void highLightElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style',"
				+ "'background:yellow; border:2px solid red;');", element);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute"
				+ "('style','border:solid 2px white');",element);
	}
}