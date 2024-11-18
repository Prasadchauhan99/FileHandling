package com.in.out;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SecondFile {

	public static void main(String[] args)throws IOException
	{
		File file= new File("./simple.txt");
		if(!file.exists())
		file.createNewFile();
		
		
		FileInputStream fis = new FileInputStream(file);
	
		int asciiCode;
		while((asciiCode=fis.read()) !=-1)
		{
		System.out.print((char)asciiCode);
		}
		
		fis.close();

	}

}
