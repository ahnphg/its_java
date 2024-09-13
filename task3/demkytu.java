import java.util.Scanner;

public class demkytu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();
        System.out.print("Nhap ky tu: ");
        char kytu = sc.next().charAt(0);

        int count = countChar(input, kytu);

        System.out.println("Ky tu '" + kytu + "' xuat hien " + count + " lan");
        sc.close();

    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
