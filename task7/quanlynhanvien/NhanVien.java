package task7.quanlynhanvien;

public abstract class NhanVien {
    private String name;
    private String id;

    public NhanVien() {
    }

    public NhanVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Phương thức trừu tượng để tính lương
    public abstract double tinhLuong();

    // Phương thức hiển thị thông tin 
    public void info() {
        System.out.println("Tên: " + name);
        System.out.println("ID: " + id);
    }
}
