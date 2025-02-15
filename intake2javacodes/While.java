 import java.util.*;
public class While {
      public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m  = 1;
       while(m <= n/2){
	    if(n % m == 0) {
             System.out.println(m);
	   }

           m=(m+1);

	   }  
      System.out.println(n);





	    }

}
