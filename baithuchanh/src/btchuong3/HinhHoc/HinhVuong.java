package btchuong3.HinhHoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong(){
        ten = "Hinh Vuong";
    }
    public void nhapCanh(){
        System.out.print("\nNhap canh:");
        Scanner sc = new Scanner(System.in);
        dai= rong= sc.nextFloat();
    }
}
