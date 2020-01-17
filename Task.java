import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
public class Task
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver ObjDriver=new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com/");
		Scanner scn=new Scanner(System.in);
		ObjDriver.manage().window().maximize();
		ObjDriver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a")).click();
		ObjDriver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a")).click();
		ObjDriver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]/span")).click();
		WebElement Obj111=ObjDriver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a"));
		Obj111.click();
		WebElement Obj2=ObjDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/span"));
		Obj2.click();
		System.out.println(ObjDriver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]")).getText());
		System.out.println("Enter price in dollars");
		System.out.println("Price in INR after converting from dollars is:"+ 71*scn.nextInt());
		WebElement Obj3=ObjDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[1]/button"));
		Obj3.click();
		System.out.println(ObjDriver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]")).getText());
		System.out.println("Enter price in euros");
		System.out.println("Price in INR after converting from euros is:"+ 79*scn.nextInt());
		ObjDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/span")).click();
		WebElement Obj4=ObjDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[2]/button"));
		Obj4.click();
		System.out.println(ObjDriver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]")).getText());
		System.out.println("Enter price in pounds");
		System.out.println("Price in INR after converting from pounds is:"+ 93*scn.nextInt());
		System.out.println("done");
		scn.close();
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		ObjDriver.quit();
	}
}