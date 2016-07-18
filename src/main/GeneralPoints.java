package main;

// this class contains the measurements on work screen in kongregate mode
public class GeneralPoints
{
	public static final int ZONE = 0;
	public static final int MAP = 1;
	public static final int CREATE = 2;

	
	// screen size
	
	public static final Point TOP_LEFT = new Point (20, 165);
	public static final Point BOTTOM_RIGHT = new Point(1115,810);
	
	// panel sizes
	
	public static final Point RESOURCE_PANEL_TOP_LEFT = new Point (25, 170);
	public static final Point RESOURCE_PANEL_BOTTOM_RIGHT = new Point (380, 365);
	
	public static final Point POPULATION_PANEL_TOP_LEFT = new Point (475, 170);
	public static final Point POPULATION_PANEL_BOTTOM_RIGHT = new Point (700, 365);
	
	public static final Point STORY_PANEL_TOP_LEFT = new Point (665, 170);
	public static final Point STORY_PANEL_BOTTOM_RIGHT = new Point (115, 365);

	public static final Point BUILDING_PANEL_TOP_LEFT = new Point (25, 377);
	public static final Point BUILDING_PANEL_BOTTOM_RIGHT = new Point (475, 460);
	
	
	public static final Point IMPROVEMENTS_PANEL_TOP_LEFT = new Point (25, 475);
	public static final Point IMPROVEMENTS_PANEL_BOTTOM_RIGHT = new Point (470, 760);
	
	public static final Point ARENA_PANEL_TOP_LEFT = new Point (25, 475);
	public static final Point ARENA_PANEL_BOTTOM_RIGHT = new Point (470, 760);
	
	
	// RESOURCE PANELS
	public static final Point FOOD_PANEL_TOP_LEFT = new Point (25, 170);
	public static final Point FOOD_PANEL_BOTTOM_RIGHT = new Point (190, 265);
	
	public static final Point WOOD_PANEL_TOP_LEFT = new Point (200, 170);
	public static final Point WOOD_PANEL_BOTTOM_RIGHT = new Point (380, 265);
	
	public static final Point STONE_PANEL_TOP_LEFT = new Point (25, 270);
	public static final Point STONE_PANEL_BOTTOM_RIGHT = new Point (190, 365);
	
	public static final Point SCIENCE_PANEL_TOP_LEFT = new Point (200, 265);
	public static final Point SCIENCE_PANEL_BOTTOM_RIGHT = new Point (380, 365);
	
	public static final Point FOOD_BUTTON_TOP = new Point (30,235);
	public static final Point FOOD_BUTTON_BOTTOM = new Point (105,260);
	public static final Point FOOD_BAR_TOP = new Point (25,215);
	public static final Point FOOD_BAR_BOTTOM = new Point (190,230);
	public static final Point WOOD_BUTTON_TOP = WOOD_PANEL_TOP_LEFT.add(FOOD_BUTTON_TOP.substract(FOOD_PANEL_TOP_LEFT));
	public static final Point WOOD_BUTTON_BOTTOM = WOOD_BUTTON_TOP.add(FOOD_BUTTON_BOTTOM.substract(FOOD_BUTTON_TOP));
	public static final Point WOOD_BAR_TOP = WOOD_PANEL_TOP_LEFT.add(FOOD_BAR_TOP.substract(FOOD_PANEL_TOP_LEFT));
	public static final Point WOOD_BAR_BOTTOM = WOOD_BAR_TOP.add(FOOD_BAR_BOTTOM.substract(FOOD_BAR_TOP));
	public static final Point STONE_BUTTON_TOP = STONE_PANEL_TOP_LEFT.add(FOOD_BUTTON_TOP.substract(FOOD_PANEL_TOP_LEFT));
	public static final Point STONE_BUTTON_BOTTOM = STONE_BUTTON_TOP.add(FOOD_BUTTON_BOTTOM.substract(FOOD_BUTTON_TOP));
	
