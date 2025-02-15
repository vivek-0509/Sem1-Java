import java.util.*;
class Prime{
      public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int c=2,k=0;
       while(c<a){
        if(a%c==0){
	      System.out.println("not prime");
	      k++;
	      break;
	     
	     }
         c++;}

	 if(k==0 ){
               System.out.println("prime");
	       }         
       
       
	     
		
		   
         

      }
}
