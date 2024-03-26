import java.util.Scanner;

public class ngay24_1_bthtrang35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a la : ");
        int a = sc.nextInt();
        System.out.print("Nhap so b la : ");
        int b = sc.nextInt();
        if(a != b)
            System.out.println("So nho hon trong 2 so la : " + Math.min(a , b));
        else
            System.out.println("2 so ban vua nhap bang nhau !");
        sc.close();
    }
}
