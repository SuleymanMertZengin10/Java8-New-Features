package _14.resource.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class _02ListResourceBundle {
	public static void main(String[] args) {
		
		ResourceBundle resourceBundle=ResourceBundle.getBundle("_14.resource.bundle.Message",new Locale("tr"));
		String key1tr=resourceBundle.getString("key1");
		String key2tr=resourceBundle.getString("key2");
		System.out.println(key1tr);
		System.out.println(key2tr);
		
		System.out.println("----------");
		
		ResourceBundle resourceBundle2=ResourceBundle.getBundle("_14.resource.bundle.Message",new Locale("en"));
		String key1en=resourceBundle2.getString("key1");
		String key2en=resourceBundle2.getString("key2");
		System.out.println(key1en);
		System.out.println(key2en);
		
		
	}

}
