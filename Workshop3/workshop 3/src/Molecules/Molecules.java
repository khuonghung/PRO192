/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Molecules;

import java.util.Scanner;

/**
 *
 * @author Khuong Hung
 */
public class Molecules {
    String structure;
    String name;
    double weight;

    public Molecules() {
        
        
    }

    public Molecules(String structure, String name, Double weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }
    
    void input(){
        Scanner h = new Scanner(System.in);
        int n;
        int i;
        System.out.print("Enter the number of atoms you want to statistic : ");
        n = h.nextInt();
        
        String [] structure = new String[n];
        String [] name = new String[n];
        Double [] weight = new Double[n];
        for (i = 0; i < n; i++){
        System.out.print("Enter structure : ");
        structure[i] = h.nextLine();
        structure[i] = h.nextLine();
        System.out.print("Enter name : ");
        name[i] = h.nextLine();
        System.out.print("Enter weight :");
        weight[i] = h.nextDouble();
        System.out.println("");
        } 
        for (int j = 0; j < i; j++){
            System.out.println(structure[j] + ", " + name[j] + ", " + weight[j] );
        }
    }
    
}