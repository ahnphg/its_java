import java.util.ArrayList;
import java.util.Scanner;

public class quanlythuvien {
    public static void main(String[] args) {
        ArrayList<String> thuVien = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        int luaChon;

        do {
            System.out.println("\n----- Quản lý thư viện -----");
            System.out.println("1. Thêm sách");
            System.out.println("2. Sửa sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    themSach(thuVien, sc);
                    break;
                case 2:
                    suaSach(thuVien, sc);
                    break;
                case 3:
                    xoaSach(thuVien, sc);
                    break;
                case 4:
                    timKiemSach(thuVien, sc);
                    break;
                case 5:
                    hienThiDanhSach(thuVien);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (luaChon != 0);

        sc.close();
    }

    // Thêm 
    public static void themSach(ArrayList<String> thuVien, Scanner sc) {
        System.out.print("Nhập sách muốn thêm: ");
        String tenSach = sc.nextLine();
        thuVien.add(tenSach); // thêm phần tử vào cuối
        System.out.println("Đã thêm sách ");

    }

    // Sửa 
    public static void suaSach(ArrayList<String> thuVien, Scanner sc) {
        System.out.print("Nhập tên sách muốn sửa: ");
        String name = sc.nextLine();
        int viTri = thuVien.indexOf(name); // lấy ra chỉ số của name trong thuVien
        if (viTri == -1) {
            System.out.println("Khong tim thay sach");
        } else {
            System.out.print("Nhập tên sách mới: ");
            String tenMoi = sc.nextLine();
            thuVien.set(viTri, tenMoi); // thay thế phần tử có vị trí (viTri) bằng tenMoi
            System.out.println("Đã sửa sách ");

        }
    }

    // Xóa sách khỏi thư viện
    public static void xoaSach(ArrayList<String> thuVien, Scanner sc) {
        System.out.print("Nhập tên sách muốn xóa: ");
        String name = sc.nextLine();
        int viTri = thuVien.indexOf(name);
        if (viTri == -1) {
            System.out.println("Khong tim thay sach");
        } else {
            thuVien.remove(viTri); // xóa phần tử có vị trí = viTri
            System.out.println("Đã xóa sách ");
        }
    }

    // Tìm kiếm sách trong thư viện
    public static void timKiemSach(ArrayList<String> thuVien, Scanner sc) {
        System.out.print("Nhập tên sách cần tìm kiếm: ");
        String name = sc.nextLine();
        int viTri = thuVien.indexOf(name);
        if (viTri == -1){
            System.out.println("Khong tim thay sach");
        }
        else{
            System.out.println("Sách ở vị trí "+ (viTri + 1));
        }


    }

    // Hiển thị danh sách sách trong thư viện
    public static void hienThiDanhSach(ArrayList<String> thuVien) {
        if (thuVien.isEmpty()) {
            System.out.println("Thư viện trống.");
        } else {
            System.out.println("\nDanh sách sách trong thư viện:");
            for (int i = 0; i < thuVien.size(); i++) {
                System.out.println((i + 1) + ". " + thuVien.get(i));
            }
        }
    }
}
