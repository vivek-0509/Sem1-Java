import java.util.*;
public class cp1{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int T=sc.nextInt();
         
       for(int a=0;a<T;a++){
        int N=sc.nextInt();
        int A[]=new int [N];
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
         int c=0;
        for(int i=0;i<A.length-1;i++){
           if(A[i+1]-A[i]!=5 && A[i+1]-A[i]!=7 && A[i+1]-A[i]!=-5 && A[i+1]-A[i]!=-7){
             c++;
             break;
           }
        }
        if(c>0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

       }
    
    }
}
