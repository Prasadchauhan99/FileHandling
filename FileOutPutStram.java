package com.in.out;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadersss {

	public static void main(String[] args)throws IOException {
		File file= new File("./simple.txt");
		if(!file.exists())
			file.delete();
		file.createNewFile();
		
		
		String s = "chauhan k prasad good morning chauhan";
		FileOutputStream fos = new FileOutputStream(file);
		
		
		for(char ch:s.toCharArray())
		{
			fos.write((int)ch);
		}
		
		
		fos.flush();
		
		
		
		fos.close();
		
		
		
		
		
		
		

	}

}
