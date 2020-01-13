import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OneWeb
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C://chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver=new ChromeDriver();
		ObjDriver.get("http://demo.opencart.com");
		System.out.println("page is loaded");
		String var1=ObjDriver.getTitle();
		System.out.println("title of the page:"+var1);
		WebElement Obj1=ObjDriver.findElement(By.xpath("//html/body/footer/div/div/div[4]/ul/li[1]/a"));
		Obj1.click();
		String var2=ObjDriver.getTitle();
		System.out.println("title of the page:"+var2);
		ObjDriver.quit();
	}
}
