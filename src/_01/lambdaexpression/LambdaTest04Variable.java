package _01.lambdaexpression;

public class LambdaTest04Variable {
	int number;
	public static void main(String[] args) {
		
		String localVariable="Zengin";
		//localVariable="Yılmaz";
		//local değişkene 2 kere assigment yazık bu durmuda 
		//effectively final özelliğini kaybeder.
		//bu durumda lamda ifadesinde local değişkenş kullanamayız

		
		LambdaTest04Variable obje=new LambdaTest04Variable();
		obje.number=12;
		obje.number=21;
		//instance değişkenler için geçerli değil allta çağırabiliriz.
		Lambda lambda=str->{
        System.out.println(str+" " +localVariable+ " "+obje.number);
		};
        lambda.printMessage("Suleyman");
	
        
	}
	

}

interface Lambda{
	public void printMessage(String message);
}
