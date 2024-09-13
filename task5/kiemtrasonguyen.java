import java.util.Scanner;

public class kiemtrasonguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Nhập một số: ");
            try {
                num = sc.nextInt();
                System.out.println(num +" la số nguyên");
            } catch (Exception e) {
                System.out.println("Không phải số nguyên");
                sc.nextLine();
            }
        }
    }
}
