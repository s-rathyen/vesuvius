// FUNCTIONS CLASS WRITTEN BY SOPHIA RATHYEN

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

// THIS CLASS HAS FUNCTIONS + VARIABLES THAT WERE USED IN THE MAIN
// THE MAIN INHERITS FROM THIS CLASS (FUNCTIONS)

public class Functions {
	
	
	/* VARIABLES ------------------------------------------------------- */
	
	public static int BLOB_SPEED = 3;
	static final int POINTS_FOR_L2 = 8;
	static final int POINTS_FOR_L3 = 12;
	static final int NUMBER_OF_FB = 6;
	static final int BUY_SLOW = 1;
	static final int FB_DAMAGE = 2;
	static final int SCREEN_WIDTH = 1152;
	static final int SCREEN_HEIGHT = 768;
	public static boolean inJump;
	public static FileReader fR;
	public static Scanner fS;
	public static int width;
	public static int height;
	public static String skip;
	public static int screenW;
	public static int screenH;
	public static int counter;
	public static EZImage[] wall = new EZImage[1000];
	public static boolean stepped;
	public static int counter2;
	static final int JUMPHEIGHT = 20;
	public static int jumpCounter = 0;
	public static EZImage lava;
	public static int wallX;
	public static int wallY;
	public static int gameMode;
	static final int MODE_ONE = 1;
	static final int MODE_TWO = 2;
	public static EZImage item;
	public static Random rg;
	public static int foo;
	public static int r;
	public static int s;
	public static int blobSpawn;
	public static int a;
	public static int b;
	public static boolean jumpUp = false;
	public static EZSound glory;
	public static int record = 0;
	public static LavaBlob blob;
	public static boolean blobFall;
	public static boolean blobBoundL;
	public static boolean blobBoundR;
	public static int blobTurn = 0;
	public static int numRandomTurns;
	public static int jumpHeight = 150;
	public static int jumpC = 0;
	public static int mode;
	static final int CHAPTER_ONE = 1;
	static final int CHAPTER_TWO = 2;
	public static EZImage potion;
	public static boolean potionR = true;
	public static EZImage potion2;
	public static boolean potionZ = true;
	public static long timeSinceP2Used;
	public static long timeSincePotion2;
	public static long timeSinceFUsed;
	public static boolean q = true;
	public static int numPotions = 0;
	public static long timeSincePotion;
	public static long timeSincePUsed;
	public static int numPotions2 = 0;
	public static EZImage caldera;
	public static long timeSincePoison;
	public static boolean steppedInPoison = false;
	public static long timeSinceStepped;
	public static EZImage arrow;
	public static boolean abc = false;
	public static boolean qr = true;
	public static boolean vr = true;
	static final int STAND = 1;
	static final int JUMP = 2;
	static final int LAND = 3;
	static final int HOVER = 4;
	public static int heroState = STAND;
	public static boolean slow = false;
	static final int jumpHt = 45;
	int jumpCounter22 = 0;
	public static boolean ok = true;
	public static boolean changedImg = false;
	public static Hero myHero;
	public static EZText track;
	public static EZText track2;
	public static EZText track3;
	public static EZText track4;
	public static EZText track5;
	public static EZText track6;
	public static ArrayList<Fireball> fb;
	public static boolean top = false;
	public static boolean top2 = false;
	public static boolean g = false;
	public static boolean check = false;
	public static EZText title;
	public static EZText one;
	public static int hbWidth;
	public static int hbHeight;
	public static int hbX;
	public static int hbY;
	public static EZRectangle qu;
	public static EZRectangle qz;
	public static boolean increase = false;
	public static boolean increase2 = false;
	public static boolean busy;
	public static boolean lavaTriggered = false;
	public static int record2;
	public static boolean down = false;
	public static boolean down2 = false;
	public static int p1tempX;
	public static int p1tempY;
	public static int p2tempX;
	public static int p2tempY;
	public static int itemTempX;
	public static int itemTempY;
	public static boolean hidden = false;
	public static long slowStart;
	public static Color heroColor = new Color(66, 134, 244);
	public static EZText aa;
	public static EZText ab;
	public static EZText ac;
	public static EZText aq;
	
	/* FUNCTIONS FOR INTRO SCREENS ------------------------------------------------------- */

