package _01.lambdaexpression;

public class DiamondProblem {
	public static void main(String[] args) {
		Class1 c1=new Class1();
		c1.method1();
	}
}
interface Interface1{	
	default void method1() {
		System.out.println("Interface1");
	}
}
interface Interface2{
	default void method1() {
		System.out.println("Interface2");
	}	
}
class Class1 implements  Interface1 ,Interface2{

	@Override
	public void method1() {
		
		Interface2.super.method1();
	}
	
}
