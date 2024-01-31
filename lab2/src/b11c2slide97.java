import java.util.Scanner;

public class b11c2slide97 {
    public static void main(String[] args) {
        int n,x;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so phan tu cua mang: ");
            n= sc.nextInt();
        } while (n<0);
        int A[] = new int [n];
        System.out.println("Nhap cac phan tu cho mang: ");
        for (int i=0; i<n; i++)
        {System.out.println("Nhap phan tu thu "+i+":");
         A[i]=sc.nextInt();}
        System.out.print("Mang ban dau la:");
         for (int i=0; i<n; i++)
        {System.out.print(A[i]+"\t" );}
        for (int i=0; i<n-1; i++)
        {for (int j=i+1;j<n;j++)
            {if (A[i]>A[j]){
            x=A[i];
            A[i]=A[j];
            A[j]= x;}}}
        System.out.print("\nMang da sap xep tang dan la:");
        for (int i=0; i<n; i++)
        {System.out.print(A[i]+"\t" );}
        sc.close();
}
}