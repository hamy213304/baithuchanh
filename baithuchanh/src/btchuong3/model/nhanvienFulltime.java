package btchuong3.model;

import btchuong3.util.Configs;

public class nhanvienFulltime extends nhanvien{
    private int ngayLamThem;
    private int loaiChucVu;
    public nhanvienFulltime(String ten){
        this.ten=ten;
    }
    public nhanvienFulltime( String ten, int ngayLamThem){
        this.ten=ten;
        this.ngayLamThem = ngayLamThem;
    }
    public void setloaiChucVu( int loaiChucVu){
        this.loaiChucVu = loaiChucVu;
    }
    @Override
    public String loaiNhanVien(){
       return "Nhan vien chinh thuc";
    }
    public void tinhLuong(){
        if (loaiChucVu == 1) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem*Configs.LUONG_LAM_THEM_MOI_NGAY;
        } else luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem*Configs.LUONG_LAM_THEM_MOI_NGAY;
    }
}
