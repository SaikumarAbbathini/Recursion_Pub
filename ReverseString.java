public class ReverseString {
    static String reverseString(String s,String r,int n){
        
        if(n<0) return r;
        
        
        return reverseString(s, r+s.charAt(n), n-1);
    }
    public static void main (String...args){
        String s="Madam";
        int n=s.length()-1;
        String r =reverseString(s,"",n);
        
        if(s.equals(r)){
            System.out.println("True");
        }
        else
        System.out.println("False");
    }
}
