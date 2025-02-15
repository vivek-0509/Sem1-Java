import java.util.*;

class Circle{
  double radius;

   double area (double radius){
    return 3.14*radius*radius;
  }
  
   double  perimeter (double radius){
    return 2*3.14*radius*radius;
  }

}



public class oop1{
   
    public static void main(String []args){
        Scanner sc =new Scanner (System.in);
       Circle my =new Circle();
      System.out.println(my.area(2));
      System.out.println(my.perimeter(2));
     }
}

