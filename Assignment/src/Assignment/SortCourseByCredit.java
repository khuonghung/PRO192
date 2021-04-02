/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;
import java.util.Comparator;
/**
 * SortCourseByCredit class
 *
 * @author Khuong Hung
 */
public class SortCourseByCredit implements Comparator<Course> {
    @Override
    public int compare(Course course1, Course course2) {
        if (course1.getCredit()> course2.getCredit()) {
            return 1;
        }
        return -1;
    }
}

