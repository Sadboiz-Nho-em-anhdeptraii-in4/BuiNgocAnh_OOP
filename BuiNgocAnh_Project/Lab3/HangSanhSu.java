import java.util.Scanner;

 public class HangSanhSu extends HangHoa{
	private String loainguyenlieu;

	public HangSanhSu() {
		super();
	}
	public HangSanhSu(String mahang, String tenhang, String nhasanxuat, int gia, String loainguyenlieu) {
		super(mahang, tenhang, nhasanxuat, gia);
		this.loainguyenlieu = loainguyenlieu;
	}
	public void NHSS() {
		super.Nhaphang();
		Scanner sc=new Scanner (System.in);
		System.out.println("Loai nguyen lieu:");
		loainguyenlieu=sc.nextLine();
	}
	public void InHSS() {
		super.Nhaphang();
		System.out.println("Loai nguyen lieu:"+this.loainguyenlieu);
	}

	@Override
	public String toString() {
		return "HangSanhSu [loainguyenlieu=" + loainguyenlieu + "]";
	}
}


