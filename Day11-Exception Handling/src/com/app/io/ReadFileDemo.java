package com.app.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFileDemo {

	
	public static void readData() throws FileNotFoundException{
		FileInputStream file=new FileInputStream("Text1.txt");
		throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readData();
		} catch (FileNotFoundException e) {
			System.out.println("Message====>   "+e.getMessage());
		}
	}

}
