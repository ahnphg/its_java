import java.util.Scanner;

public class bmi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double height, weight,bmi;
        System.out.print("Nhap chieu cao(m): ");
        height = sc.nextDouble();
        System.out.print("Nhap can nang (kg): ");
        weight = sc.nextDouble();
        bmi = weight / (height * height);

        System.out.printf("Chi so bmi cua ban la: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("Gay.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Binh thuong");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Thua can");
        } else {
            System.out.println("Beo phi");
        }
    
        sc.close();
    }
}