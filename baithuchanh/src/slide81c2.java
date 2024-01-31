import java.util.Scanner;

public class slide81c2 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao so dong cua ma tran: ");
            n1 = sc.nextInt();
            System.out.println("Nhap vao so cot cua ma tran: ");
            n2 = sc.nextInt();
        int A [][]=new int [n1][n2];
        System.out.println("Nhap cac phan tu cho mang: ");
        for (int i=0; i<n1; i++){
            for (int j=0; j<n2; j++){
                System.out.println("A[" +i+"]["+j+"]=");  
                A[i][j]=sc.nextInt();
            }
        }
int max = A[0][0];
for (int i=0; i<n1; i++){
    for (int j=0; j<n2; j++){
        if (max < A[i][j]) max = A[i][j];
    }
}     System.out.println("Phan tu co gia tri lon nhat trong ma tran la " +max);
sc.close();
    }}
