package btchuong3.lopTruuTuong;

public class cat extends animals {
    void Run(){
        System.out.println("Meo  bat chuot rat nhanh");
    }
    void Eat(){
        System.out.println("Meo an tap");
    }
    public static void main(String[] args) {
        animals meo = new cat();
        meo.Run();
        meo.Eat();
    }
}
