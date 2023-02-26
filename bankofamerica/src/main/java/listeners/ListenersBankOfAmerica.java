package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersBankOfAmerica implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("start test ..........."+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("test passed......."+result.getName());    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("test failure......"+result.getName());    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("skipped test....."+result.getName());    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("start test execution......"+context.getName());
    }

    @Override
    public void onFinish(ITestContext arg) {
        System.out.println("finish test execution........."+arg.getName());
    }
}
