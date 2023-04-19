import java.util.Scanner;

 public class HangHoa {
   private String mahang,tenhang,nhasanxuat;
   private int  gia;
 
public HangHoa() {
	super();
}
public HangHoa(String mahang, String tenhang, String nhasanxuat, int gia) {
	super();
	this.mahang = mahang;
	this.tenhang = tenhang;
	this.nhasanxuat = nhasanxuat;
	this.gia = gia;
}	
public void Nhaphang() {
	Scanner sc=new Scanner (System.in);
	System.out.println("Ma hang,Ten hang,Nha san xuat,gia:");
	mahang=sc.nextLine();
	tenhang=sc.nextLine();
	nhasanxuat=sc.nextLine();
	gia=sc.nextInt();
	
}
public void InDSHang() {
	System.out.println("Ma hang:"+ this.mahang +";Ten hang:"+ this.tenhang +"; Nha san xuat:"+this.nhasanxuat+";Gia:"+this.gia);
}
@Override
public String toString() {
	return "HangHoa [mahang=" + mahang + ", tenhang=" + tenhang + ", nhasanxuat=" + nhasanxuat + ", gia=" + gia + "]";
}
 } 