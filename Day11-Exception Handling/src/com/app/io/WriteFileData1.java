package com.app.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileData1 {

	public static void main(String[] args)  throws FileNotFoundException, IOException{
		// TODO Auto-generated method stub
		
		// Compile time Exception or Checked Exception
		File file=new File("Text.txt");
		String s="Excelon Soluations....";
		byte b[]=s.getBytes();
		
		
			FileOutputStream fos=new FileOutputStream(file);
			fos.write(b);
			System.out.println("Data stored in file");
		
		

	}

}
