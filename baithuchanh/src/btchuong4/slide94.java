import java.util.LinkedHashMap;
import java.util.Scanner;

public class slide94 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("Lop 1", "6 tuoi");
        lhm.put("Lop 2", "7 tuoi");
        lhm.put("Lop 11", "17 tuoi");
        lhm.put("Lop 12", "18 tuoi");
        System.out.println("Danh sach cac phan tu trong map: ");
        System.out.println(lhm);
        String xoa;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap vao khoa can xoa: ");
        xoa = sc.nextLine();
        if(lhm.containsKey(xoa)){
            lhm.remove(xoa);
            System.out.println("Xoa thanh cong");
            System.out.println("Map sau khi xoa: ");
            System.out.println(lhm);
        } else {System.out.println("Xoa khong thanh cong!");}
        sc.close();

    }
}
