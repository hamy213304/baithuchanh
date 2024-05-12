import java.util.LinkedList;

public class slide38 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Thu hai");
        linkedList.add("Thu ba");
        linkedList.add("Thu tu");
        linkedList.add("Thu nam");
        linkedList.add("Thu sau");
        linkedList.add("Thu bay");
        linkedList.add("Chu nhat");

        System.out.println("Cac ngay trong tuan: "+linkedList);
        System.out.println("So phan tu trong danh sach: "+linkedList.size());
        System.out.println("Dau tuan: " +linkedList.getFirst());
        System.out.println("Cuoi tuan: "+linkedList.getLast());
        linkedList.remove(3);
        System.out.println("Danh sach sau khi xoa phan tu thu 4: "+linkedList);
    }
}
