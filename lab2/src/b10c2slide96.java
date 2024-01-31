import java.util.Scanner;

public class b10c2slide96 {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        int dem=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi khong qua 80 ky tu: ");
        chuoi =sc.nextLine();
        if (chuoi.length()>80) {System.out.print("Ban da nhap qua 80 ky tu. Vui long nhap lai: ");}
        System.out.print("Ban muon dem ky tu nao? ");
        kytu= sc.next().charAt(0);
        for (int i=0;i<chuoi.length();i++)
        {if(chuoi.charAt(i)==kytu){dem++;}}
        System.out.println("So lan xuat hien ky tu " +kytu+" trong chuoi la: " +dem);  
        sc.close(); }
}
