import java.util.Scanner;
import java.util.TreeSet;

public class slide69 {
    public static void main(String[] args) {
        int n;
        TreeSet<Integer> trs = new TreeSet<>();
        trs.add(0);
        trs.add(3);
        trs.add(5);
        trs.add(7);
        trs.add(9);
        trs.add(1);

        System.out.println("Danh sach cac phan tu trong TreeSet: ");
        System.out.println(trs);
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap phan tu muon them: ");
        n = sc.nextInt();
        if (!trs.contains(n)) {
            trs.add(n);
            System.out.println("Them thanh cong!");
            System.out.println("Danh sach cac phan tu sau khi nhap: ");
            System.out.println(trs);
        } else {System.out.println("Phan tu vua nhap da ton tai! \nVui long nhap lai phan tu khac: ");
            n=sc.nextInt();
            trs.add(n);
            System.out.println("Them thanh cong!");
            System.out.println("Danh sach cac phan tu sau khi nhap: ");
            System.out.println(trs);
    }
        sc.close();
    }
}
