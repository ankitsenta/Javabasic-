package basicSwapNumber;

public class SwapThreeNumbers {

	public static void main(String[] args) {
	
			int temp;
			int fno=50;
			int sno=150;
			int tno=200;
			
			System.out.println("number before swap");
			
			System.out.println("first number is " + fno +"  Second number is " + sno +"  Third number is "+tno);
		
		temp=fno;
		fno=sno;
		sno=tno;
		tno=temp;
		
		
		System.out.println("number after swap");
		
		System.out.println("first number is " + fno +"  Second number is " + sno +"  Third number is "+tno);
	}

}
