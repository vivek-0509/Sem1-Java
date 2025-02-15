import java.util.*;
class patternbac{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int N=sc.nextInt();
     for(int i=1; i>0;i++){

        for(int a=N; a>0 ;a--){
            for(int m=0;m<N-a;m++){
               System.out.print(" ");
            }
          for(int l=0;l<2*a-1;l++){
              System.out.print("*");

          }
          for(int s=0;s<N-a;s++){
              System.out.print(" ");
           }
           System.out.println("");
      
           
          }
     }
  

    }
}