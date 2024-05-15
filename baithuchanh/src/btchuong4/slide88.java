import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class slide88 {
    public static void main(String[] args) {
        String n;
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> HM = new HashMap<>();
        HM.put("HN", "Ha Noi");
        HM.put("HCM", "Ho Chi Minh");
        HM.put("QN", "Quang Ninh");
        HM.put("QN", "Quang Ngai");
        HM.put("QB", "Quang Binh");
        System.out.println("Danh sach cac thanh pho trong HashMap: ");
        Set<Map.Entry<String,String>> setCity = HM.entrySet();
        System.out.println(setCity);
        System.out.println("HN: "+HM.get("HN"));
        System.out.println("QN: "+HM.get("QN"));
        System.out.println("Nhap thanh pho ban muon kiem tra xem co trong danh sach hay khong: ");
        n = sc.nextLine();
        if (HM.containsValue(n)) {
            System.out.println("Co thanh pho " +n +" trong HashMap");
        } else {System.out.println("Khong co thanh pho nay trong HashMap");}
        sc.close();
    }
}
