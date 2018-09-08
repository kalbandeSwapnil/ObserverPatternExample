package com.test;

import java.util.Scanner;

public class Demo {
	    public static void main( String[] args ) {
	        Subject sub = new Subject();
	        // Client configures the number and type of Observers
	        new HexObserver(sub);
	        new OctObserver(sub);
	        new BinaryObserver(sub);
	        
	        Scanner scan = new Scanner(System.in);
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter a number: ");
	            sub.setState(scan.nextInt());
	        }
	    }
}
