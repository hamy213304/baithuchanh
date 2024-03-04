import java.util.Scanner;

public class Student {
    public String name;
    public int masv;
    public int namsinh;
    public int tuoi;
    public String nganh;
        public void nhapthongtin(){
    Scanner sc = new Scanner(System.in);
    System.out.print("\nNhap ho va ten: ");
    name = sc.nextLine();
    System.out.print("\nNhap ma sinh vien: ");
    masv = sc.nextInt();
    System.out.print("\nNhap nam sinh: ");
    namsinh = sc.nextInt();
    sc.nextLine(); // thêm cái này mới nhập được ngành(Tiêu thụ ký tự mới sau nextInt ở trên)
    System.out.print("\nNhap nganh dang hoc: ");
    nganh = sc.nextLine();
    sc.close();}
        public void inthongtin(){
    System.out.print("\nHo va ten: "+name);
    System.out.print("\nMa sinh vien: "+masv);
    System.out.print("\nTuoi: "+tuoi);
    System.out.print("\nDang hoc nganh: "+nganh);}
        public int tinhTuoi(){
            tuoi = (2024 - namsinh);
            return tuoi;
        }
        public static void main(String[] args) {
    Student sv = new Student();
System.out.print("Nhap vao thong tin cua sinh vien:");
sv.nhapthongtin();
sv.tinhTuoi();
sv.inthongtin();
}}