	public static void makeIntroScreen() {
		EZ.initialize(SCREEN_WIDTH, SCREEN_HEIGHT);
		glory = EZ.addSound("glory.wav");
		glory.loop();
		EZImage start = EZ.addImage("start.png", SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);
		title = EZ.addText("november.ttf", SCREEN_WIDTH - 150, 100, "VESUVIUS", Color.WHITE, 50);
		one = EZ.addText("november.ttf", SCREEN_WIDTH - 150, 170, "you are a water god", Color.WHITE, 20);
		aa = EZ.addText("november.ttf", SCREEN_WIDTH - 150, 200, "taken captive by fire gods", Color.WHITE, 20);
		ab = EZ.addText("november.ttf", SCREEN_WIDTH - 150, 230, "and trapped in a volcano.", Color.WHITE, 20);
		aq = EZ.addText("november.ttf", SCREEN_WIDTH - 150, 260, "escape before it erupts.", Color.WHITE, 20);
		ac = EZ.addText("november.ttf", SCREEN_WIDTH - 150, 310, "PRESS SPACE TO BEGIN", Color.WHITE, 20);
	}

	public static void titleHover() {
		int rmax = 100 - 10;
		int rmin = 100 + 10;
		if (title.getYCenter() > rmax && top2 == false) {
			title.yCenter = title.yCenter - 1;
		}
		if (title.getYCenter() == rmax && top2 == false) {
			top2 = true;
		}
		if (title.getYCenter() < rmin && top2 == true) {
			title.yCenter = title.yCenter + 1;
		}
		if (title.getYCenter() == rmin && top2 == true) {
			top2 = false;
			System.out.println("x");
		}
	}

	public static void makeInstructionScreen() {
		EZ.removeEZElement(aa);
		EZ.removeEZElement(ab);
		EZ.removeEZElement(ac);
		EZ.removeEZElement(title);
		EZ.removeEZElement(one);
		EZ.removeEZElement(aq);
		EZText title2 = EZ.addText("november.ttf", SCREEN_WIDTH - 200, 100, "INSTRUCTIONS", Color.WHITE, 50);
		EZText one = EZ.addText("november.ttf", SCREEN_WIDTH - 200, 170, "a = left", Color.WHITE, 20);
		EZText two = EZ.addText("november.ttf", SCREEN_WIDTH - 200, 200, "d = right", Color.WHITE, 20);
		EZText three = EZ.addText("november.ttf", SCREEN_WIDTH - 200, 230, "space = jump", Color.WHITE, 20);
		EZText four = EZ.addText("november.ttf", SCREEN_WIDTH - 200, 260, "blue orbs = level up", Color.WHITE, 20);
		EZText five = EZ.addText("november.ttf", SCREEN_WIDTH - 200, 290, "blue potions = freeze enemies", Color.WHITE,
				20);
		EZText six = EZ.addText("november.ttf", SCREEN_WIDTH - 200, 320, "freezing costs one potion", Color.WHITE, 20);
		EZText eight = EZ.addText("november.ttf", SCREEN_WIDTH - 200, 350, "use the f key to freeze enemies",
				Color.WHITE, 20);
		EZText nine = EZ.addText("november.ttf", SCREEN_WIDTH - 200, 380, "avoid pink potions:", Color.WHITE, 20);
		EZText ten = EZ.addText("november.ttf", SCREEN_WIDTH - 200, 410, "they will make your enemies faster",
				Color.WHITE, 20);
		EZText eleven = EZ.addText("november.ttf", SCREEN_WIDTH - 200, 460, "PRESS SPACE TO BEGIN", Color.WHITE, 20);
	}

	/* FUNCTIONS FOR ENDING SCREENS ------------------------------------------------------- */
	
	public static void makeEndScreen() {
		EZ.removeAllEZElements();
		EZImage start = EZ.addImage("start.png", SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);
		EZText end = EZ.addText(SCREEN_WIDTH - 150, 100, "YOU ESCAPED.", Color.WHITE, 20);
	}

	public static void dS() {
		EZ.removeAllEZElements();
		EZImage start = EZ.addImage("start.png", SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);
		EZText end = EZ.addText(SCREEN_WIDTH - 150, 100, "YOU DIED.", Color.WHITE, 20);
	}

	/* FUNCTIONS FOR LEVELS ------------------------------------------------------- */
	
