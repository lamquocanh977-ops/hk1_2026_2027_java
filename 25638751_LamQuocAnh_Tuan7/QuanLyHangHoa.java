package lamQuocAnh_25638751;

import java.time.LocalDate;
import java.util.Arrays;

public class QuanLyHangHoa{
	private HangHoa[] ds;
	private int count;
	
	public QuanLyHangHoa(int n) {
		ds = new HangHoa[n];
		count = 0;
	}
	
	public boolean addHangHoa(HangHoa s) {
		
		if(count == ds.length) {
			ds = Arrays.copyOf(ds,  ds.length*2);
		}
		ds[count] = s;
		count++;
		return true;
	}
	
	public HangHoa timTheoMa(String maHang) {
		for(int i = 0; i < count; i++) {
			if(ds[i].getMaHang().equalsIgnoreCase(maHang)) {
				return ds[i];
			}
		}
		return null;
		
	}
	public boolean xoaHHID(String maHang) {
		int index = -1;
		for(int i = 0; i<count; i++) {
			if(ds[i].getMaHang().equalsIgnoreCase(maHang)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			return false;
		}
		for(int i = index; i < count - 1; i++) 
			ds[i] = ds[i + 1];
		ds[count - 1] = null;
		count--;
		return true;
	
	}

	
	public boolean suaDonGia(String maHang, double donGiaMoi) {
		HangHoa s = timTheoMa(maHang);
		if(s == null || donGiaMoi < 0) {
			return false;
		}
		s.setGiaBan(donGiaMoi);
		return true;
	}
	public void inDS() {
		for(int i = 0; i<count; i++) {
			System.out.println(ds[i]);
		}
	}
	
	



	

}
