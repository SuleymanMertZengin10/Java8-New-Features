package _13.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class _03BeforeTrywithResource {

	public static void main(String[] args) {
	   FileWriter fw=null;
		try {
			fw=new FileWriter("text.txt");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				fw.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
		} 
		
	}
}
