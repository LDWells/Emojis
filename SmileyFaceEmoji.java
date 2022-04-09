//LaDarion Wells
package Emoji;

import edu.princeton.cs.introcs.StdDraw;

public class SmileyFaceEmoji extends FaceEmoji {

	public SmileyFaceEmoji(double x, double y, double r) {
		super(x, y, r);
		
	}
	public void draw() {
		super.draw();
		StdDraw.setPenColor(StdDraw.BLACK);
		//Smiling face
		StdDraw.arc(getCenterX(), getCenterY(), getRadius()/2,180, 0);
	}

}
