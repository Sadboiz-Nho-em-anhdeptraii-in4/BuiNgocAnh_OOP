import java.util.*;

public class ngay31_1_bthtrang96_b10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        do{
            System.out.print("Nhap chuoi : ");
            s = sc.nextLine();
        } while(s.length() > 80);
        System.out.print("Nhap ki tu : ");
        char t = sc.next().charAt(0);
        int cnt = 0;
        for(int i = 0;i < s.length(); ++i){
            if(s.charAt(i) == t)
                ++cnt;
        }
        System.out.println("Ki tu " + t + " xuat hien " + cnt + " lan trong chuoi s");
    }
}
