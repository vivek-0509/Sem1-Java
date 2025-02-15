import java.util.*;
class pattern12{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int N=sc.nextInt();

     for(int a=0; a<N ;a++){
        for(int m=0;m<a;m++ ){
            System.out.print(m+1);
        }
        for(int n=(2*N)-(2*(a+2)-2);n>0;n--){
            System.out.print(" ");
        }
        for(int l=a;l>0;l--){
            System.out.print(l);
        }
        System.out.println("");
     }
    }
}       