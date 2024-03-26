import java.util.*;

public class ngay31_1_bthtrang90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        String s = sc.nextLine();
        System.out.println("Hien thi chuoi moi ki tu tren 1 dong :");
        for(int i = 0;i < s.length(); ++i)
            System.out.println(s.charAt(i));
    }
}
