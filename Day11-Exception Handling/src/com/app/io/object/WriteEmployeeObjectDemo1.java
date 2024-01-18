package com.app.io.object;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class WriteEmployeeObjectDemo1 {

	
	public static void main(String[] args) {
		
		Employee emp=new Employee(101,"Ramana", LocalDate.now(),"Employee Date");
		File file=new File("employee.txt");
		
		
		try(FileOutputStream fos=new FileOutputStream(file);
				ObjectOutputStream oos=new ObjectOutputStream(fos)) {
			
			
			oos.writeObject(emp);
			
		} catch (FileNotFoundException e) {
			System.out.println(" File not found ===>  "+ e.getMessage());
			e.printStackTrace();
		} catch (IOException e1) {
			//System.out.println(" File not found==="+ e1.getMessage());
			e1.printStackTrace();
		}

	}

}
