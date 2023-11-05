import acm.graphics.*;
import acm.program.*;

public class problem22 extends GraphicsProgram{
	private static final int NUM = 8;
	public void run() {
		double length = Math.min(getWidth(), getHeight()) / (double)NUM;
		for(int i = 0; i < NUM; i++) {
			for (int j = 0; j < NUM; j++) {
				double x = i * length;
				double y = j * length; 
				boolean isFilled = (i + j) % 2 == 1;
				drawSquare(x, y, length, isFilled);
			}
		}
	}
	
	private void drawSquare(double x, double y, double length, boolean isFilled) {
		GRect square = new GRect(length, length);
		square.setFilled(isFilled);
		add(square, x, y);
	}
}