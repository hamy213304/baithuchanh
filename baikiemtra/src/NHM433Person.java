import java.util.LinkedList;
import java.util.Scanner;

public class NHM433Person {
    public String hoten;
    public int masv;
    public double diem;
    Scanner sc = new Scanner(System.in);
    public void nhapTT(){
      
    }
    public void xuatTT(){
       
    }
    public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so luong nguoi: ");
    int n = sc.nextInt();
    public void themTT(){
        System.out.println("Nhap thong tin can them: ");
        String them=sc.nextLine();
        ll.add(them);
    }
    public void suaTT(){
        System.out.println("Ban muon sua phan nao? Ho va ten=1,Ma sinh vien=2,Diem=3");
        int sua=sc.nextInt();
        if(sua==1){
            System.out.println("Nhap lai ho va ten: ");
            hoten = sc.nextLine();
        } else if(sua==2){
            System.out.println("Nhap lai ma sinh vien");
            masv=sc.nextInt();
        } else if(sua ==3){
            System.out.println("Nhap lai diem: ");
            diem = sc.nextInt();
        }
    }
    public void xoaTT(){
        System.out.println("Nhap thong tin muon xoa: ");
        String xoa = sc.nextLine();
        ll.remove(xoa);
    }
    public void hienthiTT(){
        System.out.println("So luong nguoi trong list: "+n);
    }
    
    }
    
}
