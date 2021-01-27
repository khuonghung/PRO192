/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.util.Random;

import java.util.Scanner;

import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Khuong Hung
 */
public class Casino {
public static Scanner scanner = new Scanner(System.in); 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int  [] a; int n,i, choice;
        int ranNum; 
        int chipbet;
        int ranNum2;
         
        int accountbalance = 0, chipBuy , chip = 0, chipSell;
        
    Scanner  h =  new Scanner(System.in);
        
        while(true){
            System.out.println("************************************************");
            System.out.println("Account balance : " + accountbalance + " $");
            System.out.println("Account chip : " + chip + " chip");
            System.out.println("************************************************");
            System.out.println("1. Buy chips ");
            System.out.println("2. Sell chips ");
            System.out.println("3. Play Craps ");
            System.out.println("4. Play Arup's Game of Dice ");
            System.out.println("5 Status Report ");
            System.out.println("0. Exit ");
            System.out.print(" Your selection ( 0 -> 5) : ");
            choice = h.nextInt();
            if (choice == 0) break;
            switch ( choice ){
                case 1 :
                 do {
                 System.out.print("Enter the amount you want to add to your account :");
                 accountbalance = h.nextInt();
                 if (accountbalance < 11){
                 }
                 }while (accountbalance < 11 );
                do{
                 
                 do{
                 System.out.print("Enter the number of chips you want to buy : ");
                 chipBuy = h.nextInt();
                 if ( chipBuy < 1){
                     System.out.println("Please re-enter the chip number!");
                 }
                 
                 }while(chipBuy < 1);
                 
                 accountbalance -= chipBuy*11;
                 
                 chip =+ chipBuy;
                  if ( accountbalance < 1 ){
                  System.out.println("Your chip purchase amount has exceeded your account balance !");
                  
                 }
                 }while ( accountbalance <1 );
                         
                    break;
                case 2 :
                    System.out.println("The number of chips available : " + chip + " chip");
                    System.out.print("Enter the number of chips you want to sell :  ");
                    chipSell = h.nextInt();
                    chip = chip - chipSell;
                    accountbalance = accountbalance + chipSell*10;
                    System.out.println("The balance after the sale : " + accountbalance + " $");
                    System.out.println("The number of chips available : " + chip + " chip");

                   
                    break;
                case 3 :
                        
                    do{
                       
                    
                    System.out.print("Enter the number of chips to bet ");
                    chipbet = h.nextInt();
                    if ( chipbet > chip){
                        System.out.println("The number of subscription chips has exceeded the available chips");
                    }
                    }while ( chipbet > chip);
                    ranNum = 0;
                    
                    int number1 = ThreadLocalRandom.current().nextInt(1,7);
                    int number2 = ThreadLocalRandom.current().nextInt(1,7);
                    
                    ranNum = number1 + number2;
                    
                   System.out.println("point of rotation 1 : " + ranNum);
                    if ( ranNum == 7 || ranNum == 11 ){
                        System.out.println(ranNum);
                        System.out.println(" Status : You win");
                        chip = chip + chipbet;
                    }
                    if ( ranNum == 7 || ranNum == 11 ){
                        
                    }
                    if (ranNum == 2 || ranNum == 3 || ranNum == 12 ){
                         System.out.println(ranNum);
                        System.out.println("Status : You lose");
                        chip = chip - chipbet;
                    }
                    if( ranNum != 2 || ranNum != 3 || ranNum != 12 || ranNum != 7 || ranNum != 11 ){
                         int k = 0 ;
                         k = ranNum;
                         int number3 = ThreadLocalRandom.current().nextInt(1,7);
                         int number4 = ThreadLocalRandom.current().nextInt(1,7);
                         ranNum2 = number3 + number4;
                         System.out.println("point of rotation 2 : " + ranNum2);
                         if (ranNum2 == 7 ){
                            System.out.println(" Status : You win"); 
                            chip = chip + chipbet;
                         }else {
                             System.out.println(" Status : You loss");
                             chip = chip - chipbet;
                         }  
                    }
                    break;
                case 4 :
                    chipbet = 0;
                    do{
                    System.out.print("Enter the number of chips to bet ");
                    chipbet = h.nextInt();
                    if ( chipbet > chip){
                        System.out.println("The number of subscription chips has exceeded the available chips");
                    }
                    }while( chipbet > chip);
                    ranNum = 0;
                    ranNum2 = 0;
                    ranNum = ThreadLocalRandom.current().nextInt(1,7);
                    System.out.println("point of rotation 1 : " + ranNum);
                    if ( ranNum == 11 || ranNum == 12 ){
                        System.out.println(" Status : You win"); 
                        chip = chip + chipbet;
                    }
                    if (ranNum == 2){
                        System.out.println(" Status : You loss");
                        chip = chip - chipbet;
                    }
                    
                    if ( ranNum != 11 || ranNum != 12 || ranNum != 2){
                        ranNum2 = ThreadLocalRandom.current().nextInt(1,7);
                        System.out.println("point of rotation 2 : " + ranNum2);
                        if ( ranNum2 > ranNum ){
                        System.out.println(" Status : You win"); 
                        chip = chip + chipbet;
                        }
                        if ( ranNum2 <= ranNum){
                        System.out.println(" Status : You loss");
                        chip = chip - chipbet;
                        }                  
                    }
                    
                    break;
                case 5 :
                    break;
        }
        System.out.println("");
    }
    
}
}

