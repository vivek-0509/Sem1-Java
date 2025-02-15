import java.util.*;
class patterndia{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int N=sc.nextInt();

     for(int a=N; a>0 ;a--){
        for(int m=0;m<a;m++ ){
            System.out.print("*");
        }
        for(int n=(2*N)-(2*a);n>0;n--){
            System.out.print(" ");
        }
        for(int l=a;l>0;l--){
            System.out.print("*");
        }
        System.out.println("");
     }

     for(int a=1; a<=N ;a++){
        for(int m=0;m<a;m++ ){
            System.out.print("*");
        }
        for(int n=(2*N)-(2*a);n>0;n--){
            System.out.print(" ");
        }
        for(int l=a;l>0;l--){
            System.out.print("*");
        }
        System.out.println("");
     }
    }
}       
