package task7.quanlyhinhhoc;

public abstract class Shape {
    // Phương thức trừu tượng để tính diện tích
    public abstract double dienTich();

    // Phương thức để hiển thị
    public void hienThi() {
        System.out.println("Diện tích: " + dienTich());
    }
}
