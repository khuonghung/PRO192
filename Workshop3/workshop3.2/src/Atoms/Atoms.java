/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atoms;

import java.util.Scanner;

/**
 *
 * @author Khuong Hung
 */
public class Atoms {
    int i, j;
    int number;
    String sysbol;
    String fullname;
    double weight;

    public Atoms() {
        number = 0;
        sysbol = null;
        fullname = null;
        weight = 0;
    }

    public Atoms(int number, String sysbol, String fullname, double weight) {
        this.number = number;
        this.sysbol = sysbol;
        this.fullname = fullname;
        this.weight = weight;
    }
    
    void input (){
       Scanner sc = new Scanner(System.in);

       int [] number = new int[10];
       String [] sysbol = new String[10];
       String [] fullname = new String[10];
       double [] weight = new double[10];
       
           System.out.println("              Atomic Information                ");
           for (i = 0; i < 10 ; i++){
           System.out.print("Enter atomic number : ");
           number[i] = sc.nextInt();
           
           if (number[i] == 0){
               break ;
           }
           System.out.print("Enter sysbol : ");
           sysbol[i] = sc.nextLine();
           sysbol[i] = sc.nextLine();
           System.out.print("Enter fullname : ");
           fullname[i] = sc.nextLine();
           System.out.print("Enter weight : ");
           weight[i] = sc.nextDouble();
           System.out.println("");
           }
           System.out.println("");
            for (j = 0; j < i; j++){
               System.out.println(number[j] + ", " + sysbol[j] + ", " + fullname[j] + ", " + weight[j]);
           }
       
    }
    
}
  
   
