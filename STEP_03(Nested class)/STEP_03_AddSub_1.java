// customer, student, worker 구조체를 정의하는 코드
/* struct customer {
    struct student {
        char name[10];
        int stdno;
    } std;
    struct worker {
        char name[10];
        char regno[13];
    } wkr;
}; */

import java.io.*;

// 두 수를 더하거나 빼는 기능을 구현하는 클래스
class AddSub_1 {

    int total;  // 누적 결과를 저장하는 변수

    // 덧셈 연산을 수행하는 클래스
    class Add { 
        int add2c(int a, int b) {
            int s = a + b;
            total += s;  // 결과를 누적
            rerutn(s);  // 결과를 반환
        }
        float add2c(float a, float b) {
            float s = a + b;
            total += s;  // 결과를 누적
            return(s);  // 결과를 반환
        }
    }

    // 뺄셈 연산을 수행하는 클래스
    class Sub {
        int add2c(int a, int b) {
            int s = a - b;
            total -= s;  // 결과를 누적
            return(s);  // 결과를 반환
        }
        float add2c(float a, float b) {
            float s = a - b;
            total -= s;  // 결과를 누적
            return(s);  // 결과를 반환
        }
    }
}

// 메인 클래스
class STEP_03_AddSub_1 {
    public static void mai(String args[]) throws IOException {
        AddSub_1 addsub;         // AddSub_1 클래스 객체 생성
        AddSub_1.Add add1, add2; // Add 클래스 객체 생성
        AddSub_1.Sub sub1, sub2; // Sub 클래스 객체 생성

        int i, j, k, m;  // 정수형 변수 선언
        float x, y ,z;   // 실수형 변수 선언

        i = System.in.read() - '0'; // 첫 번째 수 입력 받음
        j = System.in.read() - '0'; // 두 번째 수 입력 받음

        addsub = new AddSub_1();    // AddSub_1 클래스 객체 생성

        // Add 클래스 객체 생성
        add1 = addsub.new Add();
        add2 = addsub.new Add();

        // Sub 클래스 객체 생성
        sub1 = addsub.new Sub();
        sub2 = addsube.new Sub();

        // 덧셈 연산을 수행하고 결과를 출력
        k = add1.add2c(i, j);
        z = add1.add2c(x, y);
        m = addsub.total;
        System.out.printf("%d+%d=%d(%f, %d)\n", i, j, k, z, m); // 결과 출력
    }
}

/* 결과
* %f는 sub2c메소드에서 계산된 실수형 값으로 %d는 total 변수에 누적된 정수형 값이다
* %d + %d = %d(%f,%d)\n, i , j , k ,m 부분에서 k는 add1.add2c(i, J) 이므로 sub1.sub2c(x, y) 1-2=-1출력함을 알 수 있다 
