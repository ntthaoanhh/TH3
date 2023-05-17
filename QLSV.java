package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class QLSV {
	private ArrayList<SinhVien> SinhVienList;
	public QLSV() {
		SinhVienList =new ArrayList<>();
	}
	public ArrayList<SinhVien> getSinhVienList() {
		return SinhVienList;
	}
	public void setSinhVienList(ArrayList<SinhVien> SinhVienList) {
		this.SinhVienList = SinhVienList;
	}
	public void addSinhVien(SinhVien sv) {
		SinhVienList.add(sv);
	}
	public void xoaSinhVien( String masv) {
		for (int i=0; i<SinhVienList.size();i++) {
			SinhVien sv= SinhVienList.get(i);
			if(sv.getmasv().equals(masv)) {
				SinhVienList.remove(i);
				break;
			}
		}
	}
	public void capNhatSinhVien(String masv, String hoten, int namsinh) {
		for (SinhVien sv : SinhVienList) {
			if (sv.getmasv().equals(masv)) {
				sv.sethoten(hoten);
				sv.setnamsinh(namsinh);
				break;
			}
		}
	}
	public SinhVien timtheoma(String masv) {
		for (SinhVien sv : SinhVienList) {
			if(sv.getmasv().equals(masv)){
				return sv;
			}
		}
		return null;
	}
	public SinhVien timtheoten(String hoten) {
		for (SinhVien sv :SinhVienList) {
			if(sv.gethoten().equals(hoten)){
				return sv;
			}
		}
		return null;
	}
	public void xuatdanhsach() {
		for (SinhVien sv : SinhVienList) {
			System.out.println(sv);
		}
	}
	public void sapxepboiID() {
		Collections.sort(SinhVienList, new Comparator<SinhVien>() {
			@Override
			public int compare (SinhVien sv1, SinhVien sv2) {
				return sv1.getmasv().compareTo(sv2.getmasv());
			}
		});
	}
}