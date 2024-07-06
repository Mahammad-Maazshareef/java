import java.util.*;
public class Arrays {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int [] marks= new int[size];
        for (int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for (int i=0;i<size;i++){
            if(marks[i]==target)
                System.out.println(i+" is the index of "+marks[i]);
        }

        // 2 D arrays

        int [][] numbers = new int [3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }

       
        
    }
}
