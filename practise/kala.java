import java.util.*;

class kala{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int T = sc.nextInt();


        for(int a=0;a<T;a++){

        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

       Arrays.sort(A);
 

        int sum =0;
        int ans=0;
       for(int i=N-1;i>=0;i--){
           sum=sum+A[i];
           if(sum>K){
            sum=sum-A[i];
            ans=K-sum;
            break;
           }

           else if(sum==K){
            ans=0;
            break;
           }

           
           
       }

       if(sum<K){
        System.out.println(K-sum);
       }
      else{
        System.out.println(ans);

      }
     
    }

    }
}
