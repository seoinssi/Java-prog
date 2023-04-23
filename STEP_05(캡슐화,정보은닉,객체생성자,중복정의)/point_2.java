//정보은닉과 관련한 코드
//캡슐화를 하면 접근할 수 없도록 함
//쉽게 값이 보이지 않도록 필드값에 직접 접근하지 않고 접근차이(메소드)를 통해 접근이 가능하도록 함
import java.io.*;

class Point_2 { 

	int x;
	int y;
	
	//x, y 값을 한번에 설정가능하도록 하는 메소드
	void set_xy(int x, int y) {
		if (x<0) System.err.println("Value of x is invalid");
		else if (y<0) System.err.println("Value of y is invalid");
		else {
			this.x= x; //매개변수 x
			this.y = y; //메소드가 호출되는 객체, this를 빼면 다른 x를 의미함.
		}			
	}
	//필터링을 통해 의미있는 값만 받을 수 있도록 함
	void set_x(int x) {
		if (x<0) System.err.println("Value of x is invalid");
		else this.x= x;			
	}

	void set_y(int y) {
		if (y<0) System.err.println("Value of y is invalid");
		else this.y= y;			
	}
	//값을 읽을때도 메소드를 통해 접근
	//x값을 얻어주는 함수
	int get_x() {
		return x;
	}

	int get_y() {
		return y;
	}
}

class STEP_05_Point_2 {
	public static void main(String[] args) throws IOException {

	Point_2 pnt1, pnt2;
	int x1, x2, y1, y2;
	double d1;

	x1 = System.in.read() - '0';
	y1 = System.in.read() - '0';
	x2 = System.in.read() - '0';
	y2 = System.in.read() - '0';

	//포인트 객체 만든다. 
	pnt1 = new Point_2(); pnt1.set_xy(x1,y1);
	pnt2 = new Point_2(); pnt2.set_xy(x2,y2);

	//get_x()는 직접 접근하지않는 정보은닉에서 사용되는 함수로 x에 다가가는 통로라고 생각하면 좋다
	d1 = Math.sqrt(Math.pow(pnt1.get_x() - pnt2.get_x(), 2) +	
	                    Math.pow(pnt1.get_y() - pnt2.get_y(), 2) );
	System.out.printf("d1=%f\n", d1);
	}
}

/*클래스 즉 캡슐로 포장된 필드에 대한 접근은 가급적 주어진 메소드를 경유하도록 함
 * 이를 위해 필드에 대한 접근 유형을 분석해 필요한 모든 접근 메소드를 빠짐없이 정의해 클래스에 넣어줌
 * 클래스는 필드와 필드에 대한 접근 통로인 메소드들로 구성
 * 필드에 대한 접근이 검증된 메소드를 통해 이루어지므로 잘못된 좌표가 설정될 가능성은 없음
 * 정보 은닉 : 클래스 내 필드에 대한 외부의 직접적인 접근을 불허하는 것은 클래스 내 필드를 감추는 결과
 * c언어는 함수에 데이터를 넣는 개념이라면 자바는 데이터의 접근 통로인 메소드를 붙이는 개념
 */
	
