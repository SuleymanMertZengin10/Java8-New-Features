package _13.exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class _01MultiCatch {

	public static void main(String[] args) {
		
		//multi catch java 7 ile birlikte gelen bir özellik 
		 
		try {
			testMethod();
		} catch (FileNotFoundException | SQLException e) {
			//(FileNotFoundException e2 | SQLException e) //hata verir 
			
			e.printStackTrace();
		}
		 
		 
		//önceki yaklasımda ekstra bir catch blogu daha yazıyoduk
		 try {
			testMethod();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		// catch (FileNotFoundException | IOException e) 
		//aralarında hiyerarşik bir ilişki oldugu için bu şekilde kullanmak legal değildir.
		//FileNotFoundException is-A IOException 
		
	}
	public static void testMethod() throws FileNotFoundException,SQLException{
		
	}
}

