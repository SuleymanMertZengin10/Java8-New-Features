package _14.resource.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class _01PropertyResourceBundle {
	
	public static void main(String[] args) {
		ResourceBundle bundle=ResourceBundle.getBundle("config",new Locale("tr"));
		String message=bundle.getString("message");
		System.out.println(message);
		
		
		ResourceBundle bundle2=ResourceBundle.getBundle("config",new Locale("en"));
		String message2=bundle2.getString("message");
		System.out.println(message2);
	}

}
//public class PropertyResourceBundle extends ResourceBundle 
//public abstract class ResourceBundle 

//java.util.MissingResourceException dosya bulunamazsa bu hatayı alırız

//dosyaların uzantısı properties olacak
//dosyaismi_localbilgisi.properties formaatında olmalı dosyalar
