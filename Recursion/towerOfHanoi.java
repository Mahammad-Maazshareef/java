public class towerOfHanoi {
    public static void towerofHanoi(int n , String src, String help, String dest) {
        if (n==1){
            System.out.println(" Transfer disk "+src +" from "+ "to " + dest );
            return;
        }
        towerofHanoi(n-1, src, dest, help);
        System.out.println(" Transfer disk "+src +" from "+ "to " + dest );
        towerofHanoi(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        int n=3;
        towerofHanoi(n, "s", "h", "d");
    }
}
// Expalanation of the above code 
//1. first step includes transfer all the disks except last one from src to help by considering dest as helper
// 2. transfer the last disk from src to dest
// 3. in this step change helper as src and use src as helper 