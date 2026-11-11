
package tuan1.bai1HCN;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double cD) throws Exception {
        if (cD > 0) {
            this.chieuDai = cD;
        } else {
            throw new Exception("Chieu dai phai lon hon 0!");
        }
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) throws Exception {
        if (chieuRong > 0) {
            this.chieuRong = chieuRong;
        } else {
            throw new Exception("Chieu rong phai lon hon 0!");
        }
    }

    public HinhChuNhat(double chieuDai, double chieuRong) throws Exception {
        setChieuDai(chieuDai);
        setChieuRong(chieuRong);
    }

    public double getDT() {
        return this.chieuDai * this.chieuRong;
    }

    public double getCV() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public static void main(String[] args) {
        try {
            HinhChuNhat h1 = new HinhChuNhat(7, 5);

            System.out.println("Chieu dai: " + h1.getChieuDai());
            System.out.println("Chieu rong: " + h1.getChieuRong());

            System.out.println("Dien tich hinh chu nhat: " + h1.getDT());
            System.out.println("Chu vi hinh chu nhat: " + h1.getCV());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
