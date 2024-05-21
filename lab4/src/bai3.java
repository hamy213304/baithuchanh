import java.util.LinkedList;
import java.util.Scanner;

class SV{
    String ten;
    int diem;
    public SV(String ten, int diem){
        this.ten = ten;
        this.diem = diem;
    }
}
public class bai3 {
    public static void main(String[] args) {
        LinkedList<SV> dsSV = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhap ho va ten sinh vien: ");
            String ten = sc.nextLine();
            if(ten.isEmpty()){
                break;
            }
        System.out.println("Nhap diem cua sinh vien "+ten);
        int diem = sc.nextInt();
        sc.nextLine();
        SV tt = new SV(ten, 0);
        dsSV.add(tt);}
        int TL = 0;
        for(SV svien:dsSV){
            if(svien.diem<=5){
            TL++;}}
            System.out.println("So sinh vien phai thi lai: "+TL);
            System.out.println("Danh sach sinh vien thi lai: ");
        for(SV svien:dsSV){
            if(svien.diem<=5){
                System.out.println(svien.ten+" "+svien.diem);
            }
        }
        int max = dsSV.get(0).diem;
        for(SV svien:dsSV){
            if(svien.diem>max){max=svien.diem;}}
        System.out.println("Sinh vien co diem cao nhat: ");
        for(SV svien:dsSV){
            if (svien.diem == max) {
                System.out.println(svien.ten+" "+svien.diem+ " diem");
            }
        }
        System.out.println("Nhap ten sinh vien can tim: ");
        String tim=sc.nextLine();
        for(SV svien:dsSV){
            if(svien.ten.equalsIgnoreCase(tim)){
                System.out.println("Day la sinh vien ban tim: ");
                System.out.println(svien.ten+" "+svien.diem+" diem");
            }
            else {System.out.println("Khong tim thay sinh vien nay");
        }}
        sc.close();
}}
