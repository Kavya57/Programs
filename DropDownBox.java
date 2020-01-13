import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownBox
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C://chromedriver_win32//chromedriver.exe");
		WebDriver ObjDriver=new ChromeDriver();
		ObjDriver.get("http://demo.automationtesting.in/Register.html");
		WebElement country_dropdown=ObjDriver.findElement(By.xpath("//*[@id='countries']"));
		Select country=new Select(country_dropdown);
		/*WebElement first_value=skill.getFirstSelectedOption();
		String value=first_value.getText();
		WebElement skill_dropdown1=ObjDriver.findElement(By.id("skill"));
		Select skill1=new Select(skill_dropdown);*/
		/*List<WebElement> dropdown=skill.getOptions();
		int count=0;
		for(int i=0;i<dropdown.size();i++)
		{
		String drop_down_values=dropdown.get(i).getText();
		count++;
		System.out.println("dropdown values are "+ drop_down_values);
		}
		System.out.println(count);
		WebElement first_value1=skill.getFirstSelectedOption();
		String value1=first_value1.getText();*/
		List<WebElement> dropdown=country.getOptions();
		int count=0;
		for(int i=0;i<dropdown.size();i++)
		{
		String drop_down_values=dropdown.get(i).getText();
		count++;
		System.out.println("dropdown values are "+ drop_down_values);
		}
		System.out.println(count);
		WebElement first_value1=country.getFirstSelectedOption();
		String value1=first_value1.getText();
		
	}
}

