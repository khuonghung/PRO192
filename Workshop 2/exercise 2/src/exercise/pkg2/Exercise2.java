/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg2;

import java.util.Scanner;

/**
 *
 * @author Khuong Hung
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static Scanner scanner = new Scanner(System.in);
   
    static int[] arr2 = null;
    public static void input() {
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        // khởi tạo mảng arr
        int arr[] = new int[n];
        System.out.println("Imports the elements of the array: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        copyArray(arr);
    }

    public static int[] copyArray(int[] arr) {
        arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            arr2[i] = arr[i];
        }
        return arr2;
        }

    public static void show(int[] arr) {
        System.out.print("The imported array includes : ");
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void Sort(int[] arr){
        int tg;
    for(int i = 0; i < arr.length - 1; i++){
        for(int j = i + 1; j < arr.length; j++){
            if(arr[i] > arr[j]){
                // Hoan vi 2 so a[i] va a[j]
                tg = arr[i];
                arr[i] = arr[j];
                arr[j] = tg;        
            }
        }
    }
     System.out.println("The sorted array is: ");
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
        System.out.println("");
    }
    
    public static void FindMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
             if (max < arr[i]){
            max = arr[i];
                 
        }     
        }
            System.out.println("the maximum value : " + max);   
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner h = new Scanner(System.in);

        int choice;

        while (true) {
            
            System.out.println("1. Input data  ");
            System.out.println("2. Display all elements ");
            System.out.println("3. Sort all numbers in ascending order ");
            System.out.println("4. Find the maximum value ");
            System.out.println("0. Exit ");
            System.out.print("Your selection ( 0 -> 4) : ");
            choice = h.nextInt();

            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:
                    input();
                    break;
                case 2:
                    show(arr2);
                    break;
                case 3:
                    Sort(arr2);
                    break;
                case 4:
                    FindMax(arr2);
                    break;
            }
        }
        System.out.println("");
    }
}