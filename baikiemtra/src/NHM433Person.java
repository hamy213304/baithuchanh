import java.util.LinkedList;
import java.util.Scanner;

public class NHM433Person {
    public String hoten;
    public int masv;
    public double diem;
    Scanner sc = new Scanner(System.in);
    public void nhapTT[]{
        System.out.println("Yeu cau: nhap cac thong tin sau");
        System.out.println("Nhap ho va ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap ma sinh vien: ");
        masv = sc.nextInt();
        System.out.println("Nhap diem: ");
        diem = sc.nextDouble();
    }
    public void xuatTT[]{
        System.out.println("Ho va ten: "+hoten);
        System.out.println("Ma sinh vien: "+masv);
        System.out.println("Diem: "+diem);
    }
    
    }
    