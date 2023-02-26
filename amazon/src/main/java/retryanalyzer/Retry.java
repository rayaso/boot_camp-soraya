package retryanalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {


    int counter = 0;//if you do not need to retry just set this counter to 3
    int retryLimit = 3;//you could set it as many as you want


    @Override
    public boolean retry(ITestResult iTestResult) {
        if (counter < retryLimit) {
            counter++;
            return true;
        } else {
            return false;
        }
    }


}
