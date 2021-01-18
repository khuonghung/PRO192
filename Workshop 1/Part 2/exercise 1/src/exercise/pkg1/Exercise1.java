/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1;

import java.util.Scanner;

/**
 *
 * @author Khuong Hung
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a, b, total ; // a = giờ , b = phút , total = tổng thời gian 
        do
        {
        System.out.println("Enter time and minutes");
        System.out.print("Hour : ");
        a = sc.nextInt();
        System.out.print("Minutes : ");
        b = sc.nextInt();
        if( a > 23 || b > 60){
        System.out.println("The input number is invalid ! ");
        }
        } while (a > 23 || b > 60);          
        total = a * 60 + b;
        System.out.println( a + " hours and " + b + " minutes would be " + total + " total minutes"); 
    }      
}
