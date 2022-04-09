//LaDarion Wells
package Emoji;

import edu.princeton.cs.introcs.StdDraw;

public class ClockEmoji extends Emoji{
	private int hour;
	private int minute;
	public ClockEmoji(double x, double y, double r, int h, int m) {
		super(x, y, r);
		this.hour = h;
		this.minute = m;

	}

	@Override
	public void draw() {
		StdDraw.setPenColor(StdDraw.GRAY);
		StdDraw.filledCircle(getCenterX(), getCenterY(), getRadius());
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.circle(getCenterX(), getCenterY(), getRadius());
		
	//minute hand
	StdDraw.line(getCenterX(), getCenterY(), getCenterX()+(getRadius() - getRadius()/20)*
	Math.cos(6*Math.PI*minute/180) - Math.PI/2,getCenterY()+
	(getRadius()-getRadius()/20)*Math.sin(6*Math.PI*minute/180)-Math.PI/2);
				
	//hour hand
	StdDraw.line(getCenterX(),getCenterY(),getCenterX()+(getRadius() - getRadius()/20)*
	Math.cos(30*Math.PI*hour/180) - Math.PI/2,getCenterY()+
	(getRadius()-getRadius()/20)*Math.sin(30*Math.PI*hour/180)-Math.PI/2);
	}

	@Override
	public void animate() {
		draw();
	if(minute ==1) {
			minute = 60;
		if(hour == 1) {
				hour = 12;
			}else {
				hour--;
			}
		}else {
			minute--;
		}

	}

}
