
public class Calculator {
	int n1=5,n2=10;
	
	public void add()
	{
		System.out.println("Sum is"+(n1+n2));
	}
	public void product()
	{
		System.out.println("Product is "+ (n1*n2));
	}
	public static void main(String args[])
	{
		Calculator calculator=new Calculator();
		calculator.add();
	}
}
