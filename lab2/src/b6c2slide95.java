import java.util.Scanner;

public class b6c2slide95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        long gthua = 1;
        System.out.println("Nhap vao mot so nguyen duong bat ky: ");
        n = sc.nextInt();
        for (int i=1;i<=n;i++){
        gthua = gthua*i;}
        System.out.println("Giai thua cua so " +n+" = "+gthua);
        sc.close();
    }
}
