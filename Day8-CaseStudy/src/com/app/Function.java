package com.app;

import java.util.Scanner;

//Class is created here
public class Function {
  //Here we are declaring all the Variables and Scanner class
  static Scanner scanner = new Scanner(System.in);
  static double l,b,s,r,ar;
  static final  double pi =3.14;
  static int choice = 0;

  //Main method is created here
  public static void main(String[] args) {

      //Here we are asking the user to make a choice
      System.out.println("Enter 1 for The Area of Square");
      System.out.println("Enter 2 for The Area of Rectangle");
      System.out.println("Enter 3 for The Area of Circle");
      System.out.println("Enter 4 to Quit");
      choice = scanner.nextInt();

      //Switch block is created here
      switch (choice) {

          case 1:
              square();
              break;
          case 2:
              rectangle();
              break;
          case 3:
              circle();
              break;
          case 4:
              System.exit(0);
          default:
              System.out.println("You have inputted the invalid choice\n");
      }

  }

  //This is the method to evaluate the area of square
  public static void square(){
      System.out.println("Enter the side of the Square");
      s=scanner.nextDouble();
      ar = s*s;
      System.out.println("Area of the Square is: = "+ar +"square unit");
  }

  //This is the method to evaluate the area of the rectangle
  public static void rectangle(){
      System.out.println("Enter the length of the Rectangle");
      l=scanner.nextDouble();
      System.out.println("Enter the breadth of the Rectangle");
      b=scanner.nextDouble();
      ar=l*b;
      System.out.println("Area of the Rectangle is: = "+ar +"square unit");
  }

  //This is the method to evaluate the area of the circle
  public static void circle(){
      System.out.println("Enter the readius of the Circle");
      r=scanner.nextDouble();
      ar=pi*r*r;
      System.out.println("The area of the Circle = "+ar +"square unit");
  }
}
