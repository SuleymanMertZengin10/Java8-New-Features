package _13.exceptions;

public class _06SuppressedException {

	public static void main(String[] args) {
		
		try (Computer c=new Computer()){
			System.out.println("try blockk");
			throw new RuntimeException();//1.exception
		}
		catch (Exception e) {
			System.out.println("CATCH BLOG");
			System.out.println(e.getMessage());
			//
			for(Throwable t:e.getSuppressed()) {
				System.out.println(t.getMessage());
			}
			
		}
	}

}

class Computer implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Shut down......");
		throw new IllegalStateException("Exception in close ");//2.exception (suppres exception)
	}
	
	
}