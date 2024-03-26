package shapes;

import java.util.*;

public class hinhChuNhat {
    private double length, width, Perimeter, Area;
    // public Scanner sc;

    public void nhapThongTin(Scanner sc){
        System.out.print("Nhap chieu dai : ");
        length = sc.nextDouble();
        System.out.print("Nhap chieu rong : ");
        width = sc.nextDouble();
    }

    public void setPerimeter(){
        this.Perimeter = (length + width) * 2;
    }

    public void setArea(){
        this.Area = length * width;
    }

    public void inThongTin(){
        System.out.print("Thong tin hinh chu nhat : ");
        System.out.print("Perimeter : " + String.format("%.2f, ", Perimeter));
        System.out.println("Area : " + String.format("%.2f", Area));
    }
}
