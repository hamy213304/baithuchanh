package btchuong3.HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;
    public HinhChuNhat(){
        ten = "Hinh Chu Nhat";
    }
    public void nhapChieuDai(){
        System.out.print("\nNhap chieu dai: ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.print("\nNhap chieu rong: ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi =(dai + rong)*2;
    }
    public void tinhDienTich(){
        dienTich= dai*rong;
    }
    
}
