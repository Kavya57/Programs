import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RegisterOne
{
	public static void main(String[] args) 
	{
		Properties objprop=new Properties();
		try 
		{
			objprop.load(new FileInputStream("C:\\Users\\admin\\Desktop\\Testing\\data1.properties"));
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("login name"+ objprop.getProperty("login"));
		System.out.println("password"+objprop.getProperty("pwd"));
		System.setProperty("webdriver.chrome.driver",
				"C://chromedriver.exe");
		WebDriver ObjDriver=new ChromeDriver();
		ObjDriver.get("http://demo.automationtesting.in/Register.html");
		System.out.println("page is loaded");
		String var1=ObjDriver.getTitle();
		System.out.println("title of the page:"+var1);
		WebElement Obj1=ObjDriver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[1]/a"));
		Obj1.click();
		WebElement Obj2=ObjDriver.findElement(By.xpath("//*[@id=\"btn1\"]"));
		Obj2.click();
		WebElement Obj3=ObjDriver.findElement(By.xpath("/html/body/div/div/div[2]/input"));
		Obj3.sendKeys(objprop.getProperty("login"));
		WebElement Obj4=ObjDriver.findElement(By.xpath("/html/body/div/div/div[3]/input"));
		Obj4.sendKeys(objprop.getProperty("pwd"));
		WebElement Obj5=ObjDriver.findElement(By.xpath("//*[@id=\"enterbtn\"]"));
		Obj5.click();
		boolean status=Obj5.isDisplayed();
		WebElement Obj6=ObjDriver.findElement(By.xpath("//*[@id=\"errormsg\"]"));
		System.out.println(Obj6.getText());	   
	}
}
