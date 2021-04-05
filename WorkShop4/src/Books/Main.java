/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Books;
import java.util.*;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Khuong Hung
 */
public class Main {
   public static void main(String args[]) throws Exception {
       Scanner sc = new Scanner(System.in);
       String author, author2; String title , title2 ; int noOfPages ,noOfPages2
       , tc ; boolean fiction, fiction2;
       author2= null;
       System.out.print("Enter author: ");
       author = sc.nextLine();
       System.out.print("Enter title: ");
       title = sc.nextLine();
       System.out.print("Enter noOfPages : ");
       noOfPages = sc.nextInt();
       System.out.print("Enter fiction : ");
       fiction = sc.nextBoolean();
       System.out.println("1. Test toString()");
       System.out.println("2. Test set methods");
       System.out.print("Enter TC (1 or 2): ");
       tc = sc.nextInt(); sc.nextLine();
       System.out.println("OUTPUT:");
       Books t = new Books();
       if(tc == 2) {
           System.out.print("Enter new author: ");
           author2 = sc.nextLine();
           t.setAuthor(author2);
           System.out.print("Enter new title: ");
           title2 = sc.nextLine();
           t.setTitle(title2);
           System.out.print("Enter new noOfPages : ");
           noOfPages2 = sc.nextInt();
           t.setNoOfPages(noOfPages2);
           System.out.print("Enter new fiction: ");
           fiction2 = sc.nextBoolean();
           t.setFiction(fiction2);
       }
        switch (tc) {
            case 1: {
                Books a1 = new Books(author, title,  noOfPages,  fiction);
                System.out.println(a1);
                break;
            }
            case 2:
               String a = t.getAuthor(); 
               String b = t.getTitle(); 
               int c = t.getNoOfPages();
               Boolean d = t.isFiction();
                System.out.printf("%s\t%s\t%d\t%b",a,b,c,d);
                break;
            default:
                break;
        }
       System.out.println();
   }
    
}
