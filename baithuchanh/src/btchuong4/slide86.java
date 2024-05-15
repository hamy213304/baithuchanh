import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide86 {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        //them value trong hashmap dung put khong dung add
        hm.put("Bo sat","Ran");
        hm.put("Luong cu", "Ech");
        hm.put("Gia suc", "Trau");
        hm.put("Gia cam", "Ga");
        hm.put("Dong vat co vu", "Tinh tinh");
        //tao mot set chua toan bo entry(Vua key vua value) roi in 
        Set<Map.Entry<String,String>> setHM = hm.entrySet();
        System.out.println("Cac entry co trong HashMap: ");
        System.out.println(setHM);
    }
}
