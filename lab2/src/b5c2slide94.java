import java.util.Scanner;

public class b5c2slide94 {
    public static void main(String[] args) {
        int i, tong =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap lan luot cac so nguyen: ");
         do{   System.out.println("So nguyen: ");
          i = sc.nextInt();
          tong +=i; }
     while(tong<100);
         {System.out.print("Tong cac so nguyen vua nhap = " + tong);
         sc.close();}
        }
}
