public class CountDigitsAndSumOfDigits {
    int sum = 0;
    public static int numberDigits(int n){
        
        if(n==0) return 0;

        return numberDigits(n/10)+n%10;
        
    }

    public static void main(String[] args) {
       
        System.out.println(numberDigits(562));
    }
}
