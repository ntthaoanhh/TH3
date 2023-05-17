package bai3;

import java.util.Scanner;

public class main3 {
	public static void main(String[] args) {
		QLSV qlsv=new QLSV();
		Scanner input=new Scanner(System.in);
		int chon;
		
		qlsv.addSinhVien(new SinhVien("001","Nguyen Thi A",2003));
		qlsv.addSinhVien(new SinhVien("002","Tran Thi B",2003));
		qlsv.addSinhVien(new SinhVien("003","Ngo Ngoc C",2001));
		qlsv.addSinhVien(new SinhVien("004","Le Thi G",2004));
		qlsv.addSinhVien(new SinhVien("005","Hoang Thi E",2002));
		
		do {
			System.out.println("MeNu");
			System.out.println("1. Lay danh sach sinh vien");
			System.out.println("2. Them Sinh Vien");
			System.out.println("3. Xoa sinh vien ");
			System.out.println("4. Sua thong tin");
			System.out.println("5. Tim Sinh Vien theo ma");
			System.out.println("6. Tim sinh vien theo ten");
			System.out.println("7. Sap xep danh sach sinh vien");
			System.out.println("0. Thoat");
			System.out.println("Nhap lua chon: ");
			chon=input.nextInt();
			input.nextLine();
			switch(chon) {
			case 1: 
				System.out.println("Danh sach sinh vien");
				qlsv.xuatdanhsach();
				break;
			case 2:
				System.out.println("Nhap ma sinh vien ");
				String ID= input.nextLine();
				System.out.println("Nhap ho ten sinh vat: ");
				String Name= input.nextLine();
				System.out.println("Nhap nam sinh vien: ");
				int birthDay= input.nextInt();
				input.nextLine();
				SinhVien s1=new SinhVien(ID,Name,birthDay);
				qlsv.addSinhVien(s1);
				break;
			case 3:
				System.out.println(" Nhap ma sinh vien can xoa:");
				String Idxoa=input.nextLine();
				qlsv.xoaSinhVien(Idxoa);
				System.out.println("Sinh vien da duoc xoa");
				break;
			case 4:
				System.out.println("Nhap ma sinh vien can sua: ");
				String idsua=input.nextLine();
				System.out.println("Nhap ho ten sinh vien moi: ");
				String NameSua= input.nextLine();
				System.out.println("Nhap nam sinh moi: ");
				int birthDaySua= input.nextInt();
				input.nextLine();
				
				qlsv.capNhatSinhVien(idsua, NameSua, birthDaySua);
				break;
			case 5: 
				System.out.println("nhap ma sinh vien can tim");
				String idfind=input.nextLine();
				SinhVien timSinhVienID=qlsv.timtheoma(idfind);
				if (timSinhVienID!=null) {
					System.out.println("Sinh vien duoc tim thay: ");
					System.out.println(timSinhVienID);
				}else {
					System.out.println("Khong tim thay sinh vien");
				}
				break;
			case 6:
				System.out.println("nhap ten sinh vien can tim");
				String Namefind=input.nextLine();
				SinhVien timSinhVienName=qlsv.timtheoma(Namefind);
				if (timSinhVienName!=null) {
					System.out.println("Sinh vien duoc tim thay: ");
					System.out.println(timSinhVienName);
				}else {
					System.out.println("Khong tim thay sinh vien");
				}
				break;
			case 7:
				qlsv.sapxepboiID();
				System.out.println("Danh sach sinh vien da sap xep: ");
				break;
			case 0: 
				System.out.println("Da thoat chuong trinh");
			}

			
		}while (chon !=0);
	}
}