package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {


	int   counterForRetryAttempts = 0;
	int   setMaxLimitForRetry =1;

	public boolean retry(ITestResult result){
		if(counterForRetryAttempts<setMaxLimitForRetry)
		{
			counterForRetryAttempts++;
			return true;
		}
		return false;
	}
}
