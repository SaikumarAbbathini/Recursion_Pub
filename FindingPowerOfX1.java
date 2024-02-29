//  x^n (Stack Height = logn)

// package Recursion;

public class FindingPowerOfX1 {

static int powerOfX(int x, int n){
        if(n==0) return 1;
        
        //n is odd
        if(n%2==1){
            x*=powerOfX(x, n/2)*powerOfX(x, n/2);
        }
        else x=powerOfX(x, n/2)*powerOfX(x, n/2);
        return x;
    }
    
    public static void main(String[] args) {
        int x=2,n=4;
        System.out.println(powerOfX(x, n));
    }
    
}
