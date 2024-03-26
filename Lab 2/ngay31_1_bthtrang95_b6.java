import java.util.*;

public class ngay31_1_bthtrang95_b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so nguyen n : ");
            n = sc.nextInt();
        } while(n <= 0);

        long gt = 1;
        int mod = (int)1e9 + 7;
        for(int i = 1;i <= n; ++i){
            gt *= i;
            gt %= mod;
        }
        System.out.println("Giai thua cua n la : " + gt);
    }
}
