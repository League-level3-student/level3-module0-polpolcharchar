package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	
	
	

	public static void main(String[] args) {
		
	Random random = new Random();
        // 2. create an array of 5 robots.
		Robot r[] = new Robot[5];

        // 3. use a for loop to initialize the robots.
		for(int i = 0; i<r.length; i++) {
			r[i] = new Robot();
			r[i].setX((i*100) + 50);
			r[i].setY(550);
			r[i].setAngle(0);
			r[i].setSpeed(100000);
		}

        // 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
		while(r[0].getY() > 50 && r[1].getY() > 50 && r[2].getY() > 50 && r[3].getY() > 50 && r[4].getY() > 50) {
		for(int i = 0; i<r.length; i++) {
			r[i].move(random.nextInt(10));
		}
		}
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
		int winner = 0;
		for(int i = 0; i<r.length; i++) {
			if(r[i].getY() <= 50) {
				winner = i+1;
				break;
			}
		}
		System.out.println("Robot number " + winner + " wins!");
		int angle = 0;
		
		for(int i = 0; i<100; i++) {
			r[winner-1].setAngle(angle);
			angle += 1;
		}
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
		
		for(int i = 0; i<r.length; i++) {
			r[i] = new Robot();
			r[i].setX((i*100) + 50);
			r[i].setY(250);
			r[i].setAngle(0);
			r[i].setSpeed(100000);
		}
		int angles[] = {0, 0, 0, 0, 0};
		while(angles[0] < 360 && angles[0] < 360 && angles[0] < 360 && angles[0] < 360 && angles[0] < 360) {
			for(int i = 0; i<r.length; i++) {
				int moveAngle = random.nextInt(5);
				angles[i] += moveAngle;
				r[i].setAngle(angles[i]);
				r[i].move(5);
				
			}
		}
		
		winner = 0;
		for(int i = 0; i<r.length; i++) {
			if(angles[i] >= 360) {
				winner = i;
			}
		}
		
		System.out.println("Robot number " + (winner + 1) + " wins!");
	}

}
