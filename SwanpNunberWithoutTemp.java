package basicSwapNumber;

public class SwanpNunberWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int temp;
		int fno=50;
		int sno=150;
		System.out.println("number before swap");
		
		System.out.println("first number is " + fno+ "\t" +"Second number is " + sno);
	
	sno=fno+sno;
	fno=sno-fno;
	sno=sno-fno;
	
	System.out.println("number after swap");
	
	System.out.println("first number is " + fno+ "\t" +"Second number is " + sno);
	}

}
