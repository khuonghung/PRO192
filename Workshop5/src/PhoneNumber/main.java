/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneNumber;

import java.util.Scanner;

/**
 *
 * @author Khuong Hung
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] area = new int[10000];
        int [] area2 = new int[10000];
        String [] number = new String[10000];
        String [] number2 = new String[10000];
        int [] countryCode = new int[10000];
        
        int tc, i,j, n;
        System.out.print("Enter list of phone numbers : ");
        n = sc.nextInt();
        
        for (i = 0; i < n; i++){

        label1:
        while(true){
        System.out.print("Type of phone number ? (1 – local phone"
                + ", 2 – Inter phone number, 0 - exit):  ");
        tc = sc.nextInt();
        if (tc == 0){
            break;   
        }
        label:
        switch (tc) {
            case 1:{
                System.out.print("Enter area code : ");
                area[i] = sc.nextInt();
                System.out.print("Enter number: ");
                number[i] = sc.nextLine();
                number[i] = sc.nextLine();
                break label;
            }
            case 2:{
                System.out.print("Enter country code : ");
                countryCode[i] = sc.nextInt();
                System.out.print("Enter area code : ");
                area2[i] = sc.nextInt(); sc.nextLine();
                System.out.print("Enter number : ");
                number2[i] = sc.nextLine();
            }
            
            break label1;
        }
    }
}
            System.out.println("");
            System.out.println("List of phone number: ");
            System.out.println("----------------------------");
        for (j = 0; j < i; j++){

            System.out.println(area[j] + "\t" + number[j]);
            System.out.println(countryCode[j] + "\t" + area2[j] + "\t" + number2[j]);
        }
    }
    
}
