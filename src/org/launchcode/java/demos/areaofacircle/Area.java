
package org.launchcode.java.demos.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        double radius ;
        double pi = 3.14;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();
        input.close();

         area = pi * radius * radius;

        System.out.println("The area of circle is: " + area);

    }
}
