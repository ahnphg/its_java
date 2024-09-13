import java.util.Scanner;

public class sapxepmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Nhap cac phan tu: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        bubbleSort(a);

        System.out.println("Mang sau khi sap xep");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();

    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