	// INITIALIZES THE BACKGROUND 
	public static void initialize() {
		EZ.removeAllEZElements();
		EZImage backdrop = EZ.addImage("lava.jpg", SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);
		EZImage backdrop2 = EZ.addImage("lava.jpg", SCREEN_WIDTH / 2 - 892, SCREEN_HEIGHT / 2);
		EZImage backdrop3 = EZ.addImage("lava.jpg", SCREEN_WIDTH / 2 + 892, SCREEN_HEIGHT / 2);
		lava = EZ.addImage("abc.png", SCREEN_WIDTH / 2, SCREEN_HEIGHT + 200);

	}
	
	// READS THE FILE THAT HAS THE PLATFORMS
	public static void read() throws java.io.IOException {
		fR = new FileReader("background2.txt");
		fS = new Scanner(fR);
		width = fS.nextInt();
		height = fS.nextInt();
		skip = fS.nextLine();
		screenW = width * 32;
		screenH = height * 32;
		System.out.println("Screen Dimensions: " + screenW + " x " + screenH);
	}

	// DUPLICATE THAT READS A SECOND FILE WITH PLATFORMS
	public static void read2() throws java.io.IOException {
		fR = new FileReader("background4.txt");
		fS = new Scanner(fR);
		width = fS.nextInt();
		height = fS.nextInt();
		skip = fS.nextLine();
		screenW = width * 32;
		screenH = height * 32;
		System.out.println("Screen Dimensions: " + screenW + " x " + screenH);
	}

	// MAKES WALLS FROM THE GIVEN FILE
	public static void makeWalls2() {
		counter = 0;
		for (int row = 0; row < height; row++) {
			skip = fS.nextLine();
			System.out.println(skip);
			for (int column = 0; column < width; column++) {
				char ch = skip.charAt(column); 
				if (ch == '#') {
					wall[counter] = EZ.addImage("block2.jpeg", column * 32 + 10, row * 32 + 10);
					counter++;
				}
			}
		}
		System.out.println("Number of walls generated: " + counter);

	}

	// MAKES WALLS FROM THE GIVEN FILE
	public static void makeWalls() {
		counter = 0;
		for (int row = 0; row < height; row++) {
			skip = fS.nextLine();
			System.out.println(skip);
			for (int column = 0; column < width; column++) {
				char ch = skip.charAt(column); // Retrieve the character at position "column" of the inputText.
				if (ch == '#') {
					wall[counter] = EZ.addImage("block2.jpeg", column * 32 + 10, row * 32 + 10);
					counter++;
				}
			}
		}
		System.out.println("Number of walls generated: " + counter);
	}

	// RETURNS MOUSE POSITION IF CLICKED (USED TO FIND X, Y)
	public static void returnMouse() {
		if (EZInteraction.wasMouseLeftButtonReleased()) {
			System.out.println("X: " + EZInteraction.getXMouse() + "Y: " + EZInteraction.getYMouse());
		}
	}

	// FUNCTION THAT HOLDS MISC VARIABLES + OTHER FUNCTIONS THAT ARE ALWAYS RUNNING
	public static void alwaysTrue() {
		blobFall = true;
		jumpUp = true;
		myHero.processStates();
		myHero.go();
		returnMouse();
		stepped = false;
		for (int i = 0; i < counter; i++) {
			if (myHero.isInside(wall[i].getXCenter(), wall[i].getYCenter() - 20)) {
				stepped = true;
			}
		}
		if (EZInteraction.isKeyDown('w') || EZInteraction.isKeyDown(KeyEvent.VK_SPACE)) {
			stepped = true;
		}
		if (inJump == true) {
			stepped = true;
		}
		if (stepped == false) {
			myHero.fall(9);
		}
	}

	// FUNCTION THAT SPAWNS THE LAVABLOB ON TOP OF A WALL (1)
	// ALSO CREATES 'GRAVITY' FOR LAVABLOB AND MAKES IT FALL IF NOT STANDING ON A WALL (2)
	// ALSO TRANSPORTS AN ITEM TO BE ON TOP OF A NEW WALL IF IT IS COLLECTED (3)
	
