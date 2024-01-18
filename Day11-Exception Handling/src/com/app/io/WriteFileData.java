package com.app.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileData {

	static FileOutputStream fos=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Compile time Exception or Checked Exception
		File file=new File("Text.txt");
		String s="Welcome to Java programming IO CONCEPTS....";
		byte b[]=s.getBytes();
		
		
		try {
			fos=new FileOutputStream(file);
			fos.write(b);
			System.out.println("Data stored in file");
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Executed");
			
			try {
				fos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
