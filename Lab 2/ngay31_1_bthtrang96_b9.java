import java.util.*;

public class ngay31_1_bthtrang96_b9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        String s = sc.nextLine();
        int cntSo = 0, cntInThuong = 0, cntInHoa = 0;
        for(int i = 0;i < s.length(); ++i){
            char temp = s.charAt(i);
            if(Character.isUpperCase(temp))
                ++cntInHoa;
            else if(Character.isLowerCase(temp))
                ++cntInThuong;
            else if(Character.isDigit(temp))
                ++cntSo;
        }
        System.out.println("So ki tu in thuong la : " + cntInThuong);
        System.out.println("So ki tu in hoa la : " + cntInHoa);
        System.out.println("So ki tu la so la : " + cntSo);
    }
}