	public static void alwaysTrue2() {
		// (1)
		if (gameMode == MODE_ONE) {
			foo = rg.nextInt(counter);
			r = wall[foo].getXCenter();
			s = wall[foo].getYCenter();
			item = EZ.addImage("orb2.png", r, s - 70);
			blobSpawn = rg.nextInt(counter);
			a = wall[blobSpawn].getXCenter();
			b = wall[blobSpawn].getYCenter();
			blob = new LavaBlob(a, b - 50);
			gameMode = MODE_TWO;
		}
		// (3)
		if (item.isPointInElement(myHero.getX(), myHero.getY())) {
			foo = rg.nextInt(counter);
			r = wall[foo].getXCenter();
			s = wall[foo].getYCenter();
			item.translateTo(r, s - 70);
			record++;
			track.setMsg("ORBS: " + record + " / " + POINTS_FOR_L2);
		}
		// (2)
		for (int i = 0; i < counter; i++) {
			if (blob.isInside(wall[i].getXCenter(), wall[i].getYCenter() - 20)) {
				blobFall = false;
			}
		}
		if (blobFall == true) {
			blob.fall(9);
		}

	}
	
	// DUPLICATE FUNCTION BECAUSE OF LINE (A)

	public static void alwaysTrue3() {
		if (gameMode == MODE_ONE) {
			foo = rg.nextInt(counter);
			r = wall[foo].getXCenter();
			s = wall[foo].getYCenter();
			item = EZ.addImage("orb2.png", r, s - 70);
			blobSpawn = rg.nextInt(counter);
			a = wall[blobSpawn].getXCenter();
			b = wall[blobSpawn].getYCenter();
			blob = new LavaBlob(a, b - 50);
			gameMode = MODE_TWO;
		}

		if (item.isPointInElement(myHero.getX(), myHero.getY())) {
			foo = rg.nextInt(counter);
			r = wall[foo].getXCenter();
			s = wall[foo].getYCenter();
			item.translateTo(r, s - 70);
			record++;
			// SEE LINE (A) BELOW: SETS ORBS FOR LEVEL TWO TO BE # / 12
			// INSTEAD OF # / 8 LIKE IN LEVEL ONE 
			track.setMsg("ORBS: " + record + " / " + POINTS_FOR_L3);
		}

		for (int i = 0; i < counter; i++) {
			if (blob.isInside(wall[i].getXCenter(), wall[i].getYCenter() - 20)) {
				blobFall = false;
			}
		}

		if (blobFall == true) {
			blob.fall(9);
		}

	}
	
	
	// FUNCTION THAT DETERMINES HOW BLOB BEHAVES + WHERE IT CAN MOVE 

	public static void blobBoundaries() {
		int q = rg.nextInt(4) + 1;
		int w = rg.nextInt(2) + 1;
		if (blob.getY() <= 394) {
			if (blobBoundL == true && blobBoundR == false) {
				blob.moveLeft(BLOB_SPEED);
			}

			if (blob.getX() <= 94) {
				blobTurn++;
				// if (blobTurn >= 4) {
				if (blobTurn >= q) {
					blob.moveUp(170);
					blobTurn = 0;
				} else {
					blobBoundL = false;
					blobBoundR = true;
				}

			}

			if (blob.getX() >= 975) {
				blobTurn++;
				// if (blobTurn >= 4) {
				if (blobTurn >= q) {
					blob.moveUp(170);
					blobTurn = 0;
				} else {
					blobBoundL = true;
					blobBoundR = false;
				}
			}

			if (blobBoundL == false && blobBoundR == true) {
				blob.moveRight(BLOB_SPEED);
			}
		} else {
			if (blobBoundL == true && blobBoundR == false) {
				blob.moveLeft(BLOB_SPEED);
			}

			if (blob.getX() <= 415) {
				blobTurn++;
			
				if (blobTurn >= w) {
					blob.moveUp(150);
				} else {
					blobBoundL = false;
					blobBoundR = true;
				}

			}

			if (blob.getX() >= 754) {
				blobTurn++;
				if (blobTurn >= w) {
					blob.moveUp(150);
				} else {
					blobBoundL = true;
					blobBoundR = false;
				}
			}

			if (blobBoundL == false && blobBoundR == true) {
				blob.moveRight(BLOB_SPEED);
			}
		}
	}
	
	// FUNCTION THAT DETERMINES HOW POTION BEHAVES, WHEN THEY SPAWN, ETC.
	// CONTROLS BOTH GOOD + BAD POTION BEHAVIOR

