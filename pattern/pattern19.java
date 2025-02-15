import java.util.*;
class pattern19{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int N=sc.nextInt();
   
     for(int a=0;a<N;a++){
        char ch = 'A';
        ch = ch +a;
        for(int m=0;m<a;m++){
            System.out.print(ch+" ");
        }
        System.out.println("");
    
     }

    }
}       