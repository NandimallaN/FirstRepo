package com.app.array;

import java.util.Iterator;

public class ArrayDemo2 {
	public static void main(String[] args) {
		  int[][] array1=new int[3][3];
		  
		  
		for (int i = 0; i < 3 ; i++) {
            for(int j=0; j<3;j++)
            {
			array1[i][j]=i*3;
            }
		}
		
		for (int i = 0; i <3 ; i++) {
            for(int j=0; j<3;j++)
            {
            	System.out.print(array1[i][j] +"  ");
            }
            System.out.println();
		}
		
	}

}
