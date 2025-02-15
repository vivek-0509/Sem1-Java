import java.util.*;
public class functionbubble {
    static void sort(int A[]){
       for(int i=0;i<A.length-1;i++){
        int m=0;
          for(int j=0;j<A.length-1-i;j++){
            if(A[j]>A[j+1]){
                int temp=A[j];
                A[j]=A[j+1];
                A[j+1]=temp;
                m++;
            }
          }
          if(m==0){
            break;
          }
       }
    }
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int A[]=new int[N];
    for(int i=0;i<A.length;i++){
        A[i]=sc.nextInt();
    }
     
    sort(A);
    for(int i=0;i<A.length;i++){
        System.out.print(A[i]);
    }
   }
}
