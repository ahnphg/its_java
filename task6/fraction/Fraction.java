public class Fraction {
    private int tuSo;
    private int mauSo;

    // Constructor không tham số
    public Fraction() {
    }

    // Constructor có tham số
    public Fraction(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new ArithmeticException("Mẫu số không thể bằng 0");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        toiGian();  // Rút gọn phân số
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
        toiGian();  
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0) {
            throw new ArithmeticException("Mẫu số không thể bằng 0");
        }
        this.mauSo = mauSo;
        toiGian(); 
    }

    // Phương thức hiển thị 
    public String display() {
        if (tuSo == mauSo) {
            return "1";  
        } 
        else if (mauSo == 1) {
            return Integer.toString(tuSo);  
        } 
        else if (tuSo < 0 || mauSo < 0) {
            return (-tuSo) + "/" + (-mauSo); 
        } 
        else {
            return tuSo + "/" + mauSo; 
        }
    }

    // Tìm ước chung lớn nhất 
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Phương thức rút gọn ps
    private void toiGian() {
        int gcd = gcd(tuSo, mauSo);
        tuSo /= gcd;
        mauSo /= gcd;
    }

    // Phép cộng hai phân số
    public Fraction add(Fraction a) {
        int tu = tuSo * a.getMauSo() + a.getTuSo() * mauSo;
        int mau = mauSo * a.getMauSo();
        Fraction kq = new Fraction(tu, mau);
        return kq;  
    }

    // Phép trừ hai phân số
    public Fraction subtract(Fraction a) {
        int tu = tuSo * a.getMauSo() - a.getTuSo() * mauSo;
        int mau = mauSo * a.getMauSo();
        Fraction kq = new Fraction(tu, mau);
        return kq;
    }

    // Phép nhân hai phân số
    public Fraction multiply(Fraction a) {
        int tu = tuSo * a.getTuSo();
        int mau = mauSo * a.getMauSo();
        Fraction kq = new Fraction(tu, mau);
        return kq;
    }

    // Phép chia hai phân số
    public Fraction divide(Fraction a) {
        if (a.getTuSo() == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số bằng 0");
        }
        int tu = tuSo * a.getMauSo();
        int mau = mauSo * a.getTuSo();
        Fraction kq = new Fraction(tu, mau);
        return kq;  
    }
}
