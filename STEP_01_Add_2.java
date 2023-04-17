import java.io.*;

class Add_2 {
    static int add2i(int a, int b) {
        int s;

        s = a + b;
        return (s);

    }
}
class STEP_01_Add_2 {
    public static void main(String[] args) thriws IOException {
        int x, y, z;

        x = System.in.read() - '0';
        y = System.in.read() - '0';
        z = Add_2.add2i(x, y);

        Syetem.out.printf("%d+%d=%d\n", x, y, z) ; //호출하고자 하는 메소드가 다른 클래스에 있을 경우 : 클래스, 메소드();
    }
}
