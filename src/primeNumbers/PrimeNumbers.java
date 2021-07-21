package primeNumbers;

public class PrimeNumbers {
	public static void main(String[] args) {
        //range
        int min = 1;
        int max = 1000;
        for(int n=min;n<=max;n++) {
            if(isPrime(n)) {
                System.out.println(n);
            }
        }
    }
     
    public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
