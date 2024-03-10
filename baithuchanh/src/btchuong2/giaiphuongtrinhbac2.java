package btchuong2;
import java.util.Scanner;

public class giaiphuongtrinhbac2 {
    public static void main(String[] args) {
        double a,b,c,x1,x2,delta;
    Scanner sc = new Scanner(System.in);
   System.out.print("Nhap a=");
     a = sc.nextDouble();
    System.out.print("Nhap b=");
     b = sc.nextDouble();
     System.out.print("Nhap c=");
     c = sc.nextDouble();
    if (a==0){
        x1 = -c/b;
        if(b!=0)
       System.out.println("Phuong trinh co nghiem x=" + x1);
       else System.out.println("Phuong trinh vo nghiem");
       sc.close();}
    {delta=b*b-4*a*c;
      if (delta>0) {x1=((-b+Math.sqrt(delta))/(2*a));
                    x2=((-b-Math.sqrt(delta))/(2*a));
     System.out.println("Phuong trinh co nghiem x1=" +x1);
     System.out.println("Phuong trinh co nghiem x2=" +x2);}
     else if (delta == 0) {x1=-b/(2*a);
     System.out.println("Phuong trinh co nghiem kep x=" +x1);}
    else  if (delta <0) System.out.println("Phuong trinh vo nghiem");}
     sc.close();
}
}
