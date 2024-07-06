import java.util.*;
public class strings {
    public static void main(String[] args) {
        // String Operations
         String name= "Tony Stark";
         System.out.println(name);
         System.out.println(name.length());
         System.out.println(name.charAt(8));
         // compare Operation
         String name1= "tony";
         String name2="tony";
         //if s1>s2  : +ve value
         //if s1==s2 : 0
         //if s1<s2 : -ve value
         if (name1.compareTo(name2)==0){
            System.out.println("both are eqaul");
         }
         else{
            System.out.println("they are not eqaul");
         }
         System.out.println();
         if (new String("maaz")== new String("maaz")){
            System.out.println("both are eqaul");
         }
         else{
            System.out.println("they are not eqaul");
         }
         // Sub String Function
         String sentence="Hi maaz! wassup";
         String subStringg= sentence.substring(3,7);
         System.out.println(subStringg);

         // Convert String to number
         String str = "123";
         int number = Integer.parseInt(str);
         System.out.println(number);
         
         // number to String
         String strr = Integer.toString(number);
         System.out.println(strr);

         // String Builder
         StringBuilder sb = new StringBuilder("maaz");
         System.out.println(sb);

         //set char At 
         sb.setCharAt(0,'r' );
         System.out.println(sb);

         // Insert new charecter
         sb.insert(0,"R" );
         System.out.println(sb);

         // Delete the charecters
         sb.delete(0, 2);
         System.out.println(sb);

         //REversing a String
         StringBuilder example= new StringBuilder("hello");
         for(int i=0;i<example.length()/2;i++)
         {
            int front=i;
            int back=example.length()-1-i;
            char frontchar=example.charAt(front);
            char backchar = example.charAt(back);
            example.setCharAt(front, backchar);
            example.setCharAt(back, frontchar);
            
         }
         System.out.println(example);
    }
    
}
