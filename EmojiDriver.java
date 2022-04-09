//LaDarion Wells
package Emoji;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class EmojiDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		//user inputted rows and columns
		System.out.println("Enter the number of rows you want:");
		int row = keyboard.nextInt();
		System.out.println("Enter the number of columns you want:");
		int column = keyboard.nextInt();

		StdDraw.setCanvasSize(column*100, row*100);
		StdDraw.setXscale(0,100*column);
		StdDraw.setYscale(0,100*row);


		//
		System.out.println("Enter a type of emoji: Smile, Frown, Clock");
		StdDraw.enableDoubleBuffering();
		Emoji[][] emoji = new Emoji [column][row];
			for(int i=0; i<emoji.length; i++) {
				for(int j =0; j<emoji[i].length; j++) {

					String emojiType = keyboard.next();
					if(emojiType.equalsIgnoreCase("Smile")) {
						SmileyFaceEmoji a = new SmileyFaceEmoji(50+100*i, 50+100*j, 50);
						emoji[i][j] = a;
						
					}
					if(emojiType.equalsIgnoreCase("Frown")) {
						FrowningFaceEmoji b = new FrowningFaceEmoji(50+100*i, 50+100*j, 50);
						emoji[i][j] = b;
					}
					if(emojiType.equalsIgnoreCase("Clock")) {
						System.out.println("What hour would you like to start on?");
						int hour = keyboard.nextInt();
						
						System.out.println("What minute would you like to start on?");
						int minute = keyboard.nextInt();
						
						ClockEmoji c = new ClockEmoji(50+100*i, 50+100*j, 50, hour, minute);
						emoji[i][j] = c;
					}
				}
			
		}
			keyboard.close();
			StdDraw.enableDoubleBuffering();
			while(true) {
				StdDraw.clear();
				for(int i=0; i<emoji.length; i++) {
					for(int j=0; j<emoji[i].length; j++) {
						emoji[i][j].animate();
						emoji[i][j].draw();
						emoji[i][j].animate(); // calls this again for animation to be repeated
					}
				}
				StdDraw.pause(1000);
				StdDraw.show();
			}
			

	}

}
