import java.util.HashSet;
import java.util.Scanner;

public class slide54{
    public static void main(String[] args) {
        int n;
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSet.add(0);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(1);
        System.out.println("Cac phan tu trong hastSet la: ");
        System.out.println(hashSet);
        System.out.println("Vui long nhap phan tu can them: ");
        n = sc.nextInt();
        if (!hashSet.contains(n)) {
            hashSet.add(n);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong hashSet sau khi them: ");
            System.out.println(hashSet);
        } else {
            System.out.println("Phan tu" +n+"da ton tai!");
            System.out.println("Vui long nhap lai phan tu can them: ");
            n = sc.nextInt();
            hashSet.add(n);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong hashSet sau khi them: ");
            System.out.println(hashSet);
                }
        sc.close();
    }
}