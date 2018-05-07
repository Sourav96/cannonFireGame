import javax.swing.*;
import java.awt.*;
class Platform extends JFrame{
	private Environment environment;
	private int platformWidth;
	private int platformHeight;
	public Platform(int platformWidth,int platformHeight,Cannon cannon){
		this.setForeground(Color.green);
		this.getContentPane().setBackground(Color.CYAN);
		this.platformWidth=platformWidth;
		this.platformHeight=platformHeight;
		this.setTitle("Cannon fire game");
		this.setSize(platformWidth,platformHeight);
		this.setLocationRelativeTo(null);   
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		environment=new Environment(cannon);
		this.add(environment);
		this.setVisible(true);
	}
}
	