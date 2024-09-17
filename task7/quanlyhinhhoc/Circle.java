package task7.quanlyhinhhoc;

public class Circle extends Shape {
    private double banKinh;

    public Circle() {
    }

    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    // Override phương thức tính diện tích
    @Override
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
