import java.util.*;
class pattern23{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int N=sc.nextInt();
     int k=N;
     for(int a=0; a<N ;a++){
          for(int m=0;m<2*N-1-a; m++){
            System.out.print(" ");
          }
          for(int l=0;l<2*a+1;l++){
            System.out.print("*");
          }
          for(int n=0;n<2*N-1-a; n++){
            System.out.print(" ");
          }
         
         System.out.println(" ");
         
     }
       N=2*N-1;
     for(int a=N; a>N-k ;a--){
        for(int m=0;m<N-a; m++){
          System.out.print(" ");
        }
        for(int l=0;l<2*a+1;l++){
          System.out.print("*");
        }
        for(int n=0;n<N-a; n++){
          System.out.print(" ");
        }
       
       System.out.println(" ");
       
   }

   for(int a=k; a<N+1 ;a++){
    for(int m=0;m<N-a; m++){
      System.out.print(" ");
    }
    for(int l=0;l<2*a+1;l++){
      System.out.print("*");
    }
    for(int n=0;n<N-a; n++){
      System.out.print(" ");
    }
   
   System.out.println(" ");
   
}

    

for(int a=k-1; a>-2 ;a--){
    for(int m=0;m<2*k-1-a; m++){
      System.out.print(" ");
    }
    for(int l=0;l<2*a+1;l++){
      System.out.print("*");
    }
    for(int n=0;n<2*k-1-a; n++){
      System.out.print(" ");
    }
   
   System.out.println(" ");
   
}
   
    }
}