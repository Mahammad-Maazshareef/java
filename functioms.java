import java.util.*;
public class functioms {
    public static void printMyName(String name){
        System.out.println(name);

        return ;
    }
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt(); 
        System.out.println(calculateSum(a, b));


        String name= sc.nextLine();
        printMyName(name);
    }
}
  