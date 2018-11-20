package _01.lambdaexpression;

public class LambdaTest01 {

	public static void main(String[] args) {
//		Runnable r=new Runnable() {
//			
//			@Override
//			public void run() {
//			 System.out.println("#Runnable");
//				
//			}
//		};
//		
//		r.run();
//		r.run();
//		r.run();
//		r.run();
	 Runnable runnableLambda=()->System.out.println("#RunnableLambda");
	 runnableLambda.run();
	 System.out.println("--------------");
	 
	 Runnable runnableLambda2=()->{//birden fazla satır yazabiliyoruz
		 String deneme="Suleyman";
		 System.out.println("#RunnableLambda1");
		 System.out.println("#RunnableLambda2 "+ deneme);
	 };
	 runnableLambda2.run();
    
    
	 
		
		
	}

	
	
	
	
}
