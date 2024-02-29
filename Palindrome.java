public class Palindrome {
    static boolean palindrome(String s,int i, int j){
        if(s.charAt(i)!=s.charAt(j)) return false;
        if(i>=j) return true;
        return palindrome(s, i+1, j-1);
    }
    public static void main(String[] args) {
        String s="madam";
        System.out.println(palindrome(s, 0, s.length()-1));
    }
}
