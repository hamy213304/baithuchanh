package btchuong3.Kethua;

import java.util.Scanner;

public class HinhTron2 extends HinhHoc{
    public float banKinh;
    public HinhTron2(){
        ten= "Hinh Tron\n";
    }
    public void nhapBanKinh(){
        System.out.print("\nBan kinh = ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = 2*pi*banKinh;
    }
    public void tinhDienTich(){
        dienTich= pi*banKinh*banKinh;
    }
}
