package btchuong3.Kethua;

import java.util.Scanner;

public class HinhTru extends HinhTron2 {
    public float chieuCao;
    public HinhTru(){
        ten = "Hinh Tru";
    }
    public void nhapChieuCao(){
        System.out.print("\nNhap chieu cao: ");
        Scanner sc = new Scanner(System.in);
        chieuCao= sc.nextFloat();
    }
    public void tinhTheTich(){
        theTich= pi*banKinh*banKinh*chieuCao;
    }
}
