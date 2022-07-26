package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    int counter = 0;
    int retryLimit = 3;
    int status = 0;
    //retry limit defines how many times failed testcase need to be retried

    public boolean retry(ITestResult result){
        if(counter < retryLimit){
            counter++;
            return true;
        }
        return false;
    }
}
