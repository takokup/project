import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem39 extends GraphicsProgram {
	private static final int DIAMETER = 100;
	private static final int PAUSE_MS = 5 ;

	public void run() {
		GOval myOval = new GOval(DIAMETER, DIAMETER);
		double x = 0;
		double y = getHeight() / 2 - DIAMETER / 2;
		myOval.setFilled(true);
		add(myOval, x, y);

		int finalX = getWidth() - DIAMETER;
		int vx = 2;
		int vy = 0;
		while (myOval.getX() <= finalX) {

			myOval.move(vx, vy);
			pause(PAUSE_MS);

		}
//		double x1 = getWidth() /2 -DIAMETER;
//		add(myOval,x1 , 0);
//		double vy1 = 2;
//		int finalX1 = getWidth() /2 -DIAMETER;
//		
//		while(myOval.getX() <= finalX1){
//			
//			myOval.move(vx, vy1);
//			pause(PAUSE_MS);
//		}
	}
}
