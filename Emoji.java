//LaDarion Wells
package Emoji;


public abstract class Emoji {
private double centerX;
private double centerY;
private double radius;

public Emoji(double x, double y, double r) {
	this.centerX = x;
	this.centerY = y;
	this.radius = r;
}

public double getCenterX() {
	return centerX;
}

public double getCenterY() {
	return centerY;
}

public double getRadius() {
	return radius;
}

// two abstract classes to be called from other classes
public abstract void draw();

public abstract void animate();

}
