package positionfinder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

// This class is created to find onScreen coordinates of ui elements form existing design

public class MainFrame extends JFrame
{
	private JPanel mTransparentPanel;

	public MainFrame()
	{
		mTransparentPanel = new JPanel();
		mTransparentPanel.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
		mTransparentPanel.setBackground(new Color (0,0,0,10));
		
		setUndecorated(true);
		setBackground(new Color (0,0,0,20));
		
		System.out.println(isUndecorated());
		
		add(mTransparentPanel, BorderLayout.CENTER);
		
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	    setResizable(true);
		
	    
	    addMouseListener(new MouseAdapter()
		{

			@Override
			public void mousePressed(MouseEvent e)
			{
				if (e.getButton() == MouseEvent.BUTTON1)
				
					System.out.println("Mouse was clicked at (" + e.getX() + ", " + e.getY() + ")");
				else
				{
					System.out.println();
					System.out.println("Next Stage");
					System.out.println();
					
				}
			}
	    	
		});
	}
}
