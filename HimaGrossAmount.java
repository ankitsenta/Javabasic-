package basicSwapNumber;

public class HimaGrossAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int salary=85000;
int ta=15;
int da=20;
int hra=18;
int pf=20;
int tax=25;
int grossAmount;
int netAmount;
	
System.out.println("Hima's basic salary "+"Rs."+salary);

grossAmount=salary+((ta*salary)/100)+((da*salary)/100)+((hra*salary)/100);
	
netAmount=grossAmount-((tax*salary)/100)-((pf*salary)/100);	
	
System.out.println("Hima's gross income "+"Rs."+grossAmount);
System.out.println("Hima's gross income "+"Rs."+netAmount);	
	}

}
