import java.awt.*;
import java.awt.geom.*;
class Cannon{
	private int cannPositionX;
	private int cannPositionY;
	private int cannRotationX;
	private int cannRotationY;
	private double rotation;
	private Ellipse2D.Double wheel;
	private Rectangle barrel;
	private Ellipse2D.Double barrelBall;
	public Cannon(){
		this.cannPositionX=45;
		this.cannPositionY=620;
		this.cannRotationX=40;
		this.cannRotationY=630;
		this.rotation=0;
		barrel=new Rectangle(60, 20);
		wheel=new Ellipse2D.Double(10,600,60,60);
		barrelBall=new Ellipse2D.Double(85,620,20,20);
	}	
	public Cannon(int cannPositionX,int cannPositionY,int cannRotationX,int cannRotationY){
		this.cannPositionX=cannPositionX;
		this.cannPositionY=cannPositionY;
		this.cannRotationX=cannRotationX;
		this.cannRotationY=cannRotationY;
		this.rotation=0;
		barrel=new Rectangle(60, 20);
		wheel=new Ellipse2D.Double(10,600,60,60);
		barrelBall=new Ellipse2D.Double(85,620,20,20);
	}
	int getCannPositionX(){return cannPositionX;}
	int getCannPositionY(){return cannPositionY;}
	int getCannRotationX(){return cannRotationX;}
	int getCannRotationY(){return cannRotationY;}
	double getRotation(){return rotation;}
	Ellipse2D.Double getWheel(){return wheel;}
	Ellipse2D.Double getBarrelBall(){return barrelBall;}
	Rectangle getBarrel(){return barrel;}
	void setBarrel(Rectangle barrel){this.barrel=barrel;}
	void setWheel(Ellipse2D.Double wheel){this.wheel=wheel;}
	void setBarrelBall(Ellipse2D.Double barrelBall){this.barrelBall=barrelBall;}
	void setCannPositionX(int cannPositionX){this.cannPositionX=cannPositionX;}
	void setCannPositionY(int cannPositionY){this.cannPositionY=cannPositionY;}
	void setRotation(double rotation){this.rotation=rotation;}
}