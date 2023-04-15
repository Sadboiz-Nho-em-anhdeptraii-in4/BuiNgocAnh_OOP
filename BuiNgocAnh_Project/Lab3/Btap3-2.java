package main;
import java.util.Scanner;
import java.lang.Math;

//Nhập tọa độ
class DIEM{
	int x,y;

	public void NHAPDIEM() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tọa độ điểm x : ");
		x = sc.nextInt();
		System.out.println("Nhập tọa độ điểm y : ");
		y = sc.nextInt();
	}

	protected void diem(int td_x,int td_y) {
		x = td_x;
		y = td_y;

	}

	public void INDIEM() {
		System.out.println("Tọa độ x : "+x);
		System.out.println("Tọa độ y : "+y);

	}	


}


//Tam giác
class TamGiac extends DIEM{
	DIEM A = new DIEM();
	DIEM B = new DIEM();
	DIEM C = new DIEM();

	public void NHAPTG() {
		System.out.println("Nhập tọa độ điểm A : ");
		A.NHAPDIEM();
		System.out.println("\nNhập tọa độ điểm B : ");
		B.NHAPDIEM();
		System.out.println("\nNhập tọa độ điểm C : ");
		C.NHAPDIEM();
	}

	public void INTAMGIAC() {
		System.out.println("Tọa độ điểm A : ");
		A.INDIEM();
		System.out.println("\nTọa độ điểm B : ");
		B.INDIEM();
		System.out.println("\nTọa độ điểm C : ");
		C.INDIEM();

	}

    public void KIEMTRA() {
    	//Kiểm tra các tọa độ A B C có khác nhau không
    	//Tọa độ 3 điểm khác nhau => Tạo thành tam giác
        if (A.x != B.x || A.x != C.x || B.x != C.x || A.y != B.y || A.y != C.y || B.y != C.y) {
            //Kiểm tra xem tọa độ 3 điểm có hợp lệ không
            double ab = Math.sqrt(Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
            double bc = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(C.y - B.y, 2));
            double ca = Math.sqrt(Math.pow(A.x - C.x, 2) + Math.pow(A.y - C.y, 2));

            if (ab + bc > ca && bc + ca > ab && ca + ab > bc) {

                System.out.println("3 điểm của tam giác hợp lệ");
            }
            else System.out.println("3 điểm trên không hợp lệ");
        }

    }

    public void ChuVi(){
    	if (A.x != B.x || A.x != C.x || B.x != C.x || A.y != B.y || A.y != C.y || B.y != C.y) {
                // Tọa độ 3 điểm khác nhau => có thể tạo thành tam giác
                // Ta cần phải kiểm tra thêm xem 3 đỉnh có thật sự tạo thành tam giác hay không?
                double ab = Math.sqrt(Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
                double bc = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(C.y - B.y, 2));
                double ca = Math.sqrt(Math.pow(A.x - C.x, 2) + Math.pow(A.y - C.y, 2));
    	    double chuvi = ab+bc+ca;	
                if (ab + bc > ca && bc + ca > ab && ca + ab > bc) {
                    // Tọa độ 3 điểm tạo thành tam giác
                    System.out.println("\nChu vi tam giác : "+chuvi);
                }
                else System.out.println("\nKhông tính được chu vi");
            }
    }


    public void DienTich(){
    	if (A.x != B.x || A.x != C.x || B.x != C.x || A.y != B.y || A.y != C.y || B.y != C.y) {
                // Tọa độ 3 điểm khác nhau => có thể tạo thành tam giác
                // Ta cần phải kiểm tra thêm xem 3 đỉnh có thật sự tạo thành tam giác hay không?
                double ab = Math.sqrt(Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
                double bc = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(C.y - B.y, 2));
                double ca = Math.sqrt(Math.pow(A.x - C.x, 2) + Math.pow(A.y - C.y, 2));
    	    double p = (ab + bc + ca)/2; //Nửa chu vi tam giác
    	    double S = Math.sqrt(p*(p-ab)*(p - bc)*( p - ca)); //Diện tích tam giác
                if (ab + bc > ca && bc + ca > ab && ca + ab > bc) {
                    // Tọa độ 3 điểm tạo thành tam giác
                    System.out.println("\nDiện tích tam giác : "+S);
                }
                else System.out.println("\nKhông tính được diện tích");
            } 	
    }
}


//Đường tròn
class DuongTron extends DIEM{
	double r;//bán kính
	DIEM TAM = new DIEM();//Tâm đường tròn

	public void NHAPDT(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhập bán kính đường tròn : ");
		r = sc.nextFloat();
		System.out.println("\nNhập tọa độ tâm đường tròn : ");
		TAM.NHAPDIEM();
	}

	public void InDuongTron() {
		System.out.println("\nBán kính đường tròn : "+r);
		System.out.println("\nTọa độ tâm : ");
		TAM.INDIEM();
	}

	public double ChuVi() {
		return Math.PI * 2 * r; 
	}

	public double DienTich() {
		return Math.PI * Math.pow(r, 2);

	}
}
public class Bai3_2 {public static void main(String[] args) {
	//Tam giác : Nhập,In,Kiểm tra,Tính diện tích, chu vi
	TamGiac tG = new TamGiac();
	tG.NHAPTG();
	tG.INTAMGIAC();
	tG.ChuVi();
	tG.DienTich();
	System.out.println("\nKiểm tra tam giác :");
	tG.KIEMTRA();

	//Đường tròn : Nhập, In, Tính diện tích, chu vi
	DuongTron dT = new DuongTron();
	dT.NHAPDT();
	dT.InDuongTron();

	System.out.println("\nChu vi đường tròn : "+dT.ChuVi());

	System.out.println("\nDiện tích đường tròn : "+dT.DienTich());
}

}