import java.io.*;
class Add_1 { //데이터 넣을 클래스 선언

    int total; //멤버변수(필드) _ 전역변수에 해당함 
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
            Add_1 add;
            int i, j, k;
            float x, y, z;

            i = System.in.read() - '0'; x = i;
            j = System.in.read() - '0'; y = j;

            add = new Add_();
            z = add.add2f(x, y);
            k = add.add2if(i ,y);
            
            System.out.printf("%f%f=%f\n", x, y, z);
        }
    }
}
