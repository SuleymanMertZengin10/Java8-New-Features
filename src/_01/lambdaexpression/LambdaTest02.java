package _01.lambdaexpression;

public class LambdaTest02 {
	public static void main(String[] args) {
	  Calculator calculator=(x,y)->  x+y;
	  System.out.println(calculator.operation(11, 11));
	  
      Calculator calculator2=(int x,int y)->  x*y;
	  System.out.println(calculator2.operation(2, 12));
	  
	  //Calculator calculator2=(int x,y)->  x*y; ikisinide açık açık yaz
	  //(int x,y)  legal değil ya ikisi yada hiç biri 
	  
	  Calculator calculator3=(int x,int y)-> {
		  if(y!=0) 
			  return  x/y;  
		  else
		  return -1;
		 
	  };
	  System.out.println(calculator3.operation(2, 0));	
	  System.out.println(calculator3.operation(12, 2));
	
	}

}


@FunctionalInterface
interface Calculator{
	default void denemeDefault() {
		//kullanabiliriz
	}
	static  void denemeStatic() {
		//kullanabiliriz
	}
	int operation(int number1,int number2);
//	int operation2(int number1,int number2); iki tane abstract metot oldugundan hata verir
	
	 
	
}
