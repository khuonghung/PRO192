/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

import java.util.Date;

/**
 *
 * @author Khuong Hung
 */
public class Students {
    
    private String name;
    private String studentId;
    private Date birthDate;
    private String address;
    private String major;
    private double mark;

    public Students() {
    }

    public Students(String name, String studentId, Date birthDate, String address, String major, double mark) {
        this.name = name;
        this.studentId = studentId;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    
    public void printAllAttributes() {
        System.out.println("Student info : ");
        System.out.println("Name : " + name);
        System.out.println("ID : " + studentId);
        System.out.println("Birth date : " + birthDate);
        System.out.println("Address : " + address);
        System.out.println("Major : " + major);
        System.out.println("Mark : " + mark);
        
    }
    
    
}
