import java.util.*;

class array11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] M = new int[N];

        for (int i = 0; i < M.length; i++) {
            M[i] = sc.nextInt();
        }
        
       
          int s=0;
        for (int i = 0; i < M.length; i++) {
        
            for (int j = 0; j < M.length; j++) {
              if(M[j]==M[i]){
              s++;
              }
            }  
            if(s%2!=0){
                System.out.println(M[i]);
                break;
              }
              
        }
            
        
    

    }
}
