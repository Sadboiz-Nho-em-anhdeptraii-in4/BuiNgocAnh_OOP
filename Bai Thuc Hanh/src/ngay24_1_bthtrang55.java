import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ngay24_1_bthtrang55 {
    public static void main(String[] args) {
        // in cac so chia het cho 5 tu 0 -> 20 trang 55
        System.out.print("Cac so chia het cho 5 la : ");
        for(int i = 0;i <= 20; ++i){
            if(i % 5 == 0)
                System.out.print(i + " ");
        }
    }
}
