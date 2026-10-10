package lamQuocAnh_25638751;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		QuanLyHangHoa ql = new QuanLyHangHoa(10);
		HangHoa h1 = new HangHoa("TP001", "SUA", "VINA", 200, 20, LocalDate.of(2026, 10, 10));
		HangHoa h2 = new HangHoa("TP201", "RAU", "BAD", 300, 20, LocalDate.of(2026, 10, 10));
		ql.addHangHoa(h1);
		System.out.println("DS");
		ql.inDS();
		ql.xoaHHID("TP001");
	}

}