	public static final Point STONE_BAR_TOP = STONE_PANEL_TOP_LEFT.add(FOOD_BAR_TOP.substract(FOOD_PANEL_TOP_LEFT));
	public static final Point STONE_BAR_BOTTOM = STONE_BAR_TOP.add(FOOD_BAR_BOTTOM.substract(FOOD_BAR_TOP));
	
	public static final Point SCIENCE_BUTTON_TOP = new Point (205,330);
	public static final Point SCIENCE_BUTTON_BOTTOM = new Point (285,350);
	
	// population panel
	
	public static final Point TURKIMP_PANEL_TOP = new Point (475, 170);
	public static final Point TURKIMP_PANEL_BOTTOM = new Point (515, 200);
	public static final Point POPULATION_INFO_TOP = new Point(480,200);
	public static final Point POPULATION_INFO_BOTTOM = new Point(655,225);
	public static final Point POPULATION_BAR_TOP = new Point(480,225);
	public static final Point POPULATION_BAR_BOTTOM = new Point(655,250);
	
	// build button
	public static final Point BUILD_BUTTON_TOP = new Point (380,385);
	public static final Point BUILD_BUTTON_BOTTOM = new Point (465,415);
	
	// improvement panel buttons
	
	// improvement tabs
	public static final Point ALL_BUTTON_TOP = new Point (25,475);
	public static final Point ALL_BUTTON_BOTTOM = new Point (90,500);
	
	public static final Point BUILDINGS_BUTTON_TOP = new Point (90,475);
	public static final Point BUILDINGS_BUTTON_BOTTOM = new Point (190,500);
	
	public static final Point JOBS_BUTTON_TOP = new Point (190,475);
	public static final Point JOBS_BUTTON_BOTTOM = new Point (265,500);
	
	public static final Point UPGRADES_BUTTON_TOP = new Point (265,475);
	public static final Point UPGRADES_BUTTON_BOTTOM = new Point (365,500);
	
	public static final Point EQUPMENT_BUTTON_TOP = new Point (365,475);
	public static final Point EQUPMENT_BUTTON_BOTTOM = new Point (470,500);
	
	//improvement quantities
	public static final Point ADD1_BUTTON_TOP = new Point (25,505);
	public static final Point ADD1_BUTTON_BOTTOM = new Point (85,530);
	
	public static final Point ADD10_BUTTON_TOP = new Point (85,505);
	public static final Point ADD10_BUTTON_BOTTOM = new Point (145,530);
	
	public static final Point ADD25_BUTTON_TOP = new Point (145,505);
	public static final Point ADD25_BUTTON_BOTTOM = new Point (210,530);
	
	public static final Point ADD100_BUTTON_TOP = new Point (210,505);
	public static final Point ADD100_BUTTON_BOTTOM = new Point (280,530);
	
	public static final Point ADD_CUSTOM_BUTTON_TOP = new Point (280,505);
	public static final Point ADD_CUSTOM_BUTTON_BOTTOM = new Point (340,530);
	
	public static final Point CUSTOM_BUTTON_TOP = new Point (240,505);
	public static final Point CUSTOM_BUTTON_BOTTOM = new Point (405,530);
	
	public static final Point MAX_BUTTON_TOP = new Point (405,505);
	public static final Point MAX_BUTTON_BOTTOM = new Point (470,530);
	
	
	//JOBS PANEL BUTTONS AND INFO
	
	public static final Point[][] JOBS_BUTTONS = initializeButtons();
	
	private static final Point[][] initializeButtons()
	{
		Point [][] buttons = new Point[8][2];
		
		for (int i = 0; i < 2; i ++)
			for (int j = 0; j < 4; j++)
			{
				buttons[i*4+j][0] = new Point (35 +105*j, 580+35*i);
				buttons[i*4+j][1] = new Point (135 +105*j, 610 +35*i);
			}
		
		return buttons;
				
	}
	
