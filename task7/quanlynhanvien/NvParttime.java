package task7.quanlynhanvien;

public class NvParttime extends NhanVien {
    private double luong;
    private int gioLam;

    public NvParttime() {
    }

    public NvParttime(String name, String id, double luong, int gioLam) {
        super(name, id);
        this.luong = luong;
        this.gioLam = gioLam;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getGiolam() {
        return gioLam;
    }

    public void setGioLam(int gioLam) {
        this.gioLam = gioLam;
    }

    // Override phương thức tính lương
    @Override
    public double tinhLuong() {
        return luong * gioLam;
    }

    // Override phương thức hiển thị thông tin nhân viên
    @Override
    public void info() {
        super.info();
        System.out.println("Lương 1 giờ: " + luong);
        System.out.println("Số giờ làm: " + gioLam);
        System.out.println("Lương: " + tinhLuong());
    }
}
