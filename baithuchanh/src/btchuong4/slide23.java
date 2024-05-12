import java.util.ArrayList;
import java.util.Scanner;

public class slide23 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListNumber = new ArrayList<Integer>();
    int number,n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ban muon nhap bao nhieu phan tu");
    n=sc.nextInt();
    for (int i=0; i<n;i++){
    System.out.println("Vui long nhap phan tu thu "+i);
    number = sc.nextInt();
    arrListNumber.add(number);}
    int max =arrListNumber.get(0);
    for (int i=1; i<arrListNumber.size();i++){
        if (arrListNumber.get(i).compareTo(max)>0){
            max = arrListNumber.get(i);        }
    }
    System.out.println("Phan tu lon nhat trong mang la: "+max);
    sc.close();
    }
}