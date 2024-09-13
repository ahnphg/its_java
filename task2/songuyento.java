import java.util.Scanner;

public class songuyento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " la so nguyen to");
        } else {
            System.out.println(num + " khong la so nguyen to");
        }
        sc.close();

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
