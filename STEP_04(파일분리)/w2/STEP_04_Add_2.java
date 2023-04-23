import java.io.*;

class STEP_04_Add_2 {
    public static void main(String args[]) throws IOException {
        Add_2 add;
        int x, y ,z;
        float a, b, c;
        
        x = System.in.read() - '0'; a = x;
        y = System.in.read() - '0'; b = y;

        add = new Add_2();

        z = add.add2c(x, y);
        c = add.add2c(a ,b);
        System.out.printf("%d+%d=%d(%f)\n", x, y, z, c);
    }
}
//work 2의 메인 클래스
/* 클래스들을 서로 다른 소스 파일로 분리하여 코딩하는 중
* 컴파일 하는 방법 -> 관련 모든 소스 파일들을 순서에 관계없이 열거하면 *.class 파일 생성됨
* 소스 파일 하나만 명시하면 해당 소스 파일 이하에서 참조하는 모든 소스 파일을 컴파일하고 하나라도 존재하지 않으면 오류 처리
* 이미 컴파일되어 *.class로 존재하는 소스 파일은 컴파일 하지 않음
* 참조되는 클래스의 소스 파일명은 클래스명.java 형태로 일치해야함 */
