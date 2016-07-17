package main;

public class Rectangle
{
	private Point mTopCorner;
	private Point mBottomCorner;
	
	public Rectangle(Point topCorner, Point bottomCorner)
	{
		mTopCorner = topCorner;
		mBottomCorner = bottomCorner;
	}

	public Point getTopCorner()
	{
		return mTopCorner;
	}

	public Point getBottomCorner()
	{
		return mBottomCorner;
	}

	public void setTopCorner(Point topCorner)
	{
		mTopCorner = topCorner;
	}

	public void setBottomCorner(Point bottomCorner)
	{
		mBottomCorner = bottomCorner;
	}
	
	
	
	

}
