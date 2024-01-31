import java.util.Scanner;
public class Nhapn {
    public static void main(String[] args) {
        int n,i,Tong=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n=");
          n = sc.nextInt();
          while(n>0) { i= n%10;
                n=n/10;
                Tong +=i;}
        System.out.println("Tong cac chu so=" +Tong);
        sc.close();
    }
}
