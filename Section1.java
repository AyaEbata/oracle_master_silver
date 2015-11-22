package oracle_master_silver;

public class Section1 {
	public void p_26() {
		int num1 = 10;  // 普通にint
		long num2 = 30;  // intでもokな値だからintとみなして通る
		
		// long num3 = 10000000000;   // コンパイルエラー
		// int（32ビット）で通らないような大きな値は、long（64ビット）の値に変更してあげれば通る
		// （まず、intとしてみるから）
		long num3 = 10000000000L;

		// float num4 = 10.0;   // コンパイルエラー
		float num4 = 10.0F;  // float（32ビット）の値に変更してあげれば通る
		double num5 = 10.0;  // これなら通る（まず、double（64ビット）としてみるから）
		
		System.out.println("num1: " + num1 + ", num2: " + num2);
		// num1: 10, num2: 30
		System.out.println("num3: " + num3);  // num3: 10000000000
		System.out.println("num4: " + num4 + ", num5: " + num5);
		// num4: 10.0, num5: 10.0
	}
}
