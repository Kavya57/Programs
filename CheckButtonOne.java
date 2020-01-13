import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckButtonOne
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C://chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver=new ChromeDriver();
		ObjDriver.get("http://demo.automationtesting.in/Register.html");
		WebElement check_button=ObjDriver.findElement(By.xpath("//*[@id=\'checkbox1']"));
		check_button.click();
		boolean status=check_button.isDisplayed();
		System.out.println("check button is displayed>>"+status);
		boolean enabled_status=check_button.isEnabled();
		System.out.println("check button is enabled>>"+enabled_status);
		WebElement check_button2=ObjDriver.findElement(By.xpath("//*[@id=\'checkbox2']"));
		check_button2.click();
		boolean status2=check_button.isDisplayed();
		System.out.println("check button is displayed>>"+status2);
		boolean enabled_status2=check_button.isEnabled();
		System.out.println("check button is enabled>>"+enabled_status2);
		WebElement check_button3=ObjDriver.findElement(By.xpath("//*[@id=\'checkbox3']"));
		check_button3.click();
		boolean status3=check_button.isDisplayed();
		System.out.println("check button is displayed>>"+status3);
		boolean enabled_status3=check_button.isEnabled();
		System.out.println("check button is enabled>>"+enabled_status3);
		//ObjDriver.quit();
	}
}

