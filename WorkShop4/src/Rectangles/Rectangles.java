/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangles;

import java.util.Scanner;

/**
 *
 * @author Khuong Hung
 */
public class Rectangles {
    private double width ;
    private double height;
    private double area;
    private double perimeter;

    public Rectangles() {
    }

    public Rectangles(double width, double height, double area, double perimeter) {
        this.width = width;
        this.height = height;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        area = height*width;
        System.out.println(area);
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        perimeter = (height + width)*2;
        System.out.println(perimeter);
     return  perimeter;
        
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

   
   
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width : ");
        width = sc.nextDouble();
        System.out.print("Enter height : ");
        height = sc.nextDouble();
        
        
    }
    
    public void display(){
        System.out.println("Width : " + width + "\t" + "Height : " + height);
    }
    
}
