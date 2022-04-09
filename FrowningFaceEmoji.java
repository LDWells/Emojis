//LaDarion Wells
package Emoji;

import edu.princeton.cs.introcs.StdDraw;

public class FrowningFaceEmoji extends FaceEmoji {

	public FrowningFaceEmoji(double x, double y, double r) {
		super(x, y, r);
		
	}
	
	public void draw() {
		super.draw();
		StdDraw.setPenColor(StdDraw.BLACK);
		//Frowning face
		StdDraw.arc(getCenterX(), getCenterY()-getRadius()/2, getRadius()/2,0, 180);
	}

}
