import java.util.Scanner;

public class HangThucPham extends HangHoa{
	private int ngaysanxuat,ngayhethan;

	public HangThucPham() {
		super();
	}
	public HangThucPham(String mahang, String tenhang, String nhasanxuat, int gia, int ngaysanxuat, int ngayhethan) {
		super(mahang, tenhang, nhasanxuat, gia);
		this.ngaysanxuat = ngaysanxuat;
		this.ngayhethan = ngayhethan;
	}
	public void NHTP() {
		super.Nhaphang();
		Scanner sc=new Scanner (System.in);
		System.out.println("Ngay san xuat,Ngay het han:");
		ngayhethan=sc.nextInt();
		ngaysanxuat=sc.nextInt();
	}
	public void InHTP() {
		super.Nhaphang();
		System.out.println("Ngay San xuat:"+this.ngaysanxuat+";Ngay het han:"+this.ngayhethan);
	}

	@Override
	public String toString() {
		return "HangThucPham [ngaysanxuat=" + ngaysanxuat + ", ngayhethan=" + ngayhethan + "]";
	}

} 
class NgayThang extends HangThucPham{
	private int ngay,thang,nam;

	public NgayThang(String mahang, String tenhang, String nhasanxuat, int gia, int ngaysanxuat, int ngayhethan,
			int ngay, int thang, int nam) {
		super(mahang, tenhang, nhasanxuat, gia, ngaysanxuat, ngayhethan);
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public void NNT() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Ngay,thang,nam:");
		ngay=sc.nextInt();
		thang=sc.nextInt();
		nam=sc.nextInt();
	}
	public void InNT() {
		System.out.println("Ngay:"+this.ngay+";thang:"+this.thang+";nam:"+this.nam);
	}

	@Override
	public String toString() {
		return "NgayThang [ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + "]";
	}
}
