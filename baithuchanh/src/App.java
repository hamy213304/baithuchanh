public class App {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        System.out.println("Thong tin hinh tron 1:");
       ht.nhapR();
       ht.tinhcv();
       ht.tinhdt();
       ht.incv();
       ht.indt();
       System.out.println("\nThong tin hinh tron 2:");
        HinhTron ht2 = new HinhTron();
        ht2.nhapR();
        ht2.tinhcv();
        ht2.tinhdt();
        ht2.incv();
        ht2.indt();
    }
}
