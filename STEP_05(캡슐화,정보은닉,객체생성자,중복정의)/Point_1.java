//캡슐화 관련 코드 
import java.io.*;

class Point_1 {//좌표 설정
    int x;
    int y;
}

class STEP_05_Point_1 {
    public static void main(String args[]) {
        Point_1 pnt1, pnt2;//객체 지시자로 점이라는 일상적인 데이터를 구성체로 묶어 캡슐화
        int x1, y1, x2, y2;
        double dl;

        x1 = System.in.read() - '0';
        y1 = System.in.read() - '0';
        x2 = System.in.read() - '0';
        y2 = System.in.read() - '0'; 

        //몸통을 할당함        멤버 = 필드, (x,y)포함 점 두개로 메모리할당 저장구역 정함
        pnt1 = new Point_1(); pnt 1.x = x1; pnt 1.y = y1;
        pnt2 = new Point_1(); pnt 2.x = x2; pnt 2.y = y2;

        //Math불러와서 제곱사용
        dl = Math.sqrt(Math.pow(pnt1.x - pnt2.x,2) + Math.pow(pnt1.y - pnt2.y,2));

        System.out.printf("dl=%f\n", dl);
    }
}
