//En smiley
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Vindu extends JFrame{
	public Vindu(String tittel){
		setTitle(tittel);
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tegning tegningen = new Tegning();
		add(tegningen);
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

class Smiley{
	public static void main(String[]args){
		Vindu etVindu = new Vindu("En Smiley");
		etVindu.setVisible(true);
	}
}