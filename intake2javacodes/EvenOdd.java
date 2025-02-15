import java.util.*;
class EvenOdd{
       public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
	     int num = sc.nextInt();
/*	      if(num % 2 == 0){
                 System.out.println("number is even");


		    }

              else{
                 System.out.println("number is odd");
		    }

*/
              if(num % 15 == 0){ 
                 System.out.println("Fizz-Buzz");
		 } 
         
              else if(num % 3 == 0){

                 System.out.println("Fizz");
	     }
               else if(num % 5 == 0){

      
                 System.out.println("Buzz");
               }

           else {
              System.out.println("dumb");

  
		  }

       }}
