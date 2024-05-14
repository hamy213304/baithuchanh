package btchuong3.main;

import btchuong3.model.nhanvienFulltime;
import btchuong3.model.nhanvienParttime;
import btchuong3.util.Configs;

public class main {
    public static void main(String[] args) {
        nhanvienFulltime sep = new nhanvienFulltime("Nguyen Van A");
        sep.setloaiChucVu(Configs.NHANVIEN_SEP);
        nhanvienFulltime linh1 = new nhanvienFulltime("Nguyen Dinh B");
        linh1.setloaiChucVu(Configs.NHANVIEN_LINH);
        nhanvienFulltime linh2 = new nhanvienFulltime("Tran Ngoc C",3);
        nhanvienParttime thoivu= new nhanvienParttime("Dang Thanh D", 20);
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoivu.tinhLuong();
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoivu.xuatThongTin();
        
    }
}
