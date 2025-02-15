import java.util.*;
class Prime {
   public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int x =2;
   boolean flag = true;
   while(x*x <= N ){
	 if(N%x==0){
          System.out.println("Not Prime");
	  flag=false;
          break;
	 }
        x ++;
	   }
	  if(flag==true){
	  System.out.println("prime");
}
	 }
      }

