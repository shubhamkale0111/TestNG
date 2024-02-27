package AxisQA.TestNG;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class ListnerClass implements ITestListener{

	
		
		@Override
		public void onTestStart(ITestResult result) {
			System.out.println("Testcase execution is started");
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("Testcase is completed successfully");
			
		}

		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("Testcase is failed");
			
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			System.out.println("Testcase is skipped");
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
			System.out.println("Testcase failed with few steps passed");
		
		}

		@Override
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		
	}


