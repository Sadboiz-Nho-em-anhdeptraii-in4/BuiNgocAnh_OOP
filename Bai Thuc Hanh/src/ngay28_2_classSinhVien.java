import java.util.*;

class Student{
    private int id;
    private String name, date, address;

    public Student(int id, String name, String date, String address){
        this.id = id;
        this.name = name;
        this.date = date;
        this.address = address;
    }

    public void chuanHoa(){
        // chuan hoa ten
        String result = "";
        String[] t = name.split("\\s+");
        for(String x : t){
            result += Character.toUpperCase(x.charAt(0));
            for(int i = 1;i < x.length(); ++i)
                result += Character.toLowerCase(x.charAt(i));
            result += " ";
        }
        this.name = result.trim();
        
        // chuan hoa ngay sinh
        StringBuilder sb = new StringBuilder(date);
        if(sb.charAt(2) != '/')
            sb.insert(0 , '0');
        if(sb.charAt(5) != '/')
            sb.insert(3 , '0');
        this.date = sb.toString();
    }

    public void inThongTin(){
        System.out.println("Id :" + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Date : " + this.date);
        System.out.println("Address : " + this.address);
    }
}

public class ngay28_2_classSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So hoc sinh ban muon nhap : ");
        int n = sc.nextInt();
        ArrayList<Student> qlySinhVien = new ArrayList<>();
        for(int i = 0;i < n; ++i){
            System.out.print("Nhap id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhap ten : ");
            String name = sc.nextLine();
            System.out.print("Nhap ngay sinh : ");
            String date = sc.nextLine();
            System.out.print("Nhap dia chi : ");
            String address = sc.nextLine();
            Student st = new Student(id , name , date , address);
            st.chuanHoa();
            qlySinhVien.add(st);
        }

        for(Student student : qlySinhVien){
            student.inThongTin();
        }
    }
}
