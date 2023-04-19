import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	     ArrayList<HangHoa> list=new ArrayList<>();
		
			Scanner sc=new Scanner(System.in);
		    
			do {
				System.out.print("Nhap loai hang:");
				String loai=sc.nextLine();
				if(loai==null||loai.equals(""))
					break;
				int iloai=Integer.parseInt(loai);
				switch(iloai) {
				case 1:
					HangDienMay hdm=new HangDienMay();
					hdm.NHDM();
					list.add(hdm);
					break;
				case 2:
					HangSanhSu hss=new HangSanhSu();
					hss.NHSS();
					list.add(hss);
					break;
				case 3:
					HangThucPham htp=new HangThucPham();
					htp.NHTP();
					list.add(htp);
					break;
				}
			}while(true);
			
		
		
			System.out.println("Danh sach hang:");
			for(HangHoa hh:list){
				if(hh instanceof HangDienMay) {
					((HangDienMay)hh).InHDM();
				} else if(hh instanceof HangSanhSu) {
					((HangSanhSu)hh).InHSS();
				}else if(hh instanceof HangThucPham) {
					((HangThucPham)hh).InHTP();
				}
				System.out.println("\n---");
			}
			
		}

	}

