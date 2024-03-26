import java.util.Scanner;

public class ngay24_1_bthtrang40 {
    public static void main(String[] args) {
        // bai nhap so ngay va hien thi tuong ung trong tuan le trang 40
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so ngay : ");
            n = sc.nextInt();
        } while(n < 0);
        if(n == 0)
            System.out.println("Chu nhat");
        else if(n == 1)
            System.out.println("Thu 2");
        else if(n == 2)
            System.out.println("Thu 3");
        else if(n == 3)
            System.out.println("Thu 4");
        else if(n == 4)
            System.out.println("Thu 5");
        else if(n == 5)
            System.out.println("Thu 6");
        else if(n == 6)
            System.out.println("Thu 7");
        else
            System.out.println("Nhap ngay khong co trong tuan !");
        sc.close();

    }
}
