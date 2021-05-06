public class Draw {
    public static void main(String[] args) {
        for (int i = 0; i <3 ; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
        }
        for (int i = 1; i < 9; i++) {
            System.out.println();
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
        }
        for (int i = 9; i >0 ; i--) {
            System.out.println();
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
        }
    }
}
