import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        if(isPrime(number, i)){
            System.out.println(number + " is a prime number.");
        }
        else{
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int number, int i){
        if(number < 2){
            return false;
        }
        else if(number == 2){
            return true;
        }
        else if(number % i != 0 && number >= i - 1){
            return true;
        }
        else{
            if(number % i == 0){
                return false;
            }
            else{
                return isPrime(number,i);
            }
        }
    }
}
