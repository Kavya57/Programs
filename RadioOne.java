import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioOne
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C://chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver=new ChromeDriver();
		ObjDriver.get("http://demo.automationtesting.in/Register.html");
		WebElement radio_button=ObjDriver.findElement(By.name("radiooptions"));
		boolean status=radio_button.isDisplayed();
		System.out.println("radio button is displayed>>"+status);
		boolean enabled_status=radio_button.isEnabled();
		System.out.println("radio button is enabled>>"+enabled_status);
		boolean selected_status=radio_button.isSelected();
		System.out.println("radio button is selected>>"+selected_status);
		radio_button.click();
		boolean selected_status_new=radio_button.isSelected();
		System.out.println("radio button is selected>>"+selected_status_new);
		//ObjDriver.quit();
	}
}

