import java.util.HashSet;
import java.util.Scanner;

public class slide56 {
    public static void main(String[] args) {
        String xoa;
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Cho");
        hashSet.add("Meo");
        hashSet.add("Ga");
        hashSet.add("Vit");
        hashSet.add("Bo");
        System.out.println("Cac phan tu trong HashSet: ");
        System.out.println(hashSet);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa: ");
        xoa = sc.nextLine();
        if (hashSet.contains(xoa)) {
            hashSet.remove(xoa);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong HashSet: ");
            System.out.println(hashSet);
        } else{System.out.println("Xoa khong thanh cong!");}
        sc.close();
    }
}
