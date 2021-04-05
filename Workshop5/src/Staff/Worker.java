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
    public class Worker extends Person{
    private double hrs;
    final double RATE = 5.5;
    public Worker() {
    }
    public Worker( String name,double hrs) {
        super(name);
        this.hrs = hrs;
    }
    public void display(){
        System.out.println("Worker's name: " + super.getName());
        System.out.println("Worker's salary: " + getSalary());
    }
    double getSalary(){
        return hrs+RATE;
    }
}

