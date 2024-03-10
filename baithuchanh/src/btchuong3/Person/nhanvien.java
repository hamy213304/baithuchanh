package btchuong3.Person;
import java.util.Scanner;

public class nhanvien {
    public String name;
    public String que;
    public int namSinh;
    public int tuoi;
    public String phongBan;
        public void nhapthongtin(){
    Scanner sc = new Scanner(System.in);
    System.out.print("\nNhap ho va ten: ");
    name = sc.nextLine();
    System.out.print("\nNhap que quan: ");
    que = sc.nextLine();
    System.out.print("\nNhap nam sinh: ");
    namSinh = sc.nextInt();
    sc.nextLine(); 
    System.out.print("\nNhap phong ban dang cong tac: ");
    phongBan = sc.nextLine();
    sc.close();}
    public int tinhTuoi(){
        tuoi = (2024 - namSinh);
        return tuoi;
    }
        public void inthongtin(){
    System.out.print("\nHo va ten: "+name);
    System.out.print("\nQue quan: "+que);
    System.out.print("\nTuoi: "+tuoi);
    System.out.print("\nPhong ban: "+phongBan);}
        public static void main(String[] args) {
    nhanvien nv = new nhanvien();
System.out.print("Nhap vao thong tin cua nhan vien:");
nv.nhapthongtin();
nv.tinhTuoi();
nv.inthongtin();
}}
