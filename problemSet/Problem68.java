
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Problem68 extends GraphicsProgram{
	
	private JTextField txt;
	private JButton button;
	private int y = 40;
	public void init(){
		txt = new JTextField(20);
		add(txt, SOUTH);
		button = new JButton("Enter");
		add(button, SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == txt || e.getSource() == button){
			String text = txt.getText();
			if(text == null || text.equals("")){
				return;
			}
			int x = 40;
			add(new GLabel(text), x, y);
			y += 40;
			txt.setText("");
		}
	}

}