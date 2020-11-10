/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whoareyou;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author q
 * 
 */
public class WhoAreYou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception  {
        // throws Exception
        
        // Exercise 1
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.println("Please enter your name");
        String str = br.readLine();
        System.out.println("Oh, thats is a very nice name, "+str);
        
        // Exercise 2
        //input variable called scanner:
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        String userName = scanner.nextLine();
        System.out.println("Oh, thats is a very nice name, "+userName);
        
        // Exercise 3
        System.out.println("Q1: What is your quest?");
        String answer1 = scanner.nextLine();
        
        System.out.println("Q2: What is your favourite colour?");
        String answer2 = scanner.nextLine();
        
        System.out.println("Ah, I see your quest is " + answer1 + ", and" + " your favourite colour is " + answer2);

        // Exercise 4
        // Scanner and .nextInit()
        try{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number (or string to crash the program):");
        int someNumber = myScanner.nextInt();
        }
        catch(Exception e){
        }
        
        // Exercise 5
        System.out.println("Enter first number:");
        int number1 = Integer.parseInt(br.readLine());
        
        System.out.println("Enter second number:");
        int number2 = Integer.parseInt(br.readLine());
        
        int sum = number1 + number2;
        
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        // Exercise 6
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter your first number");

            number1 = Integer.parseInt(bf.readLine());
            
            System.out.println("Please enter your second number");
            number2 = Integer.parseInt(bf.readLine());

            sum = number1 + number2;
            
            System.out.println("The sum of " + number1 + " and " + number2 +
            " is: " + sum);
            
            } catch (Exception e) {
            System.out.println(e);
        }


        // Exercise 7

        BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Please enter your first number");
            number1 = Integer.parseInt(bf2.readLine());
            
            System.out.println("Please enter your second number");
            number2 = Integer.parseInt(bf2.readLine());
            
            sum = number1 + number2;
            int sub = number1 - number2;
            int multi = number1 * number2;
            
            //Print out the sum
            System.out.println("The sum of " + number1 + " and " + number2 +
            " is: " + sum);
             //Print out the subtraction
            System.out.println("The sub of " + number1 + " and " + number2 +
            " is: " + sub);
             //Print out the multiplication
            System.out.println("The mult of " + number1 + " and " + number2 +
            " is: " + multi);
            
            //Check if second number is not 0 or less than
             if (number2 == 0) {
                 //If second number is 0 or less, print out that this
                 //condition is not accepeted.
                System.out.println("Your second number cannot be 0 or less");
                System.out.println("Try again");
            } else{
                 //When second number is more than 0, allows the division.
                 int div = number1 / number2;
                 System.out.println("The division of " + number1 + " and " + number2 + 
            " is: " + div);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }


    }
    
}
