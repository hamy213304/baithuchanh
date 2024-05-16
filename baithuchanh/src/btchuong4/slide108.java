import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class slide108 {
    public static void main(String[] args) {
        TreeMap<Integer,String> trm = new TreeMap<>();
        trm.put(0, "Bo tranh tu quy:");
        trm.put(1, "Tung");
        trm.put(2, "Cuc");
        trm.put(3, "Truc");
        trm.put(4, "Mai");
        Set<Map.Entry<Integer,String>> setTM = trm.entrySet();
        System.out.println("Cac entry co trong TreeMap: ");
        System.out.println(setTM);
        trm.replace(0, "Bon tranh tu quy tuong ung bon mua");
        System.out.println("TreeMap sau khi thay the: ");
        System.out.println(setTM);
    }
}
