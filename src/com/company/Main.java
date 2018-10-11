package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int randomInt = (int) (Math.random() * 101);
        System.out.println("Guess the random number ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while(number != randomInt)
        {
            if (number < randomInt)
            {
                System.out.println("Higher");
                number = input.nextInt();
            }
            if (number > randomInt)
            {
                System.out.println("Lower");
                number = input.nextInt();
            }
        }
        System.out.println("Correct!");
    }
}
