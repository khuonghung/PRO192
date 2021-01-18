/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.Scanner;

/**
 *
 * @author Khuong Hung
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         int hourStart , minutesStart ,minutesLast ;
         double d, d1, hourEnd , minutesEnd ; // d và d1 là thời gian diễn ra chuyển từ phút sang d( giờ ) và d1 (phút)
         do
        {
         System.out.println("- Enter the start time");
         System.out.print("  Hour : ");
         hourStart = sc.nextInt();
         System.out.print("  Minutes : ");
         minutesStart = sc.nextInt();
         
         if( hourStart > 23 || minutesStart > 60){
        System.out.println("The input number is invalid ! ");
        
         }
         
        } while (hourStart > 23 || minutesStart > 60);
         System.out.print("- Enter lasts time : ");
         minutesLast = sc.nextInt();
         d = minutesLast % 60;
         d1 = minutesLast / 60;
         hourEnd = hourStart + d1;
         minutesEnd = minutesStart + d;
         if ( minutesEnd > 60 ){
             minutesEnd -= 60;
             hourEnd += 1;
         }
         if(hourEnd > 23){
             hourEnd -= 24;
         } 
         
         if (hourEnd < 12 || hourStart < 12){
         
        System.out.println("if an time starts at " + hourStart + ":" + minutesStart + " a.m" + " and lasts "+ minutesLast + " minutes, it will end at " + (int)hourEnd + ":" + (int)minutesEnd + " a.m");
      
    }else {
        System.out.println("if an time starts at " + hourStart + ":" + minutesStart + " p.m" +" and lasts "+ minutesLast + " minutes, it will end at " + (int)hourEnd + ":" + (int)minutesEnd + " p.m");  
         }
    
}
}