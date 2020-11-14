class Hello{
	public static int sum_1(int a, int b){
		return a+b;
	}
	public int sum_2(int a, int b){
		return a+b;
	}
	int sum_3(int a, int b){
		return a+b;
	}
	// public static void main(String[] args) {
	// 	int a = 1,b=2;

	// 	int result_1 = sum_1(a,b);
	// }
}

public class Test_Method{
// protected class Test_Method{
// private class Test_Method{
// class Test_Method{
	public static void main(String[] args) {
		int a = 1,b=2;

		//int result_1 = sum_1(a,b);
		//int result_2 = sum_2(a,b);
		//int result_3 = sum_3(a,b);

		Hello cla = new Hello();

		int result_2 = cla.sum_2(a,b);
		int result_3 = cla.sum_3(a,b);

	}
}