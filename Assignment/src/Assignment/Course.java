/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;
import java.io.Serializable;
/**
 *
 * @author Khuong Hung
 */
public class Course implements Serializable{
    private String name ;
    private String id;
    private int credit;

    public Course() {
    }

    public Course(String name, String id, int credit) {
        this.name = name;
        this.id = id;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    
}
