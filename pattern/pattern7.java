import java.util.*;
class pattern7{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int N=sc.nextInt();
     for(int a=0; a<N ;a++){
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

    }
}
