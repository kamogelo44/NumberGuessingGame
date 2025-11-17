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
       final short guessAttempts=0;
       
       //USER'S GUESSED NUMBER
       short guess;
       
       //RANDOM NUMBER GENERATOR
       Random rand = new Random();
       
       //INITIALIZE SCANNER OBJECT
       Scanner input = new Scanner(System.in);
       
        int i = 1;

        while(i>0) { 
            
            //Generate a number between 1 and 100
            int randomNum = rand.nextInt(100)+1;
            //PROMPT USER FOR INPUT
            System.out.println("Enter your Geuss");
            guess = input.nextShort();

            if(guess>MAXGUESS){
                System.out.println("Your guess is too high");
            }
            
            if(guess<MINGUESS){
                System.out.println("Your guess is too low");
            }
            
            if(guess!=randomNum){
                System.out.println("you guessed the wrong number!");
                
            }else
                System.out.println("Your guessed the right number!");
            
             int attempts = i++;
            System.out.println("Your attempts: "+attempts);  
        }
    }
}
