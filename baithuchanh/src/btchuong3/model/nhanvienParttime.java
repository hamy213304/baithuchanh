package btchuong3.model;

import btchuong3.util.Configs;

public class nhanvienParttime extends nhanvien {
    private int gioLamViec;
    public nhanvienParttime(String ten, int gioLamViec){
        this.ten=ten;
        this.gioLamViec=gioLamViec;
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan vien thoi vu";
    }
    public void tinhLuong(){
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO*gioLamViec;
    }
}
