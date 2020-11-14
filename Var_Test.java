class Var_Test{

	public static void main(String[] args) {
		String str = "asdf";
		String str_2 = str+2;
		int i = 3;
		String str_3 = str+i;

		int a = 111;
		int b = 0111;
		int c = 0x111;
		int d = 0b111;

		int nu_m = 1234______123_2;

		// const int pi = 3.14;
		final int pi = 3.14;

		System.out.println("str : "+str);		// asdf
		System.out.println("str_2 : "+str_2);	// asdf2
		System.out.println("str_3 : "+str_3);	// asdf3

		System.out.println("a : "+a);			// 111
		System.out.println("b : "+b);			// 73
		System.out.println("c : "+c);			// 273
		System.out.println("d : "+d);			// 7

		System.out.println(nu_m);

		System.out.println("\\, \f, \\");
	}
	
}