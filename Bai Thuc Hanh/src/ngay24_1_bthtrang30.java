import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ngay24_1_bthtrang30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        do{
            System.out.print("Nhap so n : ");
            n = sc.nextLong();
        } while(n <= 0);
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Tong cac chu so la : " + sum);
        sc.close();
    }
}