	public static void potionBehavior() {

		if (numPotions2 <= 0) {
			if (System.currentTimeMillis() - timeSincePotion2 >= 7000 && potionZ == true) {
				foo = rg.nextInt(counter);
				r = wall[foo].getXCenter();
				s = wall[foo].getYCenter();
				potion2 = EZ.addImage("potion.png", r, s - 70);
				potionZ = false;
				down2 = true;
			}
		}

		if (numPotions2 >= 1 || down2 == true) {

			if (potion2.isPointInElement(myHero.getX(), myHero.getY()) && potionZ == false) {
				timeSincePotion2 = System.currentTimeMillis();
				numPotions2++;
				steppedInPoison = true;
				potionZ = true;
				EZ.removeEZElement(potion2);

			}

		}

		if (System.currentTimeMillis() - timeSincePotion >= 3000 && potionR == true) {
			foo = rg.nextInt(counter);
			r = wall[foo].getXCenter();
			s = wall[foo].getYCenter();
			potion = EZ.addImage("p4.png", r, s - 70);
			// numPotions++;
			potionR = false;
			down = true;
		}

		if (numPotions >= 1 || down == true) {

			if (potion.isPointInElement(myHero.getX(), myHero.getY()) && potionR == false) {
				timeSincePotion = System.currentTimeMillis();
				if (hbWidth <= 80) {
					increase = true;
				}
				if (hbWidth <= 99 && hbWidth > 80) {
					increase2 = true;
				}
				numPotions++;
				potionR = true;
				EZ.removeEZElement(potion);
				track2.setMsg("POTIONS: " + numPotions);

			}
		}

		if (increase == true) {
			hbWidth = hbWidth + 20;
			hbX = hbX + 20 / 2;
			qu.setWidth(hbWidth);
			qu.translateTo(hbX, hbY);
			increase = false;
		}

		if (increase2 == true) {
			hbWidth = 100;
			hbX = 100;
			qu.setWidth(hbWidth);
			qu.translateTo(hbX, hbY);
			increase2 = false;
		}


		if (numPotions >= 2 && EZInteraction.wasKeyPressed(KeyEvent.VK_ENTER)) {
			busy = true;
			BLOB_SPEED = 1;
			blob.setImage("blob2.png");
			numPotions -= 2;
			track2.setMsg("POTIONS: " + numPotions);
			timeSincePUsed = System.currentTimeMillis();
		}

		if (numPotions >= 1 && EZInteraction.wasKeyPressed('f')) {
			busy = true;
			BLOB_SPEED = 0;
			blob.setImage("blob3.png");
			numPotions -= 1;
			track2.setMsg("POTIONS: " + numPotions);
			timeSinceFUsed = System.currentTimeMillis();
		}
		if (busy == false) {
			if (steppedInPoison == true) {
				BLOB_SPEED = 7;
				// blob.back();
				timeSinceStepped = System.currentTimeMillis();

			}
		}

		if (System.currentTimeMillis() - timeSinceStepped >= 5000) {
			BLOB_SPEED = 3;
			blob.back();
			steppedInPoison = false;
			timeSinceStepped = System.currentTimeMillis();
		}

		if (System.currentTimeMillis() - timeSinceFUsed >= 10000) {
			busy = false;
			BLOB_SPEED = 3;
			blob.back();
			timeSinceFUsed = System.currentTimeMillis();
		}

		if (System.currentTimeMillis() - timeSincePUsed >= 10000) {
			busy = false;
			BLOB_SPEED = 3;
			blob.back();
			timeSincePUsed = System.currentTimeMillis();
		}

		System.out.println(steppedInPoison);

	}

	// INITIALIZES FOR THE SECOND LEVEL
	public static void initialize2() {
		rg = new Random();
		fb = new ArrayList<Fireball>();
		track = EZ.addText(100, 50, "ORBS: " + record + " / " + POINTS_FOR_L2, Color.WHITE, 20);
		track2 = EZ.addText(100, 80, "POTIONS: " + numPotions, Color.WHITE, 20);
		track3 = EZ.addText(100, 110, "press f to use potions", Color.WHITE, 12);
		track4 = EZ.addText(100, 125, "press a to move left,", Color.WHITE, 12);
		track5 = EZ.addText(100, 140, "press d to move right", Color.WHITE, 12);
		track6 = EZ.addText(100, 155, "press space to jump", Color.WHITE, 12);
		myHero = new Hero(577, 30);
		blobBoundL = true;
		blobBoundR = false;
		gameMode = MODE_ONE;
		mode = CHAPTER_ONE;
		timeSincePotion = System.currentTimeMillis();
		timeSincePotion2 = System.currentTimeMillis();
	}

	
	// FUNCTION THAT HIDES ITEMS AFTER THE FIRST LEVEL UNTIL YOU JUMP UP TO THE SECOND
	// TO PREVENT YOU FROM STAYING ON THAT LEVEL FOREVER
	
