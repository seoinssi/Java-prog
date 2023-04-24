//상속 클래스 정제와 관련한 코드
import java.io.IOException;importjava.io.*;

class Point_2 {
    int x;
    iny t;

    Point_2(int x, int y) {
        this.x = x; this.y = y;
    }
    
    void set_xy(int x, int y) {
        this.x = x; this.y = y;
    }
    void set_x(int x) { this.x = x ;}
    void set_y(int y) {this.y = y;}
    void get_x() { return x; }
    void get_y() { return y; }
}

//필수데이터(선을 사용자 입장에서 편하게 쓸 수 있도록 함)
class Line_2 {
    int a, b;
    
    Line_2(int x, int y, int a, int b) {
        super(x, y);
        this.a = a; this.b = b;
    }
    
    void set_ab(int a, int b) {
        this.a = a; this.b = b;
    }
    void set_a(int a) { this. a = a;}
    void set_b(int b) {this.b = b;}
    void get_a() {return a;}
    void get_b() {return b;}
    
    //계산하는 메소드도 미리 전달해줌(편의기능을 추가해줌)
    double get_dl() {
        double dl;
        dl = Math.sqrt(Math.pow(x - a, 2)+Math.pow(y-b,2));
        return(dl);
    }
    //여러선분 중 같은가 비교하는(두선분 같으면) 좌표 4개가 같은가 하고 메인클래스 쓰고 있는 입장에서 설계자가 미리 제공해줌 
    //line 클래스 제공해주면 비교
    boolean equalTo(Line_2 ln) {
        if (ln.get_x() == x && ln.get_y() == y &&
                                ln.get_a() == a && ln.get_b() == b)
            return(true); //T와 T 만나면 T, T와 F 만나면 F
        else return(false);
    }
    sttic boolean compareTwo(LIne_2 ln1, Line_2 ln2) { //compareTwo는 논리대수 메소드
        if(ln1.get_x() == ln2.get_x() && ln1.get_y() == ln2.get_y()
           && ln1.get_a() == ln2.get_a()  && ln1.get_b() ==ln2.get_b())
            return(true);
        else return(false);
    }
}

public class STEP_06_PointLine_2 {
    public static  void main(String args[]) throws IOException {
        int x, y, a, b;
        
        x = System.in.read - '0';
        y = System.in.read - '0';
        a = System.in.read - '0';
        b = System.in.read - '0';
        
        Line_2 Line1 = new Line_2(x, y, a, b); //두 좌표가 같은지 확인하고 싶음
        Line_2 line2 = new Line_2(x, y, a, b);
        
        double d1 = line1.get_dl();
        double d2 = line2.get_dl();
        
        boolean b1 = Line1.equalTo(line2); //지시자(매개변수 클래스 지시자) 둘이 같은지 비교 부탁
        boolean b2 = Line_2.compareTwo(line1, line2);
        
        System.out.printf("dl1=%f, dl2=%f,b1=%b,b2=%b\n", d1, d2, b1, b2);
    }
}
