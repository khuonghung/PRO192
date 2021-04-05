/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangles;

import java.util.Scanner;

/**
 *
 * @author Khuong Hung
 */
public class main {
    
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        Rectangles e = new Rectangles();
        
        double width ;
        double height;
        double area;
        double perimeter;
        e.input();
        System.out.println("1. Display Data");
        System.out.println("2. Display Area");
        System.out.println("3. Display Perimeter");
        int tc;
        System.out.print("Enter TC :");
        tc = h.nextInt();
        switch (tc) {
            case 1:
                e.display();
                break;
            
            case 2:
                e.getArea();
                break;
            
            case 3:
                e.getPerimeter();
                break;
            
        }
        
    }
    
}