	public static void hider() {
		
		if (record >= POINTS_FOR_L2 && hidden == false) {

			p1tempX = potion.getXCenter();
			p1tempY = potion.getYCenter();
			potion.translateTo(-100, -100);

			p2tempX = potion2.getXCenter();
			p2tempY = potion2.getYCenter();
			potion2.translateTo(-100, -100);

			itemTempX = item.getXCenter();
			itemTempY = item.getYCenter();
			item.translateTo(-100, -100);

			blob.setPosition(-1000, -1000);

			hidden = true;
		}
	}

	// FUNCTION THAT REVEALS ITEMS ONCE YOU GET TO THE NEXT LEVEL
	public static void reveal() {
		if (hidden == true) {
			potion.translateTo(p1tempX, p1tempY);
			potion2.translateTo(p2tempX, p2tempY);
			item.translateTo(itemTempX, itemTempY);
		}
	}
	
	// FUNCTION THAT DRAWS FLOATING ARROWS WHEN MAX POINTS FOR LEVEL
	// HAS BEEN REACHED 

	public static void arrowMaker() {
		if (record >= POINTS_FOR_L2 && qr == true) {
			arrow = EZ.addImage("arrow.png", SCREEN_WIDTH / 2, 50);
			qr = false;
			g = true;
		}
		// NTS: POINTS FOR L3 MUST BE GREATER THAN POINTS FOR L2
		// OR VARIABLE MUST BE CHANGED
		if (record >= POINTS_FOR_L3 && vr == true) {
			arrow = EZ.addImage("arrow.png", SCREEN_WIDTH / 2, 50);
			vr = false;
			g = true;
		}
		int rmax = 50 - 20;
		int rmin = 50 + 20;
		if (g == true) {
			if (arrow.getYCenter() > rmax && top == false) {
				arrow.yCenter = arrow.yCenter - 1;
			}
			if (arrow.getYCenter() == rmax && top == false) {
				top = true;
			}
			if (arrow.getYCenter() < rmin && top == true) {
				arrow.yCenter = arrow.yCenter + 1;
			}
			if (arrow.getYCenter() == rmin && top == true) {
				top = false;
				System.out.println("x");
			}

		}

	}

	// OBSOLETE FUNCTION THAT WAS REPLACED BY SWITCHER
	// KEEPING JUST IN CASE
	public static void switchOrig() throws java.io.IOException {
		if (record >= POINTS_FOR_L2 && myHero.getY() <= 50 && abc == false) {
			mode = CHAPTER_TWO;
			jumpUp = true;
			heroState = LAND;
			int s = myHero.getX();
			myHero.positionHero(s, SCREEN_HEIGHT - 170);
			for (int i = 0; i < counter; i++) {
				EZ.removeEZElement(wall[i]);
			}
			EZ.removeEZElement(lava);
			read2();
			makeWalls2();
			record = 0;
			track.setMsg("ORBS: " + record + " / " + POINTS_FOR_L3);
			EZ.removeEZElement(arrow);
			abc = true;
			for (int i = 0; i < 4; i++) {
				int f = rg.nextInt(SCREEN_WIDTH) + 3;
				fb.add(i, new Fireball(f, SCREEN_HEIGHT));
				System.out.println(fb.size());
				ok = false;

			}

		}
	}

	// SWITCHES THINGS FOR LEVEL 2
	public static void switcher() throws java.io.IOException {
		mode = CHAPTER_TWO;
		jumpUp = true;
		heroState = LAND;
		int s = myHero.getX();
		myHero.positionHero(s, SCREEN_HEIGHT - 170);
		for (int i = 0; i < counter; i++) {
			EZ.removeEZElement(wall[i]);
		}
		lava.translateTo(-1000, -1000);
		read2();
		makeWalls2();
		record = 0;
		track.setMsg("ORBS: " + record + " / " + POINTS_FOR_L3);
		EZ.removeEZElement(arrow);
		abc = true;
		for (int i = 0; i < NUMBER_OF_FB; i++) {
			int f = rg.nextInt(SCREEN_WIDTH) + 3;
			fb.add(i, new Fireball(f, SCREEN_HEIGHT));
			System.out.println(fb.size());
			ok = false;
		}

	}

