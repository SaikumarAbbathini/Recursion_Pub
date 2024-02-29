

public class Fibonacci {
    static void fibonacci(int a, int b, int n){
        if(n<=0) return;
        int c=a+b;
        System.out.println(c);
        fibonacci(b, c, n-1);
        
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(0);
        System.out.println(1);
        fibonacci(0, 1, n-2);
    }
}
