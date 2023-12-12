package com.String;
import java.io.*;
public class Stringuse 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("G:\\Data stuacture java\\String\\src\\com\\String\\hello.txt");
		FileReader fr=new FileReader(file);
		
		int sin;
		while((sin =fr.read())!=-1)
		{
			System.out.print((char)sin);
		}
		String cont=null;
		BufferedReader br=new BufferedReader(fr);
		while((cont = br.readLine())!=null)                                               
		{
			System.out.println(cont);
		}
	}
}
