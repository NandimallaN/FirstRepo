package com.app;

import java.util.Scanner;
import java.lang.String;


class Stringcomputation
{
    public static void main(String args[])
    {
        int ch = 0;
        String s = "",s1 = "",s2 = " ";
        boolean s3;
        int l= 0;
        Scanner sc = new Scanner(System.in);

        // Here we are displaying the menu
        System.out.println("1- String Trimming");
        System.out.println("2- String Comparison");
        System.out.println("3: Length Of String");
        System.out.println("4: String Concatenation");
        System.out.println("5: Quit");


        System.out.print("Input your choice: ");
        ch = sc.nextInt(); // Here we are reading user's choice

        switch (ch)
        {
            case 1:  // Here we are performing string trimming
                sc.nextLine();
                System.out.println("Input the string: ");
                s=sc.nextLine();

                s1= s.trim();
                System.out.println("\nThe Trimmed String is:" + s1);

                break;

            case 2:  // Here we are doing string comparison

                sc.nextLine();
                System.out.println("Input First string: ");
                s=sc.nextLine();
                System.out.println("Input Second string: ");
                s1=sc.nextLine();
                s3 = s.equals(s1);

                System.out.println("The First String: "+ s);
                System.out.println("The Second String: "+ s1);
                System.out.println("\nThe Comparison Of String is: "+ s3);

                break;


            case 3: // Here we are computing the length of the string

                sc.nextLine();
                System.out.println("Input the string: ");
                s=sc.nextLine();
                l = s.length();
                System.out.println("The Length of string is: " + l);
                break;

            case 4:  // Here we are performing of string concatenation
                sc.nextLine();
                System.out.println("Input the First String" );
                s=sc.nextLine();
                System.out.println("Input the Second String" );
                s1=sc.nextLine();
                s2 = s.concat(s1);

                System.out.println("The First String is: "+ s);
                System.out.println("The Second String is: "+ s1);
                System.out.println("\n The Concatenated string is: "+ s2);

                break;

            case 5:
                System.exit(0);

            default:
                System.out.println("The choice is Invalid! Enter a valid choice. \n\n");
        }
    }

}
