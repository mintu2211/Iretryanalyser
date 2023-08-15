package RetryLoginDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesExample {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void TestCase01()
	{
	Assert.assertTrue(false);//test case will fail
	
	}
	
	@Test
	public void TestCase02()
	{
	Assert.assertTrue(false);//test case will fail
	
	}
	
	@Test
	public void TestCase03()
	{
	Assert.assertTrue(true);//test case will fail
	
	}

}
//jitni bhi method ke sath hame retry use karna hai to hum 
//@test me add kar denge
