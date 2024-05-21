import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        HashSet <String> fruit = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon nhap bao nhieu loai trai cay? ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            System.out.println("Nhap ten loai qua thu "+i+" : ");
            String qua=sc.nextLine();
            fruit.add(qua);
        }
        System.out.println("So qua ban vua nhap la: "+fruit.size());
        System.out.println("Nhap ten qua ban muon kiem tra: ");
        String check = sc.nextLine();
        if(fruit.contains(check)){
            System.out.println("Co tim thay qua "+check);
        }else {System.out.println("Khong tim thay loai qua nay!");}
        System.out.println("Cac loai qua truoc khi xoa: "+fruit);
        System.out.println("Ban muon xoa qua gi? ");
        String xoa = sc.nextLine();
        if(fruit.contains(xoa)){
        fruit.remove(xoa);
        System.out.println("Cac loai qua sau khi xoa: "+fruit);} else System.out.println("Khong tim thay qua de xoa");
        ArrayList<String> hqua = new ArrayList<>();
        hqua.add("Xoai");
        hqua.add("Dua");
        hqua.add("Sau rieng");
        fruit.addAll(hqua);
        System.out.println("Danh sach trai cay sau khi them: ");
        Iterator<String> iterator = fruit.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        fruit.removeAll(hqua);
        System.out.println("Danh sach trai cay sau khi xoa: ");
        iterator= fruit.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        sc.close();
    }
}
