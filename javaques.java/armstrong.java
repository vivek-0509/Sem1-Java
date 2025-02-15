import java.util.Scanner;

class armstrong {
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int k=N;
      int d=0;
      int sum=0;
      while(N>0){
        d=N%10;
        
        sum=sum+d*d*dint m=d*d*d;;
        N=N/10;
      }
      if(sum==k){
        System.out.println("yes");
      }
      else{
        System.out.println("no");
      }
   }
}
