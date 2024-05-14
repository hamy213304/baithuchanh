package btchuong3.Kethua;

import java.util.Scanner;

public class person {
    public String hoTen;
    public String gTinh;
    public int tuoi;
    public int namSinh;
    public int manv;
    public String chucvu;
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.print("\nNhap gioi tinh: ");
        gTinh = sc.nextLine();
        System.out.print("\nNhap ma nhan vien: ");
        manv = sc.nextInt();
        System.out.print("\nNhap nam sinh: ");
        namSinh = sc.nextInt();
    }
    public int tinhTuoi(){
        tuoi = (2024 - namSinh);
        return tuoi;}
    public void xuatTT(){
        System.out.print("\nHo va ten: "+hoTen);
        System.out.print("\nGioi tinh: "+gTinh);
        System.out.print("\nMa nhan vien: "+manv);
        System.out.print("\nTuoi: "+tuoi);
    }
    
}
    
    

