import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CheckImage
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C://chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver=new ChromeDriver();
		ObjDriver.get("http://demo.automationtesting.in/Register.html");
		WebDriverWait wait=new WebDriverWait(ObjDriver,20);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header']")));
		boolean status=element.isDisplayed();
		if(status) System.out.println("Webdriver is visible");
		else System.out.println("Webdriver is not visible");
		ObjDriver.manage().window().maximize();
	}
}

