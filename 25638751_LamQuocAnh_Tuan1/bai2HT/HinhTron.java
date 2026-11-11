
package tuan1.bai2HT;

public class HinhTron {
    private double banKinh;

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) throws Exception {
        if (banKinh > 0) {
            this.banKinh = banKinh;
        } else {
            throw new Exception("Ban kinh phai lon hon 0!");
        }
    }

    public HinhTron(double banKinh) throws Exception {
        setBanKinh(banKinh);
    }

    public double getDT() {
        return Math.PI * this.banKinh * this.banKinh;
    }

    public double getCV() {
        return 2 * Math.PI * this.banKinh;
    }

    public static void main(String[] args) {
        try {
            HinhTron h1 = new HinhTron(5);

            System.out.println("Ban kinh: " + h1.getBanKinh());

            System.out.println("Dien tich hinh tron: " + h1.getDT());

            System.out.println("Chu vi hinh tron: " + h1.getCV());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
