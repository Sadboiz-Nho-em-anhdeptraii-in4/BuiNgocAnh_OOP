import java.util.*;

public class ngay31_1_bthtrang74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so phan tu cua mang : ");
            n = sc.nextInt();
        } while(n <= 0);
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0;i < n; ++i){
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < n; ++i){
            if(arr[i] % 2 == 0)
                sum += arr[i];
        }
        System.out.println("Tong cac so chan cua mang la : " + sum);
    }
}
