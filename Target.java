import java.awt.*;
import java.awt.geom.*;
class Target extends Rectangle2D.Double{
	private double sx;
	private double sy;
	private Color color;
	public Target(double ox,double oy,double width,double height,double sx,double sy,Color color){
		super(ox,oy,width,height);
		this.sx=sx;
		this.sy=sy;
		this.color=color;
	}
	public Target(){
		super(100,100,20,100);
		this.sx=0;
		this.sy=0;
		this.color=Color.BLACK;
	}
	public double getSx(){return sx;}
	public double getSy(){return sx;}
	public void setWidth(double width){
		this.setRect(this.getX(), this.getY(),width,this.getHeight());
	}
	public void setHeight(double height){
		this.setRect(this.getX(), this.getY(),this.getWidth(),height);
	}
}
	
		
	
	