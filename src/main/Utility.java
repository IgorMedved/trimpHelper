package main;

import java.awt.AWTException;
import java.awt.Robot;

import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser;

public class Utility
{
	private final static String TRIMP1 = "Play Trimps, a free online game on Kongregate - Mozilla Firefox";
	private final static String TRIMP2 = "Trimps 3.51 - Mozilla Firefox";
	
	private final static String DESKTOP = "#32769 (Desktop)";
	
	private Robot mRobot;
	private HWND mOtherWindow;
	private HWND mTrimpsHandle;
	
	
	public Utility () throws AWTException 
	{
		mTrimpsHandle = User32.INSTANCE.FindWindow("MozillaWindowClass", TRIMP1); // window
		if (mTrimpsHandle == null)
			mTrimpsHandle = User32.INSTANCE.FindWindow("MozillaWindowClass", TRIMP2);
		if (mTrimpsHandle == null)
		{
			System.err.println("Can't find trimps window");
			System.exit(1);
		}
		
		mOtherWindow = User32.INSTANCE.GetForegroundWindow();
		System.out.println(mOtherWindow);
		
		
		mRobot = new Robot();
		
		User32.INSTANCE.ShowWindow(mTrimpsHandle, WinUser.SW_MAXIMIZE); // SW_RESTORE
		User32.INSTANCE.SetForegroundWindow(mTrimpsHandle);
		
		
		
		
		
		
		
	}

	
	public void refresh()
	{
		System.out.println("Refresh run");
		User32.INSTANCE.ShowWindow(mTrimpsHandle, WinUser.SW_MINIMIZE);
		mRobot.delay(1000);
		User32.INSTANCE.ShowWindow(mTrimpsHandle, WinUser.SW_MAXIMIZE);
	}
}
