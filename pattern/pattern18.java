import java.util.*;
class pattern18{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int N=sc.nextInt();
    
     for(int a=N;a>0;a--){
        for(char ch='A';ch<='A'+a-1;ch++){
            System.out.print(ch+" ");
        }
        System.out.println("");
     }

    }
}       