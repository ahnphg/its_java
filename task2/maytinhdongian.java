import java.util.Scanner;

public class maytinhdongian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        double num1 = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double num2 = sc.nextDouble();
        System.out.print("Nhap phep toan (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, result);
                } else {
                    System.out.println("Khong the chia cho 0");
                }
                break;
            default:
                System.out.println("Phep toan khong hop le");
                break;
        }

        sc.close();

    }
}
