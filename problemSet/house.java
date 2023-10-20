import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
public class house extends GraphicsProgram{
	public void run(){
		wall();
		door();
		twoWindows();
		anotherTwoWindows();
	    doorHandle();
	    roof();
	    
	    
	    
	}

	private void roof() {
		GLine line = new GLine(200,200,700,200);
	    add(line);
	    GLine firstLine = new GLine (200,200,450,20);
	    add(firstLine);
	    GLine secLine = new GLine (450,20,700,200);
	    add(secLine);
		
	}

	private void doorHandle() {
		GOval myOval = new GOval(10,15);
	    add(myOval,380,480);
	    myOval.setFilled(true);
	    myOval.setColor(Color.WHITE);
		
	}

	private void anotherTwoWindows() {
		GRect Recta =new GRect(80,80);
		add(Recta,250,380);
		Recta.setFilled(true);
		Recta.setColor(Color.WHITE);
		GRect Rectt = new GRect(80,80);
		add(Rectt,570,380);
		Rectt.setFilled(true);
		Rectt.setColor(Color.WHITE);
		
	}

	private void twoWindows() {
		GRect firstRect = new GRect (80,80);
		add(firstRect,250,250);
		firstRect.setFilled(true);
		firstRect.setColor(Color.WHITE);
		GRect yourRect = new GRect (80,80);
		add(yourRect,570,250);
		yourRect.setFilled(true);
		yourRect.setColor(Color.WHITE);
		
	}

	private void door() {
		GRect secondRect = new GRect(160,250);
		add(secondRect,370,350);
		secondRect.setFilled(true);
		secondRect.setColor(Color.BLACK);
		
	}

	private void wall() {
		GRect myRect = new GRect(500,400);
		add(myRect,200,200);
		myRect.setFilled(true);
		myRect.setColor(Color.GREEN);
		
	}

}



