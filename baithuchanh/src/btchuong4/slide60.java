import java.util.LinkedHashSet;
import java.util.Scanner;

public class slide60 {
    public static void main(String[] args) {
        int xoa;
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        lhs.add(0);
        lhs.add(3);
        lhs.add(8);
        lhs.add(5);
        lhs.add(4);
        System.out.println("Danh sach phan tu trong LinkedHashSet: ");
        System.out.println(lhs);
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap phan tu can xoa: ");
        xoa = sc.nextInt();
        if(lhs.contains(xoa)){
            lhs.remove(xoa);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong HashSet: ");
            System.out.println(lhs);
        } else{System.out.println("Xoa khong thanh cong!");}
        sc.close();
        }
    }
