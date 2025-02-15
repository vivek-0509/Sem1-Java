import java.util.*;
class pattern10{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int N=sc.nextInt();

     for(int a=1; a<=N;a++){

        for(int m=0 ;m<a;m++){
           System.out.print("*");
        }
        System.out.println("");
     }

     for(int a=N-1; a>0;a--){

        for(int m=0 ;m<a;m++){
           System.out.print("*");
        }
        System.out.println("");
     }
   

    }
}