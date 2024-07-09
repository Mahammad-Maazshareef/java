import java.util.HashSet;

public class subsequencesOfString {
    public static void subsequences(String str , int idx , String newString){
        if(idx== str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be part of the String
        subsequences(str, idx+1, newString+currChar);
        // not to be the part of the string
        subsequences(str, idx+1, newString);
    }

    // Unique Subsequences
    public static void uniquesubsequences(String str , int idx , String newString ,HashSet<String>set){
        if(idx== str.length()){
            if (set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
            
        }
        char currChar = str.charAt(idx);
        // to be part of the String
        uniquesubsequences(str, idx+1, newString+currChar,set);
        // not to be the part of the string
        uniquesubsequences(str, idx+1, newString,set);
    }

    public static void main(String[] args) {
        String str="aaa";
        HashSet <String> set = new HashSet<>();
        subsequences(str,0, " ");
        uniquesubsequences(str, 0, " ",set);
    }
}
