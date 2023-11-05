import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class problem21 extends GraphicsProgram{
	public void run(){
		for(int i =0;i<10;i++){
			double x = getWidth() / 10 * (i +1);
			double y =0; 
			double y1 = getHeight();
			GLine line = new GLine(x,y,x,y1);
			add (line);
			double x1 = 0;
			double y2 = getHeight() /10 * (i );
			double x2 = getWidth();
			GLine line1 = new GLine(x1,y2,x2,y2);
		    add(line1);
		}
	}
	

}