	// MAKES FIREBALLS MOVE UP ACROSS THE SCREEN
	public static void fireballsMove() {
		if (ok == false) {
			for (int i = 0; i < NUMBER_OF_FB; i++) {
				int f = rg.nextInt(4) + 1;
				fb.get(i).moveUp(f);

				if (fb.get(i).getY() <= 20) {
					fb.get(i).setPos(rg.nextInt(SCREEN_WIDTH), SCREEN_HEIGHT);

				}

				if (myHero.isInside(fb.get(i).getX(), fb.get(i).getY())) {
					hbWidth = hbWidth - FB_DAMAGE;
					hbX = hbX - FB_DAMAGE / 2;
					qu.setWidth(hbWidth);
					qu.translateTo(hbX, hbY);
				}

			}

		}

	}

	// CHECKS IF PLAYER FROZE FIREBALLS
	// IF SO, REPLACES THEM WITH FROZEN IMAGE FOR A GIVEN AMOUNT OF TIME
	// (5 SECONDS) 
	public static void fbCheck() {
		if (numPotions >= BUY_SLOW) {
			if (EZInteraction.wasKeyPressed('f')) {
				slow = true;
				q = true;
				numPotions -= BUY_SLOW;
				track2.setMsg("POTIONS: " + numPotions);
			}
		}
		if (slow == true) {
			for (int i = 0; i < NUMBER_OF_FB; i++) {
				fb.get(i).setImg();
				fb.get(i).moveUp(1);
				slowStart = System.currentTimeMillis();
			}

			slow = false;
		}
		if (System.currentTimeMillis() - slowStart >= 5000) {
			for (int i = 0; i < NUMBER_OF_FB; i++) {
				int f = rg.nextInt(4) + 1;
				fb.get(i).moveUp(f);
				changedImg = true;
			}
			if (changedImg == true && q == true) {
				for (int i = 0; i < NUMBER_OF_FB; i++) {
					fb.get(i).revertImg();
					q = false;
				}
			}

		}
	}

	// IF THE PLAYER HITS MAX POINTS FOR LEVEL 2 AND ARE STANDING ABOVE 450PX
	// TRIGGERS THE VOLCANO TO ERUPT
	// LAVA RISES TO MAKE PLAYER RUN AWAY
	public static void erupt() {
		if (record >= POINTS_FOR_L3 && myHero.getY() <= 450 && check == false) {
			lavaTriggered = true;
			check = true;
		}
		if (lavaTriggered == true) {
			lava = EZ.addImage("abc.png", SCREEN_WIDTH / 2, SCREEN_HEIGHT + 400);
			System.out.println("TRIGGERED");
			lavaTriggered = false;
		}
		lava.translateTo(SCREEN_WIDTH / 2, lava.getYCenter() - 1);
	}

	// FUNCTION THAT DRAWS HEALTH BAR 
	
	public static void healthBar() {
		hbX = 100;
		hbY = 20;
		hbWidth = 100;
		hbHeight = 20;
		qu = EZ.addRectangle(hbX, hbY, hbWidth, hbHeight, heroColor, true);
		qz = EZ.addRectangle(hbX, hbY, hbWidth, hbHeight, Color.BLUE, false);
		EZText health = EZ.addText(100, 20, "HEALTH", Color.WHITE);

	}

	// FUNCTION THAT CHECKS IF BLOB IS INSIDE HERO, IF SO
	// DEDUCTS HEALTH FROM HERO 
	public static void checkBlob() {
		if (blob.isInside(myHero.getX(), myHero.getY())) {
			hbWidth = hbWidth - FB_DAMAGE;
			hbX = hbX - FB_DAMAGE / 2;
			qu.setWidth(hbWidth);
			qu.translateTo(hbX, hbY);
		}

	}

	// THIS MAIN NOT IN USE
	// KEEPING JUST IN CASE
	// MAIN.JAVA HAS THE MAIN PROGRAM
	public static void main(String[] args) throws java.io.IOException {
		initialize();
		read();
		makeWalls();
		initialize2();
		while (true) {
			returnMouse();
			alwaysTrue();
			alwaysTrue2();
			blobBoundaries();
			arrowMaker();
			if (record >= 50 && myHero.getY() <= 50) {
				// System.out.println("TESTING");
				mode = CHAPTER_TWO;
			}
			potionBehavior();
			switchOrig();
			fireballsMove();
			EZ.refreshScreen();
		}
	}

}
