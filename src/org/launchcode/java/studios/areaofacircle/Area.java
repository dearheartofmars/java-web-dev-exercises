package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius.");
        double radius = input.nextInt();
        double area = Circle.getArea(radius);
        System.out.println("The Area of the circle of radius " + radius + " is: " + area);
    }
}
