
class Add_2 {
    int total;
    int add2c(int a, int b) {
        int s;
        s = a + b;
        total += s;
        return(s);
    }
    float add2c(float a, float b) {
        float s;
        s = a + b;
        total += s;
        return(s);
    }
}
/* 실행방법 : 목적 프로그램 실행시에는 main()메소드가 존재하는 클래스명 하나만 명시
 * 클래스명을 여러개 명시하면 두번째부터는 모두 무시
 * 여기서 클래스명의 의미가 중요한데 이는 파일 시스템상의 파일을 지칭하는 것은 아님
 * 클래스명은 말 그래도 main() 메소드를 가지고 있는 클래스의 이름
 * 따라서, 클래스명에 경로명 형태의 표시를 해서는 x : java ./STEP_04_Add_2는 안됨
 * JVM은 주어진 클래스명을 기반으로 하여 이차적으로 클래스명.class 파일을 디스크에서 검색하여 적재함
 * 이후 참조되는 클래스들도 동일한 방법으로 참조 클래스명을 기반으로 하여 해당 클래스 목적 프로그램 파일을 검색하고 적재.
 * 클래스 목적 프로그램 파일의 검색 위치는 기본적으로 현재 작업하고 있는 디렉토리.
 * 컴파일 예시 -> javac STEP_04_Add_2.java Add_2.java or javac STEP_04_Add_2.java
 * 실행 예시 -> java STEP_04_Add_2 or java STEP_04_Add_2 Add_2(Add_2는 무시됨)
 */
