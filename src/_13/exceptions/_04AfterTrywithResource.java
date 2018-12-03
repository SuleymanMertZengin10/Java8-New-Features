package _13.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class _04AfterTrywithResource {
	public static void main(String[] args)  {
		
		//trywithResource
		try(FileWriter fw2=new FileWriter("text.txt")){
			//bu yapıyı kullandıgımızda close işlemi otomatik yapılıyor.Finally bloguna ihtiyacımız kalmıyor bu durumda 
		 //close genelde unutulabiliyor bu yapıda otomatik yapılıyor 
			fw2.write("dasd");
			
			//fw2 nin yaşam döngüsü bu blokla sınırlıdır aşagıda bir yerde kullanamyız!!!!
		}
		catch (IOException e) {

			
		}
	}

}
