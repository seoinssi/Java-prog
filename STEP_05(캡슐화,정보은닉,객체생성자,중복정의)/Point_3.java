#객체 생성자를 정의하여 잘못딘 객체의 생성을 원천 예방

import java.io.*;

class Point_3 {
    int x;
    int y;
    //Point_3() {} -> 메소드 중복 정의 탄생할때부터 유일한 값

    Point_3(int x, int y) { //클래스 이름과 동일하게 만듥 초기화만 하고 끝남
        set_xy(x, y); //좌표 설정 
    }

    void set_xy(int x, int y) {
        if (x < 0) System.err.println("Value of x is invalid");
        else if (y < 0) System.err.println("Value of y is invalid");
        else {
            this.x = x;
            this.y = y;
        }
    }

    void set_x(int x) {
        if (x < 0) System.out.println("Value of x is invalid");
        else this.x = x;
    }

    void set_y(int y) {
        if (y < 0) System.out.println("Value of y is invalid");
        else this.y = y;
    }

    int get_x() {
        return x;
    }

    int get_y() {
        return y;
    }
}

class STEP_05_Point_3 {
    public static void main(String args[]) throws IOException {
        Point_3 pnt1, pnt2;
        int x1, y1, x2, y2;
        double dl;

        x1 = System.in.read() - '0';
        y1 = System.in.read() - '0';
        x2 = System.in.read() - '0';
        y2 = System.in.read() - '0';

        pnt1 = new Point_3(x1, y1); //유일한 값을 생성하겠다(unique)
        pnt2 = new Point_3(x2, y2);//기본형은 호출이 안될수도있음 생성하면서 초기화를 한다(유일) -> 생성자를 주는 것

        dl = Math.sqrt(Math.pow(pnt1, get_x() - pnt2.get_x(), 2) + Math.pow(pnt1, get_y() - pnt2, get_Y()), 2);
    }
}

/* 객체가 new 연산자에 의해 생성딜 때 호출되는 메소드를 생성자라고 함
 * 생성자는 일반로직코드에서 호출되지 않고 내부적으로 호출되므로 리턴값이 있을 수 없고 타입이 없음 
 * 클래스 이름과 동일한 메소드는 자동적으로 생성자로 인식
 * 어떤 생성자도 정의되어 있지 않으면 자바 컴파일러가 매개 벼누와 처리 코드가 없는 기본 생성자를 넣어줌
 * 생성자에 대한 매개 변수는 new연산자에 의해 전달됨
 * 언제나 유의미한 객체 생성을 보장하기 위해 적절한 생성자 정의가 필수적
 */
