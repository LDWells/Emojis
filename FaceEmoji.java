//LaDarion Wells
package Emoji;

import edu.princeton.cs.introcs.StdDraw;

public class FaceEmoji extends Emoji {
private boolean isWinking = true;
private int count =1;
	public FaceEmoji(double x, double y, double r) {
		super(x, y, r);
	}

	@Override
	public void draw() {
		++count;
		if(!isWinking) {
	StdDraw.setPenColor(StdDraw.YELLOW);
	//calls x,y and radius from the emoji class
	StdDraw.filledCircle(getCenterX(), getCenterY(), getRadius());
	
	//left eye
	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.filledCircle(getCenterX()-getRadius()/2, getCenterY()+getRadius()/2, getRadius()/8);
	
	//right eye
	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.filledCircle(getCenterX()+getRadius()/2, getCenterY()+getRadius()/2, getRadius()/8);
	
	}
		else if(isWinking) {
	StdDraw.setPenColor(StdDraw.YELLOW);		
	StdDraw.filledCircle(getCenterX(), getCenterY(), getRadius());
	
	//left eye blinking
	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.arc(getCenterX()-getRadius()/2, getCenterY()+getRadius()/2, getRadius()/8, 0, 180);
	
	//right eye
	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.filledCircle(getCenterX()+getRadius()/2, getCenterY()+getRadius()/2, getRadius()/8);
		}
		
	}
	

	@Override
	public void animate() { 
		
		if(count%2==0) {
			isWinking = false;
			draw();
		}else {
			isWinking = true;
			draw();
		}
	}

}
