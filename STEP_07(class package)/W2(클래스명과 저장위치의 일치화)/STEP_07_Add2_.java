import java.io.*;

//클래스 이름에 경로명 주면 call path 필요하지 않음 경로명을 따라 컴파일/실행
class STEP_07_Add_2 {

	public static void main(String args[]) throws IOException {

		work.Add_2 add; //Add_2가 work 폴더 속에 있음 

		int x, y, z;
		float a, b, c;

		x = System.in.read() - '0'; a = x;
		y = System.in.read() - '0'; b = y;

		add = new work.Add_2();
//중첩클래스와 헷갈리지 말 것 단지, 다른 폴더 아래의 메소드 함수 표현
		z = add.add2c(x, y);
		c = add.add2c(a, b);
		System.out.printf("%d+%d=%d(%f)\n",x, y, z, c);
	}
}

//메인 클래스
