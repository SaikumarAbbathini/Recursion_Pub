// package Recursion;

public class SumOfN {

    public static int sumOfN(int n){
        int sum = n;
        if(n==0) return sum;

        sum = sum+sumOfN(n-1);
        
        return sum;

    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(sumOfN(n));
    }
}
