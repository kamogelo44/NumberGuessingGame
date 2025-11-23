/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.number.guessing.game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Obakeng Phale
 */
public class NumberGuessingGame {

    public static void main(String[] args) {
        
        System.out.println("****This is a number guessing game. This is a java console based application. Have fun not ever guessing the right number.****\n");
       //CONSTANTS
       final short MINGUESS= 1;
       final short MAXGUESS= 100;
       int guessAttempts =0;
       
       //USER'S GUESSED NUMBER
       short guess;
       
       //RANDOM NUMBER GENERATOR
       Random rand = new Random();
       
       //INITIALIZE SCANNER OBJECT
       Scanner input = new Scanner(System.in);
       
        int i = 1;
        System.out.println("I'm thinking of a number between 1 and 100");
        while(i>0) { 
            
            //Generate a number between 1 and 100
            int randomNum = rand.nextInt(100)+1;
            //PROMPT USER FOR INPUT
            System.out.print("Enter your geuss: ");
            guess = input.nextShort();
            if(guess!=randomNum){
            guessAttempts++;
            }
            System.out.print("Guess attempts: " + guessAttempts);
            if(guess == randomNum ){
                System.out.println("\nYour guessed the right number!");
           
            System.out.println("\nYou guessed it in "+ guessAttempts +" attempts.");
            }

            if(guess>MAXGUESS){
                System.out.println("\nToo high! Try again.");
            }
            
            if(guess<MINGUESS){
                System.out.println("\nToo low! Try again.");
            }
            
            if(guess!=randomNum){
                System.out.println("\nyou guessed the wrong number!");
                
            }

        }
    }
}
