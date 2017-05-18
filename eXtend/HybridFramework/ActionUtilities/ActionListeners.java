package ActionUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ActionListeners implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Test case started" +arg0.getName()+"--at--"+arg0.getStartDate());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
//		try {
//			System.out.println("TestCase Failed, Screenshot Taken. ScreenShot Name= "+arg0.getInstanceName());
//			TakeScreenshot.TakeScrSht(arg0.getInstanceName());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
//		try {
//			System.out.println("TestCase Passed, Screenshot Taken. ScreenShot Name= "+arg0.getInstanceName());
//			TakeScreenshot.TakeScrSht(arg0.getInstanceName());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
