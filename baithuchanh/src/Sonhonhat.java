import java.util.Scanner;

public class Sonhonhat {
    public static void main(String[] args) {
        int so1,so2,min;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat=");
          so1 = sc.nextInt();
          System.out.print("Nhap so thu hai=");
          so2 = sc.nextInt();
       min=so1;
        if(so1>so2) min= so2;
        System.out.print("Vay so nho nhat trong hai so=" +min);
sc.close();
    }
}
