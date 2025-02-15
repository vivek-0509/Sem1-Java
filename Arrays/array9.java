import java.util.*;

class array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] M = new int[N];

        for (int i = 0; i < M.length; i++) {
            M[i] = sc.nextInt();
        }
        
        int k=sc.nextInt();
       int c=0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) { //start j from i+1 to reduce itertions
                if(M[i]+M[j]==k && i!=j){
                    c++;
                    break;
                   
                }
            }
            // for (int j = M.length-1; j>0; j++) {
            //     if(M[i]+M[j]==k && i!=j){
            //         c++;
            //         break;
                   
            //     }
            
            // }
    
        }
        if(c>0){
            System.out.println("yes");

        }
        else{
            System.out.println("no");
        }

    }
}