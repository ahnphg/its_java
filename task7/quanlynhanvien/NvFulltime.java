package task7.quanlynhanvien;

public class NvFulltime extends NhanVien {
    private int salary;

    public  NvFulltime (){
    }

    public NvFulltime(String name, String id, int salary) {
        super(name, id); // gọi lại hàm của lớp cha
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Override phương thức tính lương
    @Override
    public double tinhLuong() {
        return salary;
    }

    // Override phương thức hiển thị thông tin 
    @Override
    public void info() {
        super.info(); // gọi lại hàm của lớp cha
        System.out.println("Lương: " + tinhLuong());
    }
}
