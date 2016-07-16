package main;
public class Point
{
	private int mX;
	private int mY;
	
	public static final Point TOP_LEFT = new Point (10,10);
	public static final Point FOOD_BTN = new Point (60,230);
	public static final Point WOOD_BTN = new Point (300,230);
	public static final Point STONE_BTN = new Point (60,350);
	public static final Point SCIENCE_BTN = new Point (300, 350);
	public static final Point BUILD_BTN = new Point (530,420);
	
	public static final Point TRAP = new Point (60,620);
	public static final Point BARN = new Point (160,620);
	
	
	
	public Point (int x, int y)
	{
		set (x,y);
	}
	
	public void set (int x, int y)
	{
		mX= x;
		mY = y;
	}

	public int getX()
	{
		return mX;
	}

	public void setX(int pX)
	{
		mX = pX;
	}

	public int getY()
	{
		return mY;
	}

	public void setY(int pY)
	{
		mY = pY;
	}
	
	public Point add (Point rhs)
	{
		return new Point (mX + rhs.mX, mY+ rhs.mY);
	}
	
	public Point substract(Point rhs)
	{
		return new Point (mX - rhs.mX, mY - rhs.mY);
	}
	
	public static Point copy (Point pCopy)
	{
		return new Point (pCopy.mX, pCopy.mY);
	}
}

