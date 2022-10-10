package exam3;
import java.util.Scanner;

public class leastoffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String input1[][] = new String[n][3];
        
        for(int i=0;i<n;i++){
          input1[i] = sc.nextLine().split(",");
          }
          
          int discount[] = new int[n];
          for(int i=0;i<n;i++){
            discount[i] = (Integer.parseInt(input1[i][1])*Integer.parseInt(input1[i][2])/100);
            //System.out.println(discount[i]);
          }
          
          int min=9999;
          for(int i=0;i<n;i++){
            if(min>discount[i]) min=discount[i];
          }
          
          for(int i=0;i<n;i++){
            if(min==discount[i]) 
            	//System.out.println(discount[i]);
            	System.out.print(input1[i][0]+" ");
            System.out.println();
          }

	}

}
