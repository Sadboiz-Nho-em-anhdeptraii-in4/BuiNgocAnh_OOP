import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ngay24_1_bthtrang94_b4 {
    public static void main(String[] args) {
        
        // nhap 1 so nguyen 1->12 va in ra thang tuong ung trang 94 bai 4
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so n la : ");
            n = sc.nextInt();
        } while(n < 0 || n > 12);
        switch (n) {
            case 1: 
                System.out.println("Thang 1");
                break;
            case 2:
                System.out.println("Thang 2");
                break;
            case 3:
                System.out.println("Thang 3");
                break;
            case 4:
                System.out.println("Thang 4");
                break;
            case 5:
                System.out.println("Thang 5");
                break;
            case 6:
                System.out.println("Thang 6");
                break;
            case 7:
                System.out.println("Thang 7");
                break;
            case 8:
                System.out.println("Thang 8");
                break;
            case 9:
                System.out.println("Thang 9");
                break;
            case 10:
                System.out.println("Thang 10");
                break;
            case 11:
                System.out.println("Thang 11");
                break;
            case 12:
                System.out.println("Thang 12");
                break;
            default:
                System.out.println("Nhap thang khong hop le !");
                break;
        }
        sc.close();
    }
}