	public static final Point FIRE_BTN_TOP = new Point (360, 545);
	public static final Point FIRE_BTN_BOTTOM = new Point (455, 575);
	
	public static final Point JOBS_INFO_TOP = new Point(155,545);
	public static final Point JOBS_INFO_BOTTOM = new Point(350,580);
	
	
	
//  WORLD INFO
	public static final Point BLOCK_TOP = new Point (590, 395);
	public static final Point BLOCK_BOTTOM = new Point (725, 415);
	public static final Point HEALTH_TOP = new Point (485, 415);
	public static final Point HEALTH_BOTTOM = new Point (780, 435);
	public static final Point ENEMY_DAMAGE_TOP = new Point (805, 395);
	public static final Point ENEMY_DAMAGE_BOTTOM = new Point (905, 415);
	
	
	public static final Point ZONE_INFO_TOP = new Point (485, 435);
	public static final Point ZONE_INFO_BOTTOM = new Point (590, 465);
	
	public static final Point MAP_INFO_TOP = new Point (485, 435);
	public static final Point MAP_INFO_BOTTOM = new Point (590, 485);
	
	private static final Point ARENA_BUTTON = new Point (100,20);
	
	public static Point zoneButton(int buttonNumber, boolean top)
	{
		return arenaButton(buttonNumber, top, ZONE);
	}
	
	public static Point mapButton(int buttonNumber, boolean top)
	{
		return arenaButton(buttonNumber, top, MAP);
	}
	
	
	public static Point createButton (int buttonNumber, boolean top)
	{
		return arenaButton(buttonNumber, top, CREATE);
	}
	
	private static Point arenaButton (int buttonNumber, boolean isTop, int areaType)
	{
		Point button = null;
		
		switch (areaType)
		{
		case ZONE:
			button =  Point.copy (ZONE_INFO_BOTTOM);
			break;
		case MAP:	
			button = Point.copy (MAP_INFO_BOTTOM);
			break;
		case CREATE:
			button = Point.copy (CREATE_INFO_BOTTOM);
			break;
		
		}
		button.add(new Point(0,3));
		
		
		button.setY(button.getY() + (ARENA_BUTTON.getY()+ 3)*buttonNumber);
		
		return isTop? button: button.add(ARENA_BUTTON);
		
	}
	
	
	// create buttons
	
	public static final Point CREATE_BUTTON_TOP = new Point (935, 390);
	public static final Point CREATE_BUTTON_BOTTOM = new Point (1105, 415);
	
	public static final Point RUN_BUTTON_TOP = new Point (765, 500);
	public static final Point RUN_BUTTON_BOTTOM = new Point (820, 525);
	
	public static final Point CREATE_INFO_TOP = new Point (485, 380);
	public static final Point CREATE_INFO_BOTTOM = new Point (585, 410);
	
	
	public static Point interpolate (Point originalTop, Point originalBottom, Point screenTop, Point screenBottom, int percentileLength, int percentileHeight)
	{
		
		int originalLength = - TOP_LEFT.getX() + BOTTOM_RIGHT.getX();
		int originalHeight = - TOP_LEFT.getY() + BOTTOM_RIGHT.getY();
		
		int length = screenBottom.getX() - screenTop.getX();
		int height = screenBottom.getY() - screenTop.getY();
		
		int originalX = originalTop.getX() + (originalBottom.getX() - originalTop.getX())*percentileLength/100;
		int originalY = originalTop.getY() + (originalBottom.getY() - originalTop.getY())*percentileHeight/100;
		
		int x = screenTop.getX()+ originalX*length/originalLength;
		int y = screenTop.getY()+ originalY*height/originalHeight;
		
		
		return new Point (x, y);
	}
	
	public static Point interpolate(Point originalTop, Point originalBottom, Point screenTop, Point screenBottom)
	{
		return interpolate (originalTop, originalBottom, screenTop, screenBottom, 50, 50);
	}
	
}
