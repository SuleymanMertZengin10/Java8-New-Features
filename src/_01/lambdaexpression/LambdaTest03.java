package _01.lambdaexpression;

public class LambdaTest03 {

	public static void main(String[] args) {

		Message message1=(String str)->{
			System.out.println(str);
		};
		Message message2=str->System.out.println(str);
		//tipini belirtmezsek paranteze gerek yok.Tek parametre için 
		
		message1.printMessage("talha");
		
	}
	
} 
@FunctionalInterface
interface Message{
	public void printMessage(String message);
	
}
