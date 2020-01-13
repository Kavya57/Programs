import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TextOne
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C://chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver=new ChromeDriver();
		ObjDriver.get("http://demo.automationtesting.in/Register.html");
		List<WebElement> total=ObjDriver.findElements(By.xpath("//input[@type='text']"));
	    System.out.println(total.size());
	    for(WebElement l:total)
	    	System.out.println(l.getAttribute("placeholder"));
	}
}
