/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	
    	int right = 0;
    	int left = 0;
    	int down = 0;
    	int up = 0;
    	
    	
    	
    	int firstRight[] = {-1, -1};
    	int firstLeft[] = {-1, -1};
    	int firstDown[] = {-1, -1};
    	int firstUp[] = {-1, -1};
    	
    	
    	
    	
    	
    	int result[] = {0, 0};
    	
    	
    	
    	for(int j = 0; j<field.length; j++) {
    		for(int i = 0; i<field[j].length; i++) {
    			//System.out.println(field[j][i] + " x " + i + " y " + j);
    			
    			
    			
    			
    			if(field[j][i] == 'c') {//test right WORKING
    				//System.out.println(i + " needs < " + (field[i].length-3));
    				if(i < field[j].length - 2) {
    					//System.out.println("Y:" + i + " X: " + (j+1) + " equals " + field[j][i + 1] + " should equal o");
    					//System.out.println("Y:" + i + " X: " + (j+2) + " equals " + field[j][i + 2] + " should equal w");
    					if(field[j][i + 1] == 'o' && field[j][i + 2] == 'w') {
    						//System.out.println("found right");
    						right++;
    						if(firstRight[0] == -1 && firstRight[1] == -1) {
    							firstRight[0] = i;
    							firstRight[1] = j;
    						}
    					}
    				}
    			}
    			
    			if(field[j][i] == 'c') {//test left WORKING
    				//System.out.println(i + " needs < " + (field[i].length-3));
    				if(i >= 2) {
    					//System.out.println("Y:" + i + " X: " + (j+1) + " equals " + field[j][i + 1] + " should equal o");
    					//System.out.println("Y:" + i + " X: " + (j+2) + " equals " + field[j][i + 2] + " should equal w");
    					if(field[j][i - 1] == 'o' && field[j][i - 2] == 'w') {
    						//System.out.println("found right");
    						left++;
    						if(firstLeft[0] == -1 && firstLeft[1] == -1) {
    							firstLeft[0] = i;
    							firstLeft[1] = j;
    						}
    					}
    				}
    			}
    			
    			
    			if(field[j][i] == 'c') {//test down WORKING
    				//System.out.println(i + " needs < " + (field[i].length-3));
    				if(j < field.length - 3) {
    					//System.out.println("Y:" + i + " X: " + (j+1) + " equals " + field[j][i + 1] + " should equal o");
    					//System.out.println("Y:" + i + " X: " + (j+2) + " equals " + field[j][i + 2] + " should equal w");
    					if(field[j + 1][i] == 'o' && field[j + 2][i] == 'w') {
    						//System.out.println("found right");
    						down++;
    						if(firstDown[0] == -1 && firstDown[1] == -1) {
    							firstDown[0] = i;
    							firstDown[1] = j;
    						}
    					}
    				}
    			}
    			
    			if(field[j][i] == 'c') {//test up WORKING
    				//System.out.println(i + " needs < " + (field[i].length-3));
    				if(j >= 2) {
    					//System.out.println("Y:" + i + " X: " + (j+1) + " equals " + field[j][i + 1] + " should equal o");
    					//System.out.println("Y:" + i + " X: " + (j+2) + " equals " + field[j][i + 2] + " should equal w");
    					if(field[j - 1][i] == 'o' && field[j - 2][i] == 'w') {
    						//System.out.println("found right");
    						up++;
    						if(firstUp[0] == -1 && firstUp[1] == -1) {
    							firstUp[0] = i;
    							firstUp[1] = j;
    						}
    					}
    				}
    			}
    			
    			
    			
    		}
    	}
//    	System.out.println("Right: " + right);
//    	System.out.println("Left: " + left);
//    	System.out.println("Down: " + down);
//    	System.out.println("Up: " + up);
//    	
//    	
//    	
//    	System.out.println("First Right: X: " + firstRight[0] + " Y: " + firstRight[1]);
//    	System.out.println("First Left: X: " + firstLeft[0] + " Y: " + firstLeft[1]);
//    	System.out.println("First Down: X: " + firstDown[0] + " Y: " + firstDown[1]);
//    	System.out.println("First Up: X: " + firstUp[0] + " Y: " + firstUp[1]);
    	
    	
    			
    			
    			
    			
    			
        //System.out.println("X: " + result[0] + " Y: " + result[1]);
    	if(right == 1) {
    		System.out.println("X: " + firstRight[0] + " Y: " + firstRight[1]);
    		return firstRight;
    	}else if(left == 1) {
    		System.out.println("X: " + firstLeft[0] + " Y: " + firstLeft[1]);
    		return firstLeft;
    	}else if(down == 1) {
    		System.out.println("X: " + firstDown[0] + " Y: " + firstDown[1]);
    		return firstDown;
    	}else if(up == 1) {
    		System.out.println("X: " + firstUp[0] + " Y: " + firstUp[1]);
    		return firstUp;
    	}
    	
        return result;
    }
}
