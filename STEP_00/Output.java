class Output {
	public static void main (String args[]) {
	int i;
	System.out.print("Output test...\n");
	System.out.println("Output test...");
//ln은 새로운 라인을 의미하는 것
	System.out.println(args.length);
//자바에서는 구조도 배열형식으로 사용함 
//배열에 데이터를 넣는 순간 멤버변수에 변화가 일어나서 몇개가 사용중인지 알 수 있음
//c에서는 배열 100개 선언해도 몇개 사용했는지 알기 위해서는 새로운 변수를 사용하여 진행해야하는 불편함이 있을 수 있음
	System.out.printf("%d\n", args.length);
	
	for (i = 0; i < args.length; i++){
		System.out.println(args[i]);
	}
}


}
