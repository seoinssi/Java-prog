import java.io.*;

class AddSub_2 {

    int total;

    AddSub_2(int total) {
        this.total = 0;
    }

    class Add {
        int total; //add_total
        Add(int total) {
            this.total = total;
        }
        int add2c(int a, int b) {
            int s= a + b;
            AdddSub_2.this.total += s;
            total += s;
            return(s);
        }
    }

    class Sub{
        int total;

        Sub(int total) {
            this.total = total;
        }
        int sub2c(int a, int b) {
            int s = a - b;

            AddSub_2.this.total -= s;
            total -= s;
            return(s);
        }
    }
}

class STEP_03_AddSub_2 {
    public static void main(String args[]) throws IOException {

        AddSub_2 addsub;
        AddSub_2.Add add;
        AddSub_2.Sub sub;
        /* AddSub_2클래스 내부에 Add클래스와 SUb클래스 존재 
         * 이들은 더하기 빼기 기능을 제공함
         * 이들 기능을 사용하기 위해 객체를 생성하고 Add, Sub 생성
         */

        int i, j, k, m, n;

        i = System.in.read() - '0';
        j = System.in.read() - '0';

        addsub = new AddSub_2(0);
        /* AddSub_2 클래스의 객체를 생성합니다.
        생성자 AddSub_2(int)를 호출하며, 인자로 0을 전달합니다.
        생성된 객체의 포인터를 addsub에 저장합니다. */
        add = addsub.new Add(0);
        /* AddSub_2 클래스의 내부 클래스인 Add의 객체를 생성합니다.
        생성자 Add(int)를 호출하며, 인자로 0을 전달합니다.
        addsub 객체에서 Add 객체를 생성하며, 생성된 Add 객체의 포인터를 add에 저장합니다. */
        sub = addsub.new Sub(0);
        /* AddSub_2 클래스의 내부 클래스인 Sub의 객체를 생성합니다.
        생성자 Sub(int)를 호출하며, 인자로 0을 전달합니다.
        addsub 객체에서 Sub 객체를 생성하며, 생성된 Sub 객체의 포인터를 sub에 저장합니다. */

        k = add.add2c(i, j);
        m = sub.sub2c(i, j);
        n = addsub.total;

        System.out.printf("%d+%d=%d(%d)\n", i, j, k, n);
    }
}
