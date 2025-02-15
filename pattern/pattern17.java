import java.util.*;
class pattern17{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int N=sc.nextInt();
     
     for(int a=0; a<N ;a++){
        for(char ch = 'A';ch<='A'+a;ch++){
            System.out.print(ch+" ");
        }
        System.out.println("");
     }

    }
}       