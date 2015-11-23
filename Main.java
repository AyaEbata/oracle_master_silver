package oracle_master_silver;

// 紫の本を元にやってみてますです。

public class Main {
	public static void main(String[] args) {
//		Section1 s1 = new Section1();
//		s1.p26();
		
//		Section2 s2 = new Section2();
//		s2.p37();
//		s2.p52(args);
		
//		Section3 s3 = new Section3();
//		s3.p65();
//		s3.p66();
//		s3.p67();
//		s3.p71();
//		s3.p73_1();
//		s3.p73_2();
//		s3.p79();
//		s3.p81();
//		s3.p87();
//		s3.p96();
//		s3.p99_1();
//		s3.p99_2();
		
//		Section4 s4 = new Section4();
//		s4.p129();
//		s4.p139();
		
		Section5 s5 = new Section5(100);
//		s5.p163(200);
		
//		staticMethod();
				
//		new P174();
		
//		s5.p179();
		s5.p188();
	}
	
	// static変数とstaticメソッドの呼び出し	
	public static void staticMethod() {
		// staticは Section5 s5 = new Section5(); のようにインスタンス化せずに
		// Section5.staticメソッドor変数 のように書けるため、
		// s5のように指定して、s5用の領域を確保する、とかできない。
		// また、staticの場合は領域が1つしか確保できない。
		// だから、Section5.p170(20);にて値を代入してしまうと
		// Section5.staticIは代入前と代入後で値が変わってしまう。
		System.out.println("static i: " + Section5.staticI);  // static i: 10
		Section5.p170(20);  // static i: 20
		System.out.println("static i: " + Section5.staticI);  // static i: 20		
	}
}
