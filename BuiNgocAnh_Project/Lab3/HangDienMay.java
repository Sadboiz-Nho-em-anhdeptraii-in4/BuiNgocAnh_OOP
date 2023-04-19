import java.util.Scanner;

public class HangDienMay extends HangHoa{
	private int thoigianbaohanh,dienap,congsuat;

	public HangDienMay() {
		super();
	}
	public HangDienMay(String mahang, String tenhang, String nhasanxuat, int gia, int thoigianbaohanh, int dienap,
			int congsuat) {
		super(mahang, tenhang, nhasanxuat, gia);
		this.thoigianbaohanh = thoigianbaohanh;
		this.dienap = dienap;
		this.congsuat = congsuat;
	}
	public  void NHDM() {
		super.Nhaphang();
		Scanner sc=new Scanner (System.in);
		System.out.println("Thoi gian bao hanh,Dien ap,Cong suat:");
		dienap=sc.nextInt();
		congsuat=sc.nextInt();
		thoigianbaohanh=sc.nextInt();
	}
	public void InHDM() {
		super.Nhaphang();
		System.out.println(" Thoi gian bao hanh:"+this.thoigianbaohanh+";Dien ap:"+this.dienap+"; Cong suat:"+this.congsuat);
	}

	@Override
	public String toString() {
		return "HangDienMay [thoigianbaohanh=" + thoigianbaohanh + ", dienap=" + dienap + ", congsuat=" + congsuat
				+ "]";
	}
}