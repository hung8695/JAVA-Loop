import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money: ");
        double money = sc.nextDouble();
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        System.out.println("Enter Interest rate: ");
        double interest_rate = sc.nextDouble();
        double total_interest=0;
        for (int i = 0; i < month; i++) {
            total_interest+=money*(interest_rate/100)/12*month;
        }
        System.out.println("Total of interest: "+total_interest);
    }
}
