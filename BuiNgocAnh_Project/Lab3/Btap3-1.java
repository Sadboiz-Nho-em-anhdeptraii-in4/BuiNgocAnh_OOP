Btap 3.1
package main;
import java.util.Scanner;

class SACH{
	String ma,ten,tg;
	int trang,tap,gia;
	String loai,nxb;

	void NHAPSACH() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhập mã sách : ");
		ma = sc.nextLine();
		System.out.println("Nhập tên sách : ");
		ten = sc.nextLine();
		System.out.println("Nhập tên tác giả : ");
		tg = sc.nextLine();
		System.out.println("Nhập loại sách : ");
		loai = sc.nextLine();
		System.out.println("Nhập nhà xuất bản : ");
		nxb = sc.nextLine();
		System.out.println("Nhập số trang : ");
		trang = sc.nextInt();
		System.out.println("Nhập số tập : ");
		tap = sc.nextInt();
		System.out.println("Nhập giá sách : ");
		gia = sc.nextInt();


	}
	void INSACH() {
		System.out.println("\nMã sách : "+ma);
		System.out.println("Tên sách : "+ten);
		System.out.println("Tác giả : "+tg);
		System.out.println("Loại sách : "+loai);
		System.out.println("Nhà xuất bản : "+nxb);
		System.out.println("Số trang : "+trang);
		System.out.println("Số tập : "+tap);
		System.out.println("Giá sách : "+gia);

	}

}
public class Bai3_1 {public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập số sách : ");
	n = sc.nextInt();
	for(int i = 1; i <= n; i++) {
		SACH Sach = new SACH();
		Sach.NHAPSACH();
		Sach.INSACH();

	}
}	

}