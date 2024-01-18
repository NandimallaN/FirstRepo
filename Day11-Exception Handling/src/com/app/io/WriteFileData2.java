package com.app.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileData2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Compile time Exception or Checked Exception
		File file=new File("sss");
		String s="Excelon Soluations....";
		byte b[]=s.getBytes();
		 
		// This is Java 7 Features [ Try with Resource Statement]
		try(FileOutputStream fos=new FileOutputStream(file)) 
		{
			fos.write(b);
			System.out.println("Data stored in file");
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found"+e.getMessage());
			//e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
