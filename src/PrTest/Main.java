package PrTest;

public class Main {
      private int i=1; //Class variables that are declared as private can not be referred to from other classes, they are only visible within their own class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		Main s=new Main();
		s.someMethod();
		

	}
	public static void someMethod()
	{
		System.out.println(i);
	}
	
}
