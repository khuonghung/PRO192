/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.Scanner;

/**
 *
 * @author Khuong Hung
 */
public class main {
    public static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        CourseManager courseManager = new CourseManager();
        String courseId;
 
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1":
                courseManager.show();
                break;
            case "2":
                courseId = courseManager.inputId();
                courseManager.Find(courseId);
                break;
            case "3":
                courseManager.add();
                break;
            case "4":
                courseManager.sortCourseByCredit();
                System.out.println("Information of course has been update !");
                break;
            case "5":   
                courseId = courseManager.inputId();
                courseManager.edit(courseId);
                break;
            case "6":
                courseId = courseManager.inputId();
                courseManager.delete(courseId);
                break;
            case "0":
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
            showMenu();
        }
    }
    public static void showMenu() {
        System.out.println("COURSE MANAGEMENT SYSTEM");
        System.out.println("--------------menu----------");
        System.out.println("1. A list of all available courses in the system.");
        System.out.println("2. Search and display information of a course by course id.");
        System.out.println("3. Record/Add information of course.");
        System.out.println("4. Sort all courses by number of credit as ascending ");
        System.out.println("5. Update information of a specific course (by course id)");
        System.out.println("6. Delete information of a specific course (by course id)");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
    
}
