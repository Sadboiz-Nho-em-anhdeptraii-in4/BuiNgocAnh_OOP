import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ngay24_1_bthtrang94_b5 {
    public static void main(String[] args) {
        // nhap cac so nguyen va tinh tong , tong > 100 thi dung va in ra
        Scanner sc = new Scanner(System.in);
        int sum = 0, number;
        while(sum <= 100){
            System.out.print("Nhap 1 so bat ki : ");
            number = sc.nextInt();
            sum += number;
        }
        System.out.println("Tong cac so vua nhap la : " + sum);
        sc.close();
    }
}
