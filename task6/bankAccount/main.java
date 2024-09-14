import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bankAccount acc = new bankAccount();

        int choice;
        do {
            // Menu quản lý tài khoản ngân hàng
            System.out.println("\nQuản lý tài khoản ngân hàng:");
            System.out.println("1. Gửi tiền");
            System.out.println("2. Rút tiền");
            System.out.println("3. Kiểm tra số dư");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số tiền cần gửi: ");
                    double damount = sc.nextDouble();
                    acc.deposit(damount);
                    break;
                case 2:
                    System.out.print("Nhập số tiền cần rút: ");
                    double wamount = sc.nextDouble();
                    acc.withdraw(wamount);
                    break;
                case 3:
                    acc.check();
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (choice != 4);
    }
}
