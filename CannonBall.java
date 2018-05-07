import java.awt.geom.*;
class CannonBall extends Ellipse2D.Double{
	private double sx;
	private double sy;
	public CannonBall(){
		super(20,600,20,20);
		this.sx=1.3;
		this.sy=-1;
	}	
	public CannonBall(double cx, double cy,double radious,double sx, double sy){
		super(cx,cy,radious,radious);
		this.sx=sx;
		this.sy=sy;
	}
	public CannonBall(Ellipse2D.Double ball,double sx,double sy){
		super(ball.getX(),ball.getY(),ball.getWidth(),ball.getWidth());
		this.sx=sx;
		this.sy=sy;
	}
	public void setCenter(){
		this.setFrame(getX()+sx, getY()+sy,getWidth(),getHeight());
	}
	public double getSx(){
		return sx;
	}
	public double getSy(){
		return sy;
	}
	public void setSx(double sx){
		this.sx=sx;
	}
	public void setSy(double sy){
		this.sy=sy;
	}
}