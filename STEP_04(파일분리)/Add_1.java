import java.io.*;

class STEP_04_Add_1 {
    public satatic void main(Stirng args[]) throws IOException {
        Add_1 add;
        int s, y, z;
        float a, b, c;

        x = System.in.read() - '0'; a = x;
        y = System.in.read() - '0'; b = y;

        add = new Add_1();

        z = add.add2c(x, y);
        c = add.add2c(a, b);
        System.out.printf("%d+%d=%d(%f)\n", x, y, z, c);
    }
}

class Add_1 {
    int total;
    int add2c(int a, int b) {
        int s;
        s = a + b;
        total += s;
        return(s);
    }
    float add2c(float a, float b) {
        int s;
        s = a + b;
        total += s;
        return(s);
    }
}

/*코드 설명 : 하나의 소스 파일레 여러개의 클래스를 둘 수 있음(그러나 하나의 파일에 다수의 클래스를 배치하는 것은 권고되지 않음)
* 파일 하나에 여러개의 클래스를 배치하더라도 컴파일러는 모든 클래스 하나하나에 대해 클래스명.class 이름의 목적 프로그램 파일로 분리해 생성
* 하나의 파일에 여러개의 클래스를 코딩하는 경우 클래스의 소스 내 배치 순서는 결과에 아무런 영향을 미치지 않음 */
