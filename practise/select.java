import java.util.*;
public class select{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
        int A[]=new int[N];

        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<A.length-1;i++){
            int min=i;
            for(int j=i+1;j<A.length;j++){
                 if(A[min]>A[j]){
                    min=j;

                 }
            }

            int temp=A[min];
            A[min]=A[i];
            A[i]=temp;

        }
    


        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
