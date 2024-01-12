package com.app;

import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        int ch = 0; // It is used for storing the user choice here
        double area; // It is used for storing are
        // It is used for storing the variable for various//proportions of geometric figures
        int l = 0, b = 0, h = 0, d1 = 0, d2 = 0;
        int s = 0;
        int r = 0 ;
        Scanner sc = new Scanner(System.in); // It creates the object of scanner class
        // Here we are displaying the menu
        System.out.println("1: The area of equilateral triangle is:");
        System.out.println("2: The area of square is:");
        System.out.println("3: The area of rectangle is:");
        System.out.println("4: The area of circle is:");
        System.out.println("5: The area of rhombus is:");
        System.out.println("6: Exit");
        loop : while(true) // Here we are labeling the while loop
        {
            System.out.print("Input your choice: ");
            ch = sc.nextInt(); // reading user's choice
            switch (ch)
            {
                case 1:
                    System.out.print("Input the side of an Equilateral Triangle \n");
                    s = sc.nextInt();
                    area=(s* s * Math.sqrt(3)) / 4;
                    System.out.println("The area of the Equilateral triangle is " + area + "\n\n");
                    break;
                case 2:
                    System.out.print("Input the side of a Square \n");
                    s = sc.nextInt();
                    area = s * s;
                    System.out.println("The area of the square is "+ area + "\n\n");
                    break;
                case 3:
                    System.out.print("Input the length of a Rectangle \n");
                    l = sc.nextInt();
                    System.out.print("Input the breadth of the Rectangle \n");
                    b = sc.nextInt();
                    area = l * b;
                    System.out.println("Area of the Rectangle is " + area + "\n\n");
                    break;
                case 4:
                    System.out.print("Input the radius of a Circle \n");
                    r = sc.nextInt();
                    area = r * r * 22 / 7;
                    System.out.println("Area of the Circle is " + area + "\n\n");
                    break;
                case 5:
                    System.out.print("Input the first diagonal of a Rhombus \n");
                    d1 = sc.nextInt();
                    System.out.print("Input the second diagonal of the Rhombus \n");
                    d2 = sc.nextInt();
                    area = d1 * d2 * 1 / 2;
                    System.out.println("Area of the Rhombus is " + area + "\n\n");
                    break;
                case 6:
                    // Here we are exiting from the switch case as well as from the while loop using its label loop
                    break loop;
                default:
                    System.out.println("It is an Invalid choice! Please make a valid choice. \n\n");
            }
        }
    }
}
