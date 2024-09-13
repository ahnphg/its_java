import java.util.HashMap;
import java.util.Scanner;

public class quanlykhachhang {
    public static void main(String[] args) {
        HashMap<String, String> khachHang = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // put (key,value): cập nhật/thêm cặp khóa - giá trị vào map
        khachHang.put("001", "A");
        khachHang.put("002", "B");
        khachHang.put("003", "C");
        khachHang.put("004", "D");
        khachHang.put("005", "E");

        int luaChon;

        do {
            System.out.println("\n----- Quản lý khách hàng -----");
            System.out.println("1. Tìm kiếm khách hàng theo mã");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            luaChon = sc.nextInt();
            sc.nextLine(); 

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập mã khách hàng cần tìm: ");
                    String maKH = sc.nextLine();
                    // containsKey: kiểm tra xem khóa có tồn tại trong map không
                    if (khachHang.containsKey(maKH)) {
                        System.out.println("Tên khách hàng: " + khachHang.get(maKH));
                    } else {
                        System.out.println("Không tìm thấy khách hàng!");
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (luaChon != 0);

        sc.close();
    }

}
