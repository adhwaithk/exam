package exam3;
import java.util.*;


public class fuel {

	public static void main(String[] args) {
		
	      Scanner sc= new Scanner (System.in);

	      System.out.println("Enter the no of liters to fill the tank");
	      int ltt =sc.nextInt();
	      Float lt= (float) (ltt*1.00);

	      if(ltt<1){
	          System.out.println(ltt+" is an Invalid Input");
	          System.exit(0);
	          
	      }
	      
	      System.out.println("Enter the distance covered");
	      int diss =sc.nextInt();
	      float dis= (float) (diss*1.00);

	      if(diss<1){
	          System.out.println(diss+" is an Invalid Input");
	          System.exit(0);
	      }
	      
	      float hundered = ((lt/dis)*100);
	      System.out.println("Liters/100KM");
	      System.out.printf("%, .2f",hundered);
	      System.out.println();
	      float miles = (float) (dis*0.6214);
	      float gallons =(float) (lt*0.2642);
	      float mg = miles/gallons;
	      System.out.println("Miles/gallons");
	      System.out.printf("%, .2f",mg);
	     
		

	}

}
