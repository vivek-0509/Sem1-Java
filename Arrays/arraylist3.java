import java.util.*;

class arraylist3{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       ArrayList<Integer> list=new ArrayList<Integer>(List.of(3,2,5,3,6,9,5));
       ArrayList<Integer> ans=new ArrayList<Integer>();
       for(int i=0;i<list.size();i++){
        int c=0;
       for(int j=0;j<list.size();j++){
          if(list.get(i).equals(list.get(j)) && i!=j){
             c++;
          }
       }
       if(c==0){
        ans.add(list.get(i));
       }
    }
    for(int j=0;j<ans.size();j++){
        System.out.print(ans.get(j));
     }
    }
}
