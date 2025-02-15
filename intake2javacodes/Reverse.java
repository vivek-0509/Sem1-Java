import java.util.*;
class Reverse{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = 0;
 	while(n>0){
          int rem = n%10;
          n = n/10;
	  m  =m*10 + rem;
        }
	System.out.println(m);
	 }
      }
