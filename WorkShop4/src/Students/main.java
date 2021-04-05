/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author Khuong Hung
 */
public class main {

    public static void main(String[] args) {
        Students e = new Students();
        String[] name = new String[100];
        String[] studentId = new String[100];
        String[] birthDate = new String[100];
        String[] address = new String[100];
        String[] major = new String[100];
        double[] mark = new double[100];

        Scanner sc = new Scanner(System.in);
        int i,j, n;
        System.out.print("Enter number student : ");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print("Enter name : ");
            name[i] = sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print("Enter student id : ");
            studentId[i] = sc.nextLine();
            System.out.print("Enter the Date : ");
            birthDate[i] = sc.nextLine();
            System.out.print("Enter address : ");
            address[i] = sc.nextLine();
            System.out.print("Enter major : ");
            major[i] = sc.nextLine();
            System.out.print("Enter mark : ");
            mark[i] = sc.nextDouble();
            System.out.println("");
 
        }
        for (j = 0; j < i; j++ ){
            System.out.println("====================================");
            System.out.println("STUDENT INFOR : ");
            System.out.println("Name : " + name[j]);
            System.out.println("ID : " + studentId[j]);
            System.out.println("Birth date : " + birthDate[j]);
            System.out.println("Address : " + address[j]);
            System.out.println("Major : " + major[j]);
            System.out.println("Mark : " + mark[j]);
            System.out.println("=====================================");
         }

    }

}
