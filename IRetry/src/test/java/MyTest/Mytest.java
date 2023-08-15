package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Analyzer.RetryAnalyzer1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mytest {

	@Test(retryAnalyzer = RetryAnalyzer1.class)
	public void Test1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Assert.assertTrue(true);
		System.out.println("Test 1");
		driver.quit();		

	}

	@Test(retryAnalyzer =RetryAnalyzer1.class )
	public void Test2()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(false);
		System.out.println("Test 2");
		driver.quit();
	}
}
