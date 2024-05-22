import java.util.ArrayList;
import java.util.Scanner;

public class THH450Person {
    public String hoten;
    public int tuoi;
    public long cccd;
    public void nhapthongtin(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap ho va ten : ");
        hoten = sc.nextLine();
        System.out.println("Nhap tuoi : ");
        tuoi=sc.nextInt();
        System.out.println("Nhap so can cuoc nhan dan : ");
        cccd = sc.nextLong();
    }
    public void xuatthongtin(){
        System.out.println("Ho ten : "+hoten);
        System.out.println("Tuoi : "+tuoi);
        System.out.println("Cccd : "+cccd);
    }
    public String getHoten(){
        return hoten;
    }
    public int getTuoi(){
        return tuoi;
    }
    public long getCccd(){
        return cccd;
    }
    public String toString(){
        return "\nHo ten : "+hoten+", tuoi : "+tuoi+", cccd : "+cccd;
    }
public static void main(String[] args) {
    ArrayList<THH450Person> arrListPerson = new ArrayList<>();
    THH450Person ps = new THH450Person();
    Scanner sc =new Scanner(System.in);
    System.out.println("Nhap so phan muon them vao ArrayListPerson : ");
    int n = sc.nextInt();
    for(int i = 0 ;i<n;i++){
        ps.nhapthongtin();
        arrListPerson.add(ps);
    }
    System.out.println("Nhap thong tin muon xoa : ");
    THH450Person Psdel = new THH450Person();
    Psdel.nhapthongtin();
    for(int i = 0 ; i<arrListPerson.size();i++){
        if(arrListPerson.contains(Psdel)){
            arrListPerson.remove(Psdel);
        }
    }
    System.out.println("\nHien thi thong tin : ");
    System.out.println(arrListPerson);
    }
}

