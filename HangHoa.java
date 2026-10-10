package lamQuocAnh_25638751;

import java.time.LocalDate;

public class HangHoa {
	private String maHang;
	private String tenHang;
	private String hangSX;
	private double giaBan;
	private float soLuongTon;
	private LocalDate ngayNhapHang;
	public HangHoa(String maHang) {
		this.maHang = "xxx";
		this.tenHang = "xxx";
		this.hangSX = "xxx";
		this.giaBan = 0;
		this.soLuongTon = 0;
		this.ngayNhapHang = ngayNhapHang;
	}
	public HangHoa(String maHang, String tenHang, String hangSX, double giaBan, float soLuongTon,
			LocalDate ngayNhapHang) {
		if(maHang == null || maHang.trim().isEmpty()) {
			throw new IllegalArgumentException("Ma Hang Khong Duoc De Trong!");
		}
		if(tenHang == null ||tenHang.trim().isEmpty()) {
			throw new IllegalArgumentException("Ten Hang Khong Duoc De Trong!");
		}
		if(hangSX == null || hangSX.trim().isEmpty()) {
			throw new IllegalArgumentException("Hang san xuatKhong Duoc De Trong!");
		}
		if(giaBan < 0) {
			throw new IllegalArgumentException("Gia ban phai >= 0!");
		}
		if(soLuongTon < 0) {
			throw new IllegalArgumentException("So luong ton phai >= 0!");
		}
		if(ngayNhapHang.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("Ngay nhap hang phai truoc hoac bang ngay hien tai!");
		}
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.hangSX = hangSX;
		this.giaBan = giaBan;
		this.soLuongTon = soLuongTon;
		this.ngayNhapHang = ngayNhapHang;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		if(maHang == null || maHang.trim().isEmpty()) {
			this.maHang = "xxx";
		}
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if(tenHang == null ||tenHang.trim().isEmpty()) {
			this.tenHang = "xxx";
		}
		this.tenHang = tenHang;
	}
	public String getHangSX() {
		return hangSX;
	}
	public void setHangSX(String hangSX) {
		if(hangSX == null || hangSX.trim().isEmpty()) {
			this.hangSX = "xxx";
		}
		this.hangSX = hangSX;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		if(giaBan >= 0) {
			this.giaBan = giaBan;
		}
	}
	public float getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(float soLuongTon) {
		if(soLuongTon >= 0) {
			this.soLuongTon = soLuongTon;
			
		}
	}
	public LocalDate getNgayNhapHang() {
		return ngayNhapHang;
	}
	public void setNgayNhapHang(LocalDate ngayNhapHang) {
		if(ngayNhapHang.isBefore(LocalDate.now())) {
			this.ngayNhapHang = ngayNhapHang;
		}
	}
	public double tinhTongGiaTri() {
		// TODO Auto-generated method stub
		return getGiaBan() * getSoLuongTon();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ma Hang: %s | Ten Hang: %s | Hang SX: %s | Gia Ban: %lf | So Luong Ton: %f | Ngay Nhap Hang: %s", maHang,
				tenHang, hangSX, giaBan, soLuongTon, ngayNhapHang);
	}
	
	
	
	

}
