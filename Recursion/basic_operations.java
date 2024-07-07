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
        System.out.println(a);
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
    }
}
