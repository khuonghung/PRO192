/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

/**
 *
 * @author Khuong Hung
 */
public class Officer extends Person{
    private double Salary;

    public Officer() {
    }

    public Officer(String name,double Salary) {
        super(name);
        this.Salary = Salary;
    }
    
    public void display(){
        System.out.println("Officer's name: "+super.getName());
        System.out.println("Officer's salary: "+Salary);
    }
    double getSalary(){
        return Salary;
    }
}