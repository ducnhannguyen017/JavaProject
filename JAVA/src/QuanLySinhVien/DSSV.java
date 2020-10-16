package QuanLySinhVien;

import java.util.LinkedList;
import java.util.Scanner;

public class DSSV {
	static LinkedList<SV_Infor> sv=new LinkedList<SV_Infor>();
	public DSSV() {
	
	}
	public static void NhapTT(SV_Infor SV) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập tên sinh viên :");
		SV.setHoTen(sc.nextLine());
		System.out.println("Nhập mã sinh viên :");
		SV.setMaSV(sc.nextLine());
		System.out.println("Nhập địa chỉ :");
		SV.setDiaChi(sc.nextLine());
	}
	public static void Them(SV_Infor SV) {
		NhapTT(SV);sv.add(SV);
	}
	public static void Xoa(SV_Infor SV,int x) {
		Scanner sc= new Scanner(System.in);
		System.out.println("sinh viên là sinh viên thứ:");
		x=sc.nextInt();
		sv.remove(x-1);
	}
	public static void XemDS() {
		for(int i=0;i<sv.size();i++) {
			System.out.println("Sinh vien "+(i+1));
			System.out.println(sv.get(i).toString());
		}
	}
}
