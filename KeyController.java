import java.awt.event.*;
class KeyController implements KeyListener{
	private Environment environment;
	double sx;
	double sy;
	public KeyController(Environment environment){
		this.environment=environment;
	}
	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			environment.cannon.setRotation(environment.cannon.getRotation()-1);
			environment.repaint();
 			break;
		case KeyEvent.VK_DOWN:
			environment.cannon.setRotation(environment.cannon.getRotation()+1);
			environment.repaint();
			break;
		case KeyEvent.VK_RIGHT:
			environment.cannon.setRotation(environment.cannon.getRotation()+1);
			environment.repaint();
			break;
		case KeyEvent.VK_LEFT:
			environment.cannon.setRotation(environment.cannon.getRotation()-1);
			environment.repaint();
			break;
		case KeyEvent.VK_SPACE:
			environment.moveBall();
			break;
        	}
   	 }
	public void keyReleased(KeyEvent e) {}
}