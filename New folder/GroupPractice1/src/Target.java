import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target {
	
ChromeDriver cr;

public void openbrowser() {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAFSA\\Downloads\\chromedriver_win32/chromeDriver.exe");

ChromeDriver cr = new ChromeDriver();

cr.get("https://www.target.com/");
cr.findElement(By.xpath("//*[@id=\"headerTop\"]/header/nav/ul/li[1]/a")).click();
}

public void personalInfo() throws InterruptedException {
	cr.findElement(By.xpath("//*[@id=\"registrySearchFirstName\"]")).sendKeys("rgvh6tyb");
	cr.findElement(By.xpath("//*[@id=\"registrySearchLastName\"]")).sendKeys("fjhg");
	Thread.sleep(1000);
}
public void click() {
	cr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div[1]/div/div/div/form/div[2]/div[2]/button"));
}
public void quit() throws InterruptedException {
	cr.quit();
	Thread.sleep(2000);
}
}
