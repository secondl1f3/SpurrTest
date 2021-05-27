import org.junit.Test;

public class SpurrTest {

    @Test
    public void showPrimeNumberTest(){
        getPrimeNumber(100);
    }

    public void getPrimeNumber(int range){
        for (int i = 0; i <= range; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num){
        if ( num > 2 && num%2 == 0 ) {
            return false;
        }
        int top = (int)Math.sqrt(num) + 1;
        for(int i = 3; i < top; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
