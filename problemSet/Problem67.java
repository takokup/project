
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Problem67 extends GraphicsProgram {

    private JTextField text;

    public void init() {
        text = new JTextField(20);
        add(text, SOUTH);
        text.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == text) {
            try {
                GImage image = new GImage(text.getText());
                double x = getWidth() / 2 - image.getWidth() / 2;
                double y = getHeight() / 2 - image.getHeight() / 2;
                add(image, x, y);
            } catch (Exception ex) {
                removeAll();
                add(new GLabel("error"), 20, 20);
            }
            text.setText("");
        }
    }

}
