import java.util.Scanner;

public class HinhTron {
    public float R;
    public float cv;
    public float dt;
    public final float pi = 3.14f;
   public void nhapR() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        R = sc.nextFloat();}
    public void tinhcv(){
        cv = 2*pi*R;}
    public void tinhdt(){
        dt = pi*R*R;}
    public void incv(){
        System.out.print("Chu vi =" +cv);}
    public void indt(){
        System.out.print("\nDien tich =" +dt);}
}
