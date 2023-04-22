import java.io.*;
class Add_3 {

    int total; 
    int add2i(int a, int b) {
        int s;
        s = a + b;
        total += s; 
        System.out.println("add2c(int, int)...");
        return(s);
        /* 호출할 때 가장 적절한 메소드 호출
         * (현상황에서는 사용자가 제공하는 매개변수에 맞는 메소드를 컴파일러가 알아서 호출)
         */
    }

    float add2c(float a, float b) {
        float s;
        s = a + b;
        total += s;
        System.out.println("add2c(float, float)...");
        rerurn(s);
    }

    int add2c(int a, float b) {
        float s;
        s = a + b;
        total += s;
        System.out.println("add2c(int, float)...");
        return((int)s);
        
          
class STEP_02_Add_1 {
    public stattic void main(Stirng args[]) throws IOException {
        Add_2 add;
        int i, j, k;
        float x, y, z;
        
        i = System.in.read() - '0'; x = (int)i;
        j = System.in.read() - '0'; y = (int)j;
        
        add = new Add_();
//add는 지정자고 new 연산자를 사용하여 새로운 생성자 Add_3()을 형성
        k = add.add2c(i ,j);
        z = add.add2c(x, y);
        m = add.add2c(i, x);
        w = add.add2c(x, i);
//정확하게 일치하는 타입을 찾아서 출력하고자 함
//if)w에 해당하는 메소드 형성 -> float add2c(
        System.out.printf("%d+%d=%d(%f)\n", i, j ,k, z);
    }
}

/* (출력결과) java STEP_02_Add_3
* 1 2 (엔터)
* add(2c)(int, int)...
* add2c(float, float)...
* add2c (int, float)...
* add2c(float, float)...
* 1 + 2 = 3(3.00000) <- w =add.add2c(x, i); 에 ㄷ한 해답
* x는 float, y는 int라 대응되는 함수는 없음. 커버할 수 있는 함수 ㅐ ->add2x(float, float)사용 가능 */
       
