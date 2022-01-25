package basicSwapNumber;

public class JioFiberFinalBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int plancost=699;

System.out.println("total rupees for jiofiber plan are "+"Rs."+plancost);
int gst=18;
System.out.println("GST for jiofiber plan are "+gst+"%");

float finalCost;

finalCost=plancost+((gst*plancost)/100);

System.out.println("Final cost for jiofiber plan including tax are "+"Rs."+finalCost);
	
	
	}

}
