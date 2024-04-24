package btchuong3.lopTruuTuong;

public class soChanLe implements number{
    public void phanLoai(){
        System.out.println("Cach phan loai cac so:");
        System.out.println("So chan la cac so chia het cho 2");
        System.out.println("So le la cac so khong chia het cho 2");
        System.out.println("0 la so khong chan khong le");
    }
    public static void main(String[] args) {
        soChanLe s1=new soChanLe();
        s1.phanLoai();
    }
}

