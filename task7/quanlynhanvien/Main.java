package task7.quanlynhanvien;

public class Main {
    public static void main(String[] args) {
        NvFulltime ftime = new NvFulltime("A", "001", 5000);
        
        NvParttime ptime = new NvParttime("B", "PT1", 20.00, 221);

        System.out.println("Nhân viên fulltime:");
        ftime.info();

        System.out.println("\nNhân viên parttime:");
        ptime.info();
    }
}
