import java.util.*;
class patternpr{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int N=sc.nextInt();
     for(int a=N ;a>0 ;a--){

        for(int m=0;m<a ;m++){
            System.out.print("*");
        }

        for(int n=0 ;n<2*N-2*a ;n++){
            System.out.print(" ");
        }
        for(int s=0;s<a ;s++){
            System.out.print("*");
        }
 System.out.println("");
     }
   
for(int a=1 ;a<=N ;a++){

    for(int m=0;m<a ;m++){
        System.out.print("*");
    }

    for(int n=0 ;n<2*N-2*a ;n++){
        System.out.print(" ");
    }
    for(int s=0;s<a ;s++){
        System.out.print("*");
    }
System.out.println("");
 }

    }
}