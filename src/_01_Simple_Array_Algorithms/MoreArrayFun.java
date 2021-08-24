package _01_Simple_Array_Algorithms;

import java.util.Random;


//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
//github token


public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.

	void printStr(String s[]) {
		for(int i = 0; i<s.length; i++) {
			System.out.println(s[i]);
		}
	}

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.

	void printStrRev(String s[]) {
		for(int i = s.length-1; i>=0; i--) {
			System.out.println(s[i]);
		}
	}

    //4. Write a method that takes an array of Strings and prints every other String in the array.

	void printOther(String s[]) {
		for(int i = 0; i<s.length; i++) {
			if(i%2==0) {
				System.out.println(s[i]);
			}
		}
	}
	
	
	
    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.

	Random r = new Random();
	void printRandom(String s[]) {
		int alreadyPrinted[] = new int[s.length];
		for(int i = 0; i<alreadyPrinted.length; i++) {
			alreadyPrinted[i] = 0;
		}
		
		int attempt = r.nextInt(s.length);
		if(alreadyPrinted[attempt] == 0) {
			System.out.println(s[attempt]);
			alreadyPrinted[attempt] = 1;
		}
		
	}
	
	
	
	
	
}
