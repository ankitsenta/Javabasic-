package basicSwapNumber;

public class BankingInterest {

	public static void main(String[] args) {
		int deposit=50000;
		float interest = 6.8f;
		float finalAmount;
		int years=5;
        float finalInterest;
        System.out.println("total rupees for deposited in a Sarath's Account "+"Rs."+deposit);
        
        System.out.println("Interest rate for 5years  is "+interest+"%");
        
        finalInterest=(deposit*interest*years)/100;
        finalAmount=deposit+finalInterest;
        System.out.println("total Interest for deposited money in a Sarath's Account "+"Rs."+finalInterest);
        System.out.println("total amount after five years in a Sarath's Account "+"Rs."+finalAmount);     
        
	}

}