package entities;

public class HinhThangVuong implements Hinh{
    private ChuNhat chuNhat;
    private TamGiac tamGiac;

    private boolean kiemTraTamGiacVuong(TamGiac tamGiac) {
        double a = tamGiac.getCanhA();
        double b = tamGiac.getCanhB();
        double c = tamGiac.getCanhC();
        if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {
            return true;
        }
        return false;
    }
    @Override
    public double chuVi() {
        try {
            if (kiemTraTamGiacVuong(tamGiac)) {
                return chuNhat.chuVi() + tamGiac.chuVi();
            } else {
                throw new RuntimeException("Tam giac khong phai tam giac vuong");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public double dienTich() {
        try {
            if (kiemTraTamGiacVuong(tamGiac)) {
                return chuNhat.dienTich() + tamGiac.dienTich();
            } else {
                throw new RuntimeException("Tam giac khong phai tam giac vuong");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public HinhThangVuong() {
    }

    public HinhThangVuong(ChuNhat chuNhat, TamGiac tamGiac) {
        this.chuNhat = chuNhat;
        this.tamGiac = tamGiac;
    }

    public ChuNhat getChuNhat() {
        return chuNhat;
    }

    public void setChuNhat(ChuNhat chuNhat) {
        this.chuNhat = chuNhat;
    }

    public TamGiac getTamGiac() {
        return tamGiac;
    }

    public void setTamGiac(TamGiac tamGiac) {
        this.tamGiac = tamGiac;
    }

    @Override
    public String toString() {
        return "HinhThangVuong{" +
                "chuNhat=" + chuNhat +
                ", tamGiac=" + tamGiac +
                '}';
    }
}
