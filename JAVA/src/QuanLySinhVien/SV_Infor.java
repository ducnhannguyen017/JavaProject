package QuanLySinhVien;

import java.util.Scanner;

public class SV_Infor {
	private String maSV;
    private String hoTen;
    private String diaChi;
    
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public SV_Infor(String maSV, String hoTen, String diaChi) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
	}
	public SV_Infor() {
		
	}
	public String toString() {
		return 	 "Họ Tên :" +hoTen 
				+"\n Mã Sinh Viên :"+ maSV
    			+ "\n Địa Chỉ: "+diaChi+"\n";
	}
}
