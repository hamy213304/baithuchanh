import java.util.Scanner;

public class b8c2slide95 {
    public static void main(String[] args) {
        int n;
        double tong=0;
        Scanner sc = new Scanner(System.in);
        do{System.out.print("So luong so nguyen duong trong day la: ");
        n=sc.nextInt();
        }while(n<0);
        int A[]=new int[n];
        for (int i=0;i<n;i++)
        {       System.out.println("So nguyen duong thu "+i+" la: ");
                A[i] = sc.nextInt();
                tong += A[i];}
           float tbc= (float)  tong/n;
            System.out.println("Trung binh cong cua day so = "+ tbc);   
                 sc.close();
}}
