package positionfinder;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

public class App
{
	public static void main(String[] args) throws InvocationTargetException, InterruptedException
	{
		SwingUtilities.invokeAndWait(new Runnable(){
			public void run()
			{
				MainFrame frame = new MainFrame();
			}
		});
				
	}
}
