public class permutationsOfString {
    public static void permutation(String str, String permString){
        if(str.length()==0){
            System.out.println(permString);
            return;
        }
        for(int i=0 ;i<str.length();i++){
            char currChar = str.charAt(i);
            String perm = str.substring(0, i)+str.substring(i+1);
            permutation(perm, permString+currChar);
        }
    }
    public static void main(String[] args) {
        String str= "abc";
        permutation(str, " ");
    }
}
