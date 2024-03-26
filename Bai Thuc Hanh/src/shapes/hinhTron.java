package shapes;

import java.util.*;

public class hinhTron {
    final double PI = 3.14f;
    private double radius, Perimeter, Area;
    
    public void nhapThongTin(Scanner sc){
        System.out.print("Nhap ban kinh hinh tron : ");
        radius = sc.nextDouble();
    }

    public void setPerimeter(){
        this.Perimeter = 2 * PI * radius;
    }

    public void setArea(){
        this.Area = PI * radius * radius;
    }

    public void inThongTin(){
        System.out.print("Thong tin hinh tron : ");
        System.out.print("Perimeter : " + String.format("%.2f, ", Perimeter));
        System.out.println("Area : " + String.format("%.2f", Area));
    }
}
