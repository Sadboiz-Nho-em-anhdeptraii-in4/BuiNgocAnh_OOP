
import java.util.Scanner;;

public class PTbac2-17-1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        do{
            System.out.print("Nhap he so A : ");
            a = sc.nextDouble();
        } while(a == 0);

        System.out.print("Nhap he so B : ");
        b = sc.nextDouble();
        System.out.print("Nhap he so C : ");
        c = sc.nextDouble();

        double delta = Math.pow(b , 2) - 4 * a * c;

        if(delta < 0)
            System.out.println("Phuong trinh vo nghiem!");
        else if(delta == 0){
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep : x1 = x2 = " + x);
        }
        else{
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet la : ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        sc.close();
    }
}
