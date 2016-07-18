package main;

import java.awt.AWTException;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;





public class App  
{
	private Timer mTimer;
	private Utility mUtility;
	public App() throws AWTException
	{
		mUtility = new Utility();
		System.out.println("myApp constructor is run");
		mTimer = new Timer ();
		
	}
	
	public void startTimer()
	{
		TimerTask task = new TimerTask(){

			@Override
			public void run()
			{
				if (mUtility!=null)
					mUtility.refresh();
				
			}
			
		};
		
		mTimer.schedule(task, 100, 10000);
		System.out.println("Timer is started");
	}

	public static void main(String[] args) throws AWTException
	{
		 App myApp = new App();
		 myApp.startTimer();
		 
		 
		
		

		/*HWND hwnd = User32.INSTANCE.FindWindow("MozillaWindowClass", TRIMP2); // window
																				// title
		Robot robot = new Robot();

		for (int i = 0; i < 60 * 12; i++)
		{
			if (hwnd == null)
			{
				System.out.println("Mozilla is not running");
			} 
			else if (i%60==0)
			{
				char[] windowText = new char[512];
				User32.INSTANCE.GetWindowText(hwnd, windowText, 512);
				String wText = Native.toString(windowText);
				System.out.println("wText: " + wText);
				System.out.println(
						User32.INSTANCE.ShowWindow(hwnd, WinUser.SW_MAXIMIZE)); // SW_RESTORE
				System.out.println(User32.INSTANCE.SetForegroundWindow(hwnd)); // bring
																				// to
																				// front

				
				robot.mouseMove(200, 625); // barn
				robot.delay(200);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.delay(100);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(100);
				robot.mouseMove(330, 625); // shed
				robot.delay(200);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.delay(100);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(100);
				robot.mouseMove(450, 625);
				robot.delay(200);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.delay(100);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(100);

			}
			robot.delay(60000);
		}*/
	}

	
}