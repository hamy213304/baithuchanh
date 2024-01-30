import java.util.Scanner;

public class b3c2slide93 {
    public static void main(String[] args) {
        String ten;
        int tuoi, namsinh;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cua ban: ");
        ten = sc.nextLine();
        System.out.print("Nhap nam sinh cua ban: ");
        namsinh = sc.nextInt();
        tuoi = 2024 - namsinh;
        if (tuoi<16) System.out.println("Ban "+ten+" o do tuoi vi thanh nien");
        else if (tuoi >=16 && tuoi <18) System.out.println("Ban "+ten+" o do tuoi truong thanh");
       else if (tuoi >=18) System.out.println("Ban "+ten+" da gia");
       sc.close();
    }
}
