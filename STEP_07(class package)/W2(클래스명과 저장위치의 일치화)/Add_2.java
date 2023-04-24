package work; //이 아래에 있는 소스코드들은 work에서 관리 (같은 디렉토리에 있는 소스파일->패키지)
//같은 패키지 내에서는 public이 없어도 접근 가능하지만 기본 패키지와 work 패키지는 다른 디렉터리이므러 public을 써줘야만 참고 ㅇ
//public(x)->컴파일 오류 발생(참조불허) : 보안 개념 도입

public class Add_2 {
//public을 사용하여 접근 보안 모드를 풀어주며, 패키지가 다른 클래스들 사이는 기본적으로 서로간에 클래스 필드 메소드를 참조할 수 없음
	int total;

	public int add2c(int a, int b) {

		int s;
		s = a +b;
		total += s;
		return (s);
	}

	public float add2c(float a, float b) {

		float s;
		s = a +b;
		total += s;
		return (s);
	}
}
