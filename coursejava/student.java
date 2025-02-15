import java.util.*;

class studen{
  int roll;
  String name;
  String course;
  int m1,m2,m3;
//    int m2;
//    int m3;

   public int total(){
       return m1+m2+m3;
   }

   public double average(){
        return (m1+m2+m3)/3;
   }

   public String grade(){
      if(average()>=60){
        return "A";
      }
      else{
        return "B";
      }
   }
}


public class student{
   
    public static void main(String []args){
        Scanner sc =new Scanner (System.in);
        studen s1=new studen();

        s1.m1=90;
        s1.m2=100;
        s1.m3=80;

        System.out.println(s1.total());
        System.out.println(s1.average());
        System.out.println(s1.grade());

     }
}


   

