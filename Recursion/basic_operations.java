public class basic_operations {
    // Printing Numbers from 10 to 1
    public static void printNumbers(int n){
        if(n==0){
            return ;
        }
        System.out.print(n+" ");
        printNumbers(n-1);
    }
    // printing numbers from 1 to 10
    public static void printnumbers(int n){
        if(n==0){
            return ;
        }
        printnumbers(n-1);
        System.out.print(n+" ");
        /* When n ==1 
         * if (n==6){
         * return;
         * }
         * System.out.print(n+" ");
         * printnumbers(n+1);
         */
    }
    // Sum of N natural Numbers
     
    public static int  sumOfNaturalNumbers(int n){
        int sum=n;
        if (n==0){
            return sum;
        }
        sum+=sumOfNaturalNumbers(n-1);
        return sum;
    }
    // Another Method with multiple parameters

    public static void sumOfNaturalNumbers(int i,int n , int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumOfNaturalNumbers(i+1, n, sum);
    }
    //Factorial of a Number

    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int i = factorial(n-1);
        int fact= n*i;
        return fact;
    }
    // fibanocci number

    public static int fibanocci(int n){
        if (n<=1){
            return n;
        }
        return fibanocci(n-1)+fibanocci(n-2);
    }

    // Fibanocci series
    public static void fibanocci(int a ,int b, int n){
        if (n==0){
            return;
        }
        System.out.print(a);
        int c= a+b;
        a=b;
        b=c;
        fibanocci(a, b, n-1);
        return;
    }
    public static int printPower(int x, int n) {
        if(n == 0) {
        return 1;
        }
        if(n % 2 == 0) {
        return printPower(x, n/2) * printPower(x, n/2);
        }
        else {
        return x * printPower(x, n/2) * printPower(x, n/2);
        }
    }

    // Reversing a String by using stack
    public static void revString(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        revString(str, idx-1);
    }
    
    // Finding First and Last occurence of a String

    public static int first =-1;
    public static int last =-1;

    public static void findOccurence(String str,char ch,int idx){
        if(idx==str.length()-1){
            System.out.println("first element is "+first+" last element is "+last);
            return;
        }
        if(str.charAt(idx)==ch){ 
            if(first==-1){
                first=idx;
            }else{
            last=idx;
            }
        }
        findOccurence(str, ch, idx+1);

    }

    // An Array Strictly Increasing
    public static boolean strictlyIncreasingArray(int [] arr , int idx ){
        if (idx== arr.length-1){
            return true;
        }
        if (arr[idx+1]>arr[idx]){
            return strictlyIncreasingArray(arr, idx+1);
        }
        else{
            return false;
        }
    }

    // Move all the X to the end
    public static void moveAllXToEnd(String str,int idx,int count,String newString){
        
        if (idx==str.length()){
            for(int i=0 ;i<count;i++)
            {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        if (str.charAt(idx)=='x' ){
            count++;
            moveAllXToEnd(str, idx+1, count, newString);
        }else{
            newString +=str.charAt(idx);
            moveAllXToEnd(str, idx+1, count, newString);
        }
    }

    public static boolean [] map= new boolean[26];
    public static void removeDuplicates(String str , int idx ,String newString){
        if (idx== str.length()){
            System.out.println(newString);
            return ;
        }
        char currChar= str.charAt(idx);
        if(map[currChar-'a']){
            removeDuplicates(str, idx+1, newString);
        }else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        int  n=5;
        printNumbers(n);
        printnumbers(n);
        System.out.println(sumOfNaturalNumbers(n));
        sumOfNaturalNumbers(1, 10, 0);
        System.out.println(factorial(n));
        System.out.println(fibanocci(n));
        fibanocci(0, 1, n);
        int x = 2;
        int output = printPower(x, n);
        System.out.println(output);
        String str ="abbccdda";
        revString(str, str.length()-1);
        System.out.println("\n");
        findOccurence(str, 'A', 0);
        int arr [] ={1,2,3,4,5,5};
        System.out.println(strictlyIncreasingArray(arr, 0));
        moveAllXToEnd(str, 0, 0, " ");
        removeDuplicates(str, 0, " ");
    }
}
 