package BasicNg;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=10)
	public void Sum()
	{
		int a = 20;
		int b = 10;
		int c = a +b;
		System.out.println("Sum is ="+ c);
	}
	
}
