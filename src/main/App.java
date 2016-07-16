package main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser;

// https://github.com/twall/jna#readme
//    you need 2 jars : jna-3.5.1.jar and platform-3.5.1.jar

public class App
{

	private final static String TRIMP1 = "Trimps 3.51 - Mozilla Firefox";
	private final static String TRIMP2 = "Play Trimps, a free online game on Kongregate - Mozilla Firefox";

	public static void main(String[] args) throws AWTException
	{

		HWND hwnd = User32.INSTANCE.FindWindow("MozillaWindowClass", TRIMP2); // window
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
		}
	}
}