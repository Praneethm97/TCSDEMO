package UtilLibraries;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshot implements ITestListener {
    public void onTestFailure(ITestResult result) {
        try {
            Commonlibraries.takeScreenshot(result.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
