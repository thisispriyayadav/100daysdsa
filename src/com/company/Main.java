package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int  myNumber = (int)(Math.random()*100);
        int userNumber=0;
        do {
            System.out.println("guess my number");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("yay ..... correct number");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large");
            } else {
                System.out.println("your number is too small");
            }
        }while(userNumber>=0);
        System.out.println("my number was:");
        System.out.println(myNumber);


        

    }
}








