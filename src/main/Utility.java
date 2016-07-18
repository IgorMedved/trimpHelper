package main;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;

import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser;

public class Utility
{
	private final static String TRIMP1 = "Play Trimps, a free online game on Kongregate - Mozilla Firefox";
	private final static String TRIMP2 = "Trimps 3.51 - Mozilla Firefox";
	
	
	private Robot mRobot;
	private HWND  mTrimpsHandle;
	private Point mScreenTop;
	private Point mScreenBottom;
	
	private long mLastResourceCheck;
	private long mLastWorkerCheck;
	
	
	
	public Utility () throws AWTException 
	{
		this(GeneralPoints.TOP_LEFT, GeneralPoints.BOTTOM_RIGHT);
		
	}
	
	public Utility (Point topCorner, Point bottomCorner) throws AWTException
	{
		mScreenTop = topCorner;
		mScreenBottom = bottomCorner;
		
		mTrimpsHandle = User32.INSTANCE.FindWindow("MozillaWindowClass", TRIMP1); // window
		if (mTrimpsHandle == null)
			mTrimpsHandle = User32.INSTANCE.FindWindow("MozillaWindowClass", TRIMP2);
		if (mTrimpsHandle == null)
		{
			System.err.println("Can't find trimps window");
			System.exit(1);
		}
		
		
		
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
		
		long currentTime = System.currentTimeMillis();
		
		if(currentTime-mLastResourceCheck > 10*60*1000)
		{
			mLastResourceCheck = currentTime;
			checkResources();
		}
		
	}
	
	public void pressButton (Point buttonLocation)
	{
		mRobot.mouseMove(buttonLocation.getX(), buttonLocation.getY());
		mRobot.delay(100);
		mRobot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		mRobot.delay(100);
		mRobot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	public BufferedImage screenPiece(Rectangle rectangle )
	{
		return mRobot.createScreenCapture(rectangle);
	}
	
	private void checkResources()
	{
		if (checkWood())
		{
			pressButton (GeneralPoints.inerpolate)
		}
	}
}
