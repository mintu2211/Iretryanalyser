package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer1 implements IRetryAnalyzer {

	
	//counter to keep track of retry attempts
	int counterForRetryAttempts = 0;
	
	//set max limit for retry
	int setMaxLimitforRetry = 1;

	//Method to retry failed test cases
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess())
		{
			if(counterForRetryAttempts < setMaxLimitforRetry)
			{
				counterForRetryAttempts++;
				return true;
			}
		}
		
		
		return false;
	}
}
