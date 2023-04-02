package entities;

import org.springframework.stereotype.Component;

@Component
public class ChuNhat implements Hinh{
    private double chieuDai;
    private double chieuRong;

    @Override
    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public double dienTich() {
        return chieuRong*chieuDai;
    }

    public ChuNhat() {
    }

    public ChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return "ChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
