package week3.day2assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioOnlineShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.ajio.com");
driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys("bags",Keys.ENTER);
driver.findElement(By.xpath("//label[contains(@class,'facet-linkname facet-linkname-genderfilter facet-linkname-Men')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[contains(@class,'facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags')]")).click();
String totalitems=driver.findElement(By.className("length")).getText();
System.out.println("The Total number Items : "+ totalitems);
//driver.findElement(By.xpath("(//span[contains(@class,'facet-left-pane-label')])[4]")).click();
List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
System.out.println("no.of brand name "+brand.size());
System.out.println(" List of Brands ");
for(WebElement value: brand)	{
	String text = value.getText();
	System.out.println(text);
}
List<WebElement> name= driver.findElements(By.xpath("//div[@class='nameCls']"));
int siz = name.size();
System.out.println("No.of bags "+siz);
System.out.println("List of bag name ");
for(WebElement value:name) {
	String text = value.getText();
	System.out.println(text);
	}
driver.close();
}
}