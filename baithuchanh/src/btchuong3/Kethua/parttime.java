package btchuong3.Kethua;

public class parttime extends employee{
    public parttime(){
        chucvu="Nhan vien parttime";
    }
    public int tinhLuong(){
        luong=time*luongpt;
        return luong;
    }
    public static void main(String[] args) {
        parttime nv = new parttime();
        nv.nhapTT();
        nv.tinhTuoi();
        nv.time();
        nv.nhapChucVu();
        nv.tinhLuong();
        nv.xuatTT();
        nv.inLuong();
        fulltime nv2 = new fulltime();
        nv2.nhapTT();
        nv2.tinhTuoi();
        nv2.time();
        nv2.nhapChucVu();
        nv2.tinhLuong();
        nv2.xuatTT();
        nv2.inLuong();
}
}
