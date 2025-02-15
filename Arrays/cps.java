import java.util.Scanner;

public class cps {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int k = 0; k< T;k++) {
         
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            
         
            int X = 0;
            int Y = 0;
            
           
            int l=0;
            
            for (int i = 0; i < n; i++) {
                char z = s.charAt(i);
                

                if(z=='N'){
                    Y++;
                }

                else if(z=='E'){
                    X++;
                }
                else if(z=='S'){
                    Y--;
                }
                else if(z=='W'){
                    X--;
                }

            
                if (X == a && Y == b) {
                    l++;
                    break;
                }
            //     if(i==n-1){
            //     i=0;
            //    }
               
                
            }
            
         
            if (l>0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
       


        
    }
}
