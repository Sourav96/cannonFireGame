import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.*;
public class Environment extends JPanel{
	Cannon cannon;
	CannonBall cannonBall;
	double sx,sy;
	public Environment(Cannon cannon){
		this.cannon=cannon;
		sx=cannon.getBarrelBall().getX()-cannon.getCannRotationX();
		sy=cannon.getBarrelBall().getY()-cannon.getCannRotationY();
		sx/=10;
		sy/=10;
		this.cannonBall=new CannonBall(cannon.getBarrelBall(),sx,sy);
		this.setFocusable(true);
		this.addKeyListener(new KeyController(this));
		this.setDoubleBuffered(true);
		this.setForeground(Color.GRAY);
	}
	public void moveBall(){
		new Thread(new Runnable(){
			public void run(){
				double height=cannon.getBarrelBall().getY()-cannon.getCannRotationY();	
				height/=400;
				while(cannonBall.getSy()<-sy*20){
					try{
						Thread.sleep(10);
                        		}catch(InterruptedException ie){
						ie.printStackTrace();
					}
					cannonBall.setSy(cannonBall.getSy()+0.0340);
					cannonBall.setSx(cannonBall.getSx()+height);
					cannonBall.setCenter();
					repaint();
				}
			}
		}).start();
	}
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		Rectangle barrel = cannon.getBarrel();
		g2.rotate(Math.toRadians(cannon.getRotation()),cannon.getCannRotationX(),cannon.getCannRotationY());
		Ellipse2D.Double wheel=cannon.getWheel();
		Ellipse2D.Double barrelBall=cannon.getBarrelBall();
		g2.translate(cannon.getCannPositionX(),cannon.getCannPositionY());
		g2.setPaint(new Color(139,69,19));
		g2.fill(barrel);
		g2.translate(cannon.getCannPositionX()*-1,cannon.getCannPositionY()*-1);
		g2.setPaint(Color.RED);
		g2.fill(wheel);
		g2.translate(cannon.getCannPositionX(),cannon.getCannPositionY());
		//g2.draw(barrelBall);
		g2.translate(cannon.getCannPositionX()*-1,cannon.getCannPositionY()*-1);
		g2.setPaint(new Color(139,69,19));	
		g2.fill(cannonBall);
	}
}