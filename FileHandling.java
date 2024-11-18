package com.in.out;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling {

	public static void main(String args[])throws IOException
	{
		
		//File f = new File("C:\\prasad\\FilesHaldling\\ChauhanFiles.txt");
		File f1=new File("C:\\Users\\prasa\\eclipse-workspace\\FileHandlingInJava");
		
		
		
		System.out.println(Arrays.toString(f1.listFiles()));
		
		/*for(String fileName:f1.list())
		{
			System.out.println(fileName);
		}
		*/
		//System.out.println(f1.mkdirs());
		
		//System.out.println(f.createNewFile());
		//System.out.println(f1.createNewFile());
		
		//System.out.println(f.delete());
		//System.out.println(f1.delete());
		
		
	//System.out.println(f1.canWrite());
	//f1.setWritable(true);
	//System.out.println(f1.canWrite());
		
	}
	
}
