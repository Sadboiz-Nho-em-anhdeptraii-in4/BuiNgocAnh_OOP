import java.util.*;

class hinhTron{
    private double radius, chuVi, dienTich;
    private final double Pi = 3.14f;

    public hinhTron(double radius){
        this.radius = radius;
    }
    
    public void tinhChuVi(){
        this.chuVi = 2 * Pi * radius;
    }

    public void tinhDienTich(){
        this.dienTich = Pi * radius * radius;
    }

    public void inThongTin(){
        System.out.println("Perimeter : " + String.format("%.2f", this.chuVi));
        System.out.println("Area : " + String.format("%.2f", this.dienTich));
    }
}

public class ngay28_2_classHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh : ");
        hinhTron hinhtron = new hinhTron(sc.nextDouble());
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
        hinhtron.inThongTin();
        sc.close();
    }
}
