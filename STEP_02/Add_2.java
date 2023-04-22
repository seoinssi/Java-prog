import java.io.*;
class Add_2 { //클래스 선언 

    int data; 
    int add2i(int a, int b) {
        int s;
        s = a + b;
        total += s; 
        return(s);
    }

    float add2f(float a, float b) {
        float s;
        s = a + b;
        total += s;
        rerurn(s);
    }

    int add2if(int a, float b) {
        float s;
        s = a + b;
        total += s;
        return((int)s);

    float add2fi(float a, int b) {
        float s;
        s = a + b;
        total += s;
        return(s);
        }
    }

    class STEP_02_Add_1 {
        public stattic void main(Stirng args[]) throws IOException {
            Add_2 add; //지시자
            int i, j, k; //지역변수 선언
            float x, y, z;

            i = System.in.read() - '0'; x = (int)i; //명시적형변환 (프로그래머수행)
/* (int) 없으면 flaoat에서 int 변현해...오류
/* 작은 범위의 수를 큰 범위에 저장하면 무리 x) 
            j = System.in.read() - '0'; y = (int)j; */

            add = new Add_();
            z = add.add2f(x, y);
            k = add.add2if(i ,y);//정수 값들이 실습---컴파일 오류 발생 
            
            System.out.printf("%d+%d=%d\n", i, j ,k);
    }


}
