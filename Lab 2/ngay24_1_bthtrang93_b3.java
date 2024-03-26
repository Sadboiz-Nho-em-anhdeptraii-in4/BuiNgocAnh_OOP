import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ngay24_1_bthtrang93_b3 {
    public static void main(String[] args) {
        // nhap ten va nam sinh in ra dang o tuoi nao trang 93 bai 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten la : ");
        String ten = sc.nextLine();
        int namSinh;
        do{
            System.out.print("Nhap nam sinh la : ");
            namSinh = sc.nextInt();
        } while(namSinh <= 0 || namSinh >= 2024);
        int tuoi = 2024 - namSinh;
        if(tuoi < 16)
            System.out.println("Ban " + ten + " o tuoi vi thanh nien");
        else if(tuoi >= 16 && tuoi < 18)
            System.out.println("Ban " + ten + " o do tuoi truong thanh");
        else
            System.out.println("Ban " + ten + " da gia");
        sc.close();
    }
}
