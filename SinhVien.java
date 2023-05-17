package bai3;

public class SinhVien {
	private String masv;
	private String hoten;
	private int namsinh;
	public SinhVien(String masv, String hoten, int namsinh) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.namsinh = namsinh;
	}
	public String getmasv() {
		return masv;
	}
	public void setmasv(String masv) {
		this.masv = masv;
	}
	public String gethoten() {
		return hoten;
	}
	public void sethoten(String hoten) {
		this.hoten = hoten;
	}
	public int getnamsinh() {
		return namsinh;
	}
	public void setnamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", hoten=" + hoten + ", namsinh=" + namsinh + "]";
	}
	
	
}