
package dlinh;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.Locale;

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so A : ");
        double a = sc.nextDouble();
        System.out.print("Nhap he so B : ");
        double b = sc.nextDouble();
        if(a == 0 && b == 0){
            System.out.println("Phuon trinh co vo so nghiem !\n");
        }
        else if(a == 0 && b != 0){
            System.out.println("Phuong trinh vo nghiem !\n");
        }
        else{
            System.out.printf("Phuong trinh co nghiem x = %.2f\n", -b / a);
        }
    }
}