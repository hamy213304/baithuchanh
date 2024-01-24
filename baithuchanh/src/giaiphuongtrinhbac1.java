import java.util.Scanner;
public class giaiphuongtrinhbac1 {
    public static void main(String[] args) {
    double a,b,x;
    Scanner sc = new Scanner(System.in);
   System.out.print("Nhap a=");
     a = sc.nextDouble();
    System.out.print("Nhap b=");
     b = sc.nextDouble();
    if ( a==0){
     System.out.println("Khong phai nghiem cua phuong trinh");
    }else{
        x = -b/a;
    System.out.println("Phuong trinh co nghiem x=" + x);}
     sc.close();
}
}