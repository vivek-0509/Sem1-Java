import java.util.*;

public class xont{
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

        int z=0;
        for(int i=0;i<A.length;i++){
            int c=0;
            for(int j=0;j<A.length;j++){
                if(Math.abs(A[i]-A[j])%K!=0 && i!=j){
                  c++;
                  
                }
            }

            if(c>0){
                System.out.println("Yes");
                System.out.println(i+1);
                z++;
                break;
            }
        }
      
       if(z==0){
           System.out.println("NO");
       }
       
     
    }

    }
}
