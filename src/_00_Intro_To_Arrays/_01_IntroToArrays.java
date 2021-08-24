package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings

    	String str[] = {"Hi", "Hello", "Welcome", "Hey", "Jack"};
        // 2. print the third element in the array

    	System.out.println(str[2]);
        // 3. set the third element to a different value

    	str[2] = "Bob";
        // 4. print the third element again

    	System.out.println(str[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice

    	for(int i = 0; i<str.length; i++) {
    		str[i] = "Jack";
    	}
    	
    	
    	
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	
    	
    	for(int i = 0; i<str.length; i++) {
    		System.out.println(str[i]);
    	}

        // 7. make an array of 50 integers

    	
    	int ints[] = new int[50];
    	Random r = new Random();
        // 8. use a for loop to make every value of the integer array a random
        //    number

    	for(int i = 0; i<ints.length; i++) {
    		ints[i] = r.nextInt(100);
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array

    	
    	int smallest = 100;
    	for(int i = 0; i<ints.length; i++) {
    		if(ints[i] < smallest) {
    			smallest = ints[i];
    		}
    	}
    	System.out.println(smallest);
        // 10 print the entire array to see if step 8 was correct

//    	for(int i = 0;i<ints.length; i++) {
//    		System.out.println(ints[i]);
//    	}
        // 11. print the largest number in the array.
    	int largest = 0;
    	for(int i = 0; i<ints.length; i++) {
    		if(ints[i] > largest) {
    			largest = ints[i];
    		}
    	}
    	
    	System.out.println(largest);
    	
        // 12. print only the last element in the array
    	System.out.println(ints[ints.length-1]);

    }
}
