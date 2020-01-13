import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkCount
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C://chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver=new ChromeDriver();
		ObjDriver.get("http://demo.opencart.com/index.php?route=product/product&product_id=30");
		System.out.println("Camera");
		List<WebElement> links=ObjDriver.findElements(By.tagName("a"));
		System.out.println("Number of links "+links.size());
		for(WebElement l:links)
			System.out.println(l.getAttribute("href"));
		ObjDriver.close();
	}
}

