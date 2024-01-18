package com.app.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {

	
	public static void readData() throws IOException{
		int ch=0;
		FileInputStream file=new FileInputStream("Text.txt");
		while((ch=file.read())!=-1)
		{
			System.out.print((char)ch);
		}
		throw new FileNotFoundException();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			readData();
		} catch (FileNotFoundException e) {
			System.out.println("Message====>   "+e.getMessage());
		}
	}

}
