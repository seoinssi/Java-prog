//work/STEP_04_Add.java ADD_4.java

/*o*/javac work/STEP_04_Add_4.java Add_4.java
/*o*/javac work/STEP_04_Add_4.java
/*o*/javac -cp "." work/STEP_04_Add_4.java

/*파일 하나하나를 제대로 명시해주는 방법은 가능
*메인 클래스만 주고 서브 클래스 생략(서브 클래스 기본 디렉토리에 있음->컴파일 ㅇ)
*/

/*x*/javac -cp "work" STEP_04_Add_4.java
/*x*/javac -cp ".;work" STEP_04_Add_4.java

/*x*/java work/STEP_04_Add_4
/*x*/java work/STEP_04_Add_4 ADD_4
/*^*/java -cp work STEP_04_Add_4
/*^*/java -cp work STEP_04_Add_4 Add_4
//컴파일할 때 미리 메인클래스 알려줘야함 클래스는 지정없이 바로 접근가능해야함
/*o*/java -cp ".;work" STEP_04_Add_4
//파일을 반드시 지정된 곳에서 찾음 통째로 옵션 설정, 들어가는 순서 상관 x 
//실행할 때 주는 것은 파일 이름 x [클래스 이름]



