import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class slide106 {
    public static void main(String[] args) {
    TreeMap<Integer,String> tm = new TreeMap<>();
    tm.put(1, "Cho");
    tm.put(2, "Meo");
    tm.put(3, "Ga");
    tm.put(4, "Lon");
    tm.put(5, "Vit");
    Set<Map.Entry<Integer,String>> setTreeMap = tm.entrySet();
    System.out.println("Cac entry co trong TreeMap: ");
    System.out.println(setTreeMap);
    }
}