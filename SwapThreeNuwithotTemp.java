package basicSwapNumber;

public class SwapThreeNuwithotTemp {

	public static void main(String[] args) {
		
		//int temp;
		int fno=50;
		int sno=150;
		int tno=200;
		
		System.out.println("number before swap");
		
		System.out.println("first number is " + fno +"  Second number is " + sno +"  Third number is "+tno);
	
		fno=fno+sno+tno;
		sno=fno-(sno+tno);
		tno=fno-(sno+tno);
		fno=fno-(sno+tno);
	
	System.out.println("number after swap");
	
	System.out.println("first number is " + fno +"  Second number is " + sno +"  Third number is "+tno);	
	
}
}