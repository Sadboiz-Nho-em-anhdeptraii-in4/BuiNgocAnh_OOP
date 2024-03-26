import java.util.*;

public class ngay31_1_bthtrang97_b11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so phan tu cua mang la : ");
            n = sc.nextInt();
        } while(n <= 0);
        int[] a = new int[n];
        for(int i = 0;i < n; ++i)
            a[i] = sc.nextInt();
        System.out.print("In ra mang ban dau : ");
        for(int i = 0;i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
        Arrays.sort(a);
        System.out.print("In ra mang da sap xep tang dan : ");
        for(int i = 0;i < n; ++i)
            System.out.print(a[i] + " ");
    }
}
