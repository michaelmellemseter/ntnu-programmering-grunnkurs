import javax.swing.*;
import java.awt.*;

public class SmileyApplet extends JApplet{
	public void init(){
		add(new Tegning());
	}
}

class Tegning extends JPanel{
	public void paintComponent(Graphics tegneflate){
		super.paintComponent(tegneflate);
		setBackground(Color.magenta);
		tegneflate.setColor(Color.yellow);
		tegneflate.fillOval(40, 30, 800, 800);
		tegneflate.setColor(Color.white);
		tegneflate.fillOval(500, 250, 180, 180);
		tegneflate.fillOval(200, 250, 180, 180);
		tegneflate.setColor(Color.cyan);
		tegneflate.fillOval(600, 300, 70, 70);
		tegneflate.fillOval(220, 270, 70, 70);
		tegneflate.setColor(Color.black);
		tegneflate.drawArc(200, 200, 500, 500, -180, 180);

	}
}