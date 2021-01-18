/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namemaker;

import java.util.Scanner;

/**
 *
 * @author Khuong Hung
 */
public class NameMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String firstName, middleName, lastName, fullName;
        System.out.print("Enter your first name : ");
        firstName = sc.nextLine();
        System.out.print("Enter your middle name : ");
        middleName = sc.nextLine();
        System.out.print("Enter your last name : ");
        lastName = sc.nextLine();
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Hello " + fullName );
        
        
    }
    
}
