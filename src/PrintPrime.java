import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        int count=0;
        int number=2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=sc.nextInt();
        while (count<n){
            if(isPrime(number)){
                System.out.print(number+" ");
                count++;
            }
            number++;
        }
    }
    public static boolean isPrime(int number){
        boolean check = true;
        if(number<2){
            check= false;
        } else {
               int i = 2;

            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }
}
