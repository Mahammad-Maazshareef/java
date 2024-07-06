public class patterns
{
    public static void main(String[] args) {
        int n=5;
        // Square patten
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");


        // Hallow Square Pattern
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n; j++){
                if(j==1||i==1 ||i==n|| j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
        System.out.println("\n\n");

        // Half left Pyramid
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } 

        System.out.println("\n\n");

        //Inverse half Pyramid
        for(int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //Half Right pyramid
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                    System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        // Half Left Pyramid with numbers

        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        } 

        System.out.println("\n\n");

        //Inverse half Pyramid with numbers
        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //Inverse half Pyramid with numbers code 2
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n\n");

        int count=1;
        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        // Half left Pyramid with countinuous numbers / Floid Traingle 
        int c=1;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print(c++ + " ");
            }
            System.out.println();
        } 
        System.out.println("\n\n");

        // Half left Pyramid with 0 and 1 / 0-1 Traingle
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
                if ((i+j)%2==0)
                    System.out.print(1);
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        } 
        System.out.println("\n\n");

        // Butterfly Patten
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");


        //Solid Rhombus
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<n-i+1;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");


        //Hallow Rhombus
        //Solid Rhombus
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<n-i+1;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=n; j++){
                if(j==1||i==1 ||i==n|| j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Pyramid Number
        for (int i=1;i<=n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //Palindromic Pyramid pattern
        for (int i=1;i<=n;i++){
            for (int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for (int j=i;j>1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n\n");


        // Daimond Pattern
        for (int i=1;i<=n;i++){
            for (int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for (int j=i;j>1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for (int j=i;j>1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //Method 2
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}