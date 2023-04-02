package entities;

public class Tron implements Hinh{
    private double duongKinh;
    @Override
    public double chuVi() {
        return Math.PI*duongKinh;
    }

    @Override
    public double dienTich() {
        return Math.PI*duongKinh*duongKinh/4;
    }

    public Tron() {
    }

    public Tron(double duongKinh) {
        this.duongKinh = duongKinh;
    }

    public double getDuongKinh() {
        return duongKinh;
    }

    public void setDuongKinh(double duongKinh) {
        this.duongKinh = duongKinh;
    }

    @Override
    public String toString() {
        return "Tron{" +
                "duongKinh=" + duongKinh +
                '}';
    }
}
