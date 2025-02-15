import java.util.*;
class largest2nd{
    public static void main(String [] Args){
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
        int []A=new int[N];
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
       
        int max=A[0];
        int max2=0;
         
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max2=max;
                max=A[i];
            }
            else if( A[i]<max && A[i]>max2 ){
                  max2 =A[i];
            }
        }
       System.out.println(max2);
    }
}