package basicSwapNumber;

public class Swaptwonumber {
	
	public static void main(String[] args)
	{
		int temp;
		int fno=50;
		int sno=150;
		System.out.println("number before swap");
		
		System.out.println("first number is " + fno+ "\t" +"Second number is " + sno);
	
	temp=fno;
	fno=sno;
	sno=temp;
	
	System.out.println("number after swap");
	
	System.out.println("first number is " + fno+ "\t" +"Second number is " + sno);
	}

}
