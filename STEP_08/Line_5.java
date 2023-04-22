import kor.point.*;

class Line_5 extends Point_5 {
	int a, b;
	
	Line_5(int x, int y, int a, int b) {
		super(x,y);
		this.a = a; this.b = b;
	}
	int get_a() { if (a < 0) return 0; else return a; }
	int get_b() { if (b < 0) return 0; else return b; }

	public int get_x() { //public을 사용해야 어디서든 접근가능함을 의미
		if ( super.get_x() > 0) return (super.get_x());//컴파일 오류 발생
		else return (0);//override가 안된 이유는 상위 클래스에서 멤버변수 접근x
	}//상위 클래스는 Point_5임
	public int get_y() {
		if ( super.get_y() > 0) return (super.get_y());
		else return (0);
	}

	public double get_dl() {
	double dl;
	dl = Math.sqrt(Math.pow(get_x() - a, 2) + Math.pow(get_y() - b, 2) );
	
	return (dl);
	}
}
