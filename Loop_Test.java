class Loop_Test{
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < 10; ++i,sum+=i,System.out.println(sum));

		sum = 0;
		for (int i = 0; i < 10; sum+=i,System.out.println(sum),++i);

		
	}
}