import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phân số thứ 1");
        System.out.println("Nhập tử số: ");
        int ts1 = sc.nextInt();
        System.out.println("Nhập mẫu số: ");
        int ms1 = sc.nextInt();
        Fraction ps1 = new Fraction(ts1,ms1);
        System.out.println("Phân số thứ 2");
        System.out.println("Nhập tử số: ");
        int ts2 = sc.nextInt();
        System.out.println("Nhập mẫu số: ");
        int ms2 = sc.nextInt();
        Fraction ps2 = new Fraction(ts2,ms2);

        int choice;
        do {
            System.out.println("\nThực hiện phép toán");
            System.out.println("1. Cộng");
            System.out.println("2. Trừ");
            System.out.println("3. Nhân");
            System.out.println("4. Chia");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Fraction tong = ps1.add(ps2);
                    System.out.println(ps1.display() + " + " + ps2.display() + " = " + tong.display());
                    break;
                case 2:
                    Fraction hieu = ps1.subtract(ps2);
                    System.out.println(ps1.display() + " - " + ps2.display() + " = " + hieu.display());
                    break;
                case 3:
                    Fraction tich = ps1.multiply(ps2);
                    System.out.println(ps1.display() + " * " + ps2.display() + " = " + tich.display());
                    break;
                case 4:
                    Fraction thuong = ps1.divide(ps2);
                    System.out.println(ps1.display() + " / " + ps2.display() + " = " + thuong.display());
                    break;
                case 5:
                    System.out.println("Đã thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}
