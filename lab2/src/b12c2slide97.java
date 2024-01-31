import java.util.Scanner;

public class b12c2slide97 {
    public static void main(String[] args) {
        int d,c,max;
        Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao so dong cua ma tran: ");
            d = sc.nextInt();
            System.out.println("Nhap vao so cot cua ma tran: ");
            c = sc.nextInt();
        int A [][]=new int [d][c];
        System.out.println("Nhap cac phan tu cho ma tran: ");
        for (int i=0; i<d; i++){
            for (int j=0; j<c; j++){
                System.out.println("A[" +i+"]["+j+"]=");  
                A[i][j]=sc.nextInt();}}
        max =A[0][0];
        for (int i=0; i<d; i++){
         for (int j=0; j<c; j++){
        if(A[i][j]>max){max=A[i][j];} }}
         System.out.println("Phan tu lon nhat cua ma tran la "+max);
        sc.close();
    }}
