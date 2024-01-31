import java.util.Scanner;

public class b9c2slide96 {
    public static void main(String[] args) {
        String chuoi;
        int kytuth =0;
        int kytuhoa =0;
        int chuso =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        chuoi = sc.nextLine();
        for(int i=0;i<chuoi.length();i++){
        char kytu= chuoi.charAt(i);
        if(Character.isLowerCase(kytu)){kytuth++;} //LowerCase: Dem so ky tu thuong
        else if(Character.isUpperCase(kytu)){kytuhoa++;} //UpperCase: Dem so ky tu hoa
        else if(Character.isDigit(kytu)){chuso++;} //Digit: Dem chu so
        }
        System.out.println("So ky tu thuong trong chuoi la: " + kytuth);
        System.out.println("So ky tu hoa trong chuoi la: " + kytuhoa);
        System.out.println("So chu so trong chuoi la: " + chuso);
        sc.close();

    }
}

