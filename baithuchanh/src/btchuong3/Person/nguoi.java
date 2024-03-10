package btchuong3.Person;

public class nguoi {
    public String HoTen;
    public int tuoi;
    public String ngheNghiep;
    public String gioiTinh;
    public nguoi(){
        HoTen = "Nguyen Ha My";
        tuoi = 20;
        ngheNghiep = "Sinh vien";
        gioiTinh = "Nu";
    }
        public void in(){
            System.out.println(HoTen +"-" + tuoi + "-" + ngheNghiep + "-" +gioiTinh);
        }
        public void in(String name, int age, String work, String gender){
            System.out.println(name +"-" + age + "-" + work + "-" + gender );
        }
        public static void main(String[] args) {
            nguoi hmy = new nguoi();
            hmy.in();
            hmy.in("Nguyen Ha My", 20, "Sinh vien", "Nu");
        }
    }

