import java.util.*;

public class ngay31_1bthtrang81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        do{
            System.out.print("Nhap so hang cua ma tran : ");
            n = sc.nextInt();
        } while(n <= 0);
        
        do{
            System.out.print("Nhap so cot cua ma tran : ");
            m = sc.nextInt();
        } while(m <= 0);

        int[][] matrix = new int[n][m];
        for(int i = 0;i < n; ++i)
            for(int j = 0;j < m; ++j)
                matrix[i][j] = sc.nextInt();
        int max_value = Integer.MIN_VALUE;
        for(int i = 0;i < n; ++i){
            for(int j = 0;j < m; ++j){
                if(matrix[i][j] > max_value)
                    max_value = matrix[i][j];
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran la : " + max_value);
    }
}
