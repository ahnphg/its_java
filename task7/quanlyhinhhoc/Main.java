package task7.quanlyhinhhoc;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);  

        Rectangle rectangle = new Rectangle(4.0, 6.0); 

        System.out.println("Hình tròn:");
        circle.hienThi();

        System.out.println("\nHình chữ nhật:");
        rectangle.hienThi();
    }
}
