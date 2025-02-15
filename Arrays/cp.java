import java.util.*;


class cp
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int l=0;l<T;l++){
		int K=sc.nextInt();
		int N =sc.nextInt();
	
		 int [] A= new int[N];    //you can use long for big data.
       for(int i=0;i<A.length;i++){
        A[i]=sc.nextInt();
       }
         int j=0;
       for(int a=0;a<A.length;a++){
           int d=0;
         
           while(K>d){
               d=d+A[a];
               j++;
           }
       }
        System.out.println(j+1);
		}
      
	}
}

