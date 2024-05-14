package btchuong3.Kethua;

import java.util.Scanner;

public class employee extends person {
    public int time;
    public int luong;
    int luongpt=700000;
    int luongft=900000;
    public void time(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so gio lam viec: "+ time);
        time=sc.nextInt();
    }
    public void nhapChucVu(){
        System.out.print("Ban lam partime hay fulltime? "+ chucvu);
        Scanner sc = new Scanner(System.in);
        chucvu = sc.nextLine();
    }
    public void inLuong(){
        System.out.print("\nLuong: " +luong);
        
}
}