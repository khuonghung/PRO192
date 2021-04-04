/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class CourseManager {
/**
 *
 * @author Khuong Hung
 */
    public static Scanner scanner = new Scanner(System.in);
    private List<Course> courseList;
    private CourseWR courseWR;
     
  
    public CourseManager() {
        courseWR = new CourseWR();
        courseList = courseWR.read();
    }
 

    public void add(){
        String id = inputId();
        String name = inputName();
        int credit = inputCredit();
        Course course = new Course(name,id,credit);
        System.out.println("Information of course has been added!");
        courseList.add(course);
        courseWR.write(courseList);
    }
    
 

    public void edit(String id) {
        boolean isExisted = false;
        int size = courseList.size();
        for (int i = 0; i < size; i++) {
            if (courseList.get(i).getId().equals(id)) {
                isExisted = true;
                courseList.get(i).setName(inputName());
                courseList.get(i).setId(inputId());
                courseList.get(i).setCredit(inputCredit());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %s not existed.\n", id);
        } else {
            courseWR.write(courseList);
        }
    }
 
    
    public void Find(String id){
        boolean isExisted = false;
        int size = courseList.size();
        for (int i = 0; i < size; i++) {
            if (courseList.get(i).getId().equals(id)) {
                isExisted = true;
                System.out.println("Information of course : ");
                System.out.println("Course ID : " + courseList.get(i).getId() + "\t\t");
                System.out.println("Course name : " + courseList.get(i).getName()+ "\t\t");
                System.out.print("Course credit : " + courseList.get(i).getCredit() + "\n");
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %s not existed.\n", id);
        } 
    }
    
    public void delete(String id) {
        Course course = null;
        int size = courseList.size();
        for (int i = 0; i < size; i++) {
            if (courseList.get(i).getId().equals(id)) {
                course = courseList.get(i);
                System.out.println("Information has been deleted!");
                break;
            }
        }
        if (course != null) {
            courseList.remove(course);
            courseWR.write(courseList);
        } else {
            System.out.printf("id = %s not existed.\n", id);
        }
    }
    
    public class SortCourseByCredit implements Comparator<Course> {
    @Override
    public int compare(Course course1, Course course2) {
        if (course1.getCredit()> course2.getCredit()) {
            return 1;
        }
        return -1;
    }
    }
    
    public void sortCourseByCredit() {
        Collections.sort(courseList, new SortCourseByCredit());
        courseWR.write(courseList);     
    }
 

    public void show() {
        System.out.println("Course ID |                 Course name                |  Course credit  ");
        for (Course course : courseList) {
            System.out.printf("%3s%40s%20d\n", course.getId(), course.getName(), course.getCredit());
        }
        
    }
 
    public String inputId() {
        String id;
        System.out.print("Enter course id: ");
        id = scanner.next();
        return id;
    }
     
    private String inputName() {
        String name;
        System.out.print("Enter course name: ");
        name = scanner.nextLine();
        name = scanner.nextLine();
        return name;
    }

    private int inputCredit() {
        int credit;
        System.out.print("Input course credit: ");
        credit = scanner.nextInt();
        return credit;
        
    }

 
    public List<Course> getCourseList() {
        return courseList;
    }
 
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
    

}
