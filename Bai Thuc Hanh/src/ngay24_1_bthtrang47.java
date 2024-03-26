import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ngay24_1_bthtrang47 {
    public static void main(String[] args) {
        // tinh tong cac so vua nhap , tong > 100 thi dung va in ra trang 47
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sum <= 100){
            System.out.print("Nhap so nguyen bat ki la : ");
            sum += sc.nextInt();
        }
        System.out.println("Tong cac so vua nhap la : " + sum);
        sc.close();
    }
}
