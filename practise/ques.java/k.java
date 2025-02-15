import java.util.*;

public class k{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        
        int N=sc.nextInt();
        int K=sc.nextInt();
        int A[]=new int [N];
      
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
       
       HashSet<Integer> ans= new HashSet<>();

        for(int i=0;i<A.length;i++){
            ans.add(K-A[i]);
        }
        
        for(int i=0;i<A.length;i++){
            if(ans.contains(A[i])){
                 ans.add(A[i]);
            }
        }

       
            System.out.print(ans);
        
    }
}


