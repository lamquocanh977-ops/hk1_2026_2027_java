
package tuan1.BaiHCN;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double chieuDai, chieuRong;
        double chuVi, dienTich;

        System.out.print("Nhap chieu dai: ");
        chieuDai = sc.nextDouble();

        System.out.print("Nhap chieu rong: ");
        chieuRong = sc.nextDouble();

        if (chieuDai <= 0 || chieuRong <= 0) {
            System.out.println("Chieu dai va chieu rong phai lon hon 0!");
        } else {
            chuVi = (chieuDai + chieuRong) * 2;
            dienTich = chieuDai * chieuRong;

            System.out.println("\n===== KET QUA =====");
            System.out.println("Chieu dai: " + chieuDai);
            System.out.println("Chieu rong: " + chieuRong);
            System.out.println("Chu vi hinh chu nhat: " + chuVi);
            System.out.println("Dien tich hinh chu nhat: " + dienTich);
        }

        sc.close();
    }
}
