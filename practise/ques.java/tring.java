import java.util.*;
public class tring{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
      
        int N=sc.nextInt();
        sc.nextLine();
        String A[]=new String [N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextLine();
        }
        
        for(int i=0;i<A.length;i++){
           String temp[]=A[i].split("");
           if(temp.length>10){
            System.out.println(temp[0]+(temp.length-2)+temp[temp.length-1]);
           }
          else{
            System.out.println(A[i]);
          }
        }
    }
}
