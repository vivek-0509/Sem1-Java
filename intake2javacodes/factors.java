import java.util.*;
class factors{
   public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   int N=sc.nextInt();
   int m=2;
   while(N>0){
     if(N%m==0){
       System.out.print(m+" ");
        N=N/m;
        }
     else{
	   m++;
       }
     }
   }
}
