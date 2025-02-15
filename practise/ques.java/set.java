import java.util.*;

public class set{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        
        int N=sc.nextInt();
        int K=sc.nextInt();
        int A[]=new int [N];
        int B[]=new int[K];
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<B.length;i++){
            B[i]=sc.nextInt();
        }
    
       HashSet<Integer> ans= new HashSet<>();
       HashSet<Integer> ans1= new HashSet<>();
        for(int i=0;i<A.length;i++){
            ans.add(A[i]);
        }
        
        for(int i=0;i<B.length;i++){
            if(ans.contains(B[i])){
                 ans1.add(B[i]);
            }
        }

       
            System.out.print(ans1);
        
    }
}


