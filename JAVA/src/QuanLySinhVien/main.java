package QuanLySinhVien;

import java.awt.List;
import java.util.LinkedList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,x=0;
		boolean flag=true;
		Scanner sc =new Scanner(System.in);
		SV_Infor SV=new SV_Infor();
		LinkedList<SV_Infor> sv=new LinkedList<SV_Infor>();
		DSSV list=new DSSV();
		do {
			System.out.println("Bạn chọn làm gì?");
            System.out.println(
                    "1.Thêm sinh viên.\n" +
            		"2.Xóa sinh viên.\n" +
            		"3.Xuất danh sách sinh viên.\n" +
                    "Nhập số khác để thoát");
            a=sc.nextInt();
            switch(a) {
            case 1:DSSV.Them(SV);;break;
            case 2:DSSV.Xoa(SV, x);break;
            case 3:DSSV.XemDS();break;
            default: 
            System.out.println("Goodbye");
            flag = false;
            break;
            }
		}while(flag);
	}
}
