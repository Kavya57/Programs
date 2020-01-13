import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ButtonCount
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C://chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver=new ChromeDriver();
		ObjDriver.get("http://demo.automationtesting.in/Register.html");
		System.out.println("Phone");
		List<WebElement> buttons=ObjDriver.findElements(By.name("radiooptions"));
		System.out.println("Number of button "+buttons.size());
		for(WebElement b:buttons)
			System.out.println(b.getAttribute("href"));
		ObjDriver.close();
	}
}

