import java.util.Scanner;

public class chuyendoinhietdo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap gia tri nhiet do: ");
        double nhietdo = sc.nextDouble();

        System.out.println("Nhap don vi can chuyen doi (C/F): ");
        String donvi = sc.next();

        if ("C".equals(donvi.toUpperCase())) {
            double f = nhietdo * 9/5 + 32;
            System.out.printf("%.2f°C bang %.2f°F\n", nhietdo, f);
        } 
        else if ("F".equals(donvi.toUpperCase())) {
            double c = (nhietdo - 32) * 5/9;
            System.out.printf("%.2f°F bang %.2f°C\n", nhietdo, c);
        } 
        else {
            System.out.println("Don vi khong hop le");
        }
        sc.close();

    }
}
