import java.io.*;

class AddSub_2 {
	
	int total;
	//이 필드는 Add 클래스와 Sub 클래스에서 계산된 결과를 총합하여 저장
			
	AddSub_2(int total) {
		this.total = 0; //AddSub_2 클래스의 생성자는 total 필드를 초기화
	}
	class Add{
		int total;
		
		Add(int total) {
			this.total = total;
			//this는 현재 메소드를 포함하고 있는 객체를 의미함
			//클래스 이름과 동일한 메소드를 생성자로 부르고 객체를 생성할 때 자동으로 호출
		}
		int add2c(int a, int b) {
			int s = a+ b;
	
			AddSub_2.this.total += s;
			//내부 클래스에서 이름이 겹치는 외부 클래스 필드를 참조할 경우 접근하여
			//두 클래스 사이의 필드를 식별할 수 있음
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
		int i, j, k, m, n;

		i = System.in.read() - '0';
		j = System.in.read() - '0';

		addsub = new AddSub_2(0);
		add = addsub.new Add(0);
		sub = addsub.new Sub(0);
		k = add.add2c(i, j);
		m = sub.sub2c(i, j);
		n = addsub.total;
		System.out.printf("%d+%d=%d(%d)\n", i , j, k, n);
	}
}
