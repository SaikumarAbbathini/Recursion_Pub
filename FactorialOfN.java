
public class FactorialOfN {
    
    public static int factorial(int n){
        
        int fact = n;
        if(n==1) { return 1;}

        
        
        fact *=factorial(n-1);
        
        return fact;
    }
    

    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }
}
