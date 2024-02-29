//  x^n (Stack Height =n)

// package Recursion;

public class FindingPowerOfX {

    static int powerOfX(int x, int n){
        if(n==0) return 1;
        x*=powerOfX(x, n-1);
        return x;
    }
    
    public static void main(String[] args) {
        int x=2,n=5;
        System.out.println(powerOfX(x, n));
    }
}
