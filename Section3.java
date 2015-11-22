package oracle_master_silver;

public class Section3 {
	
	// 小数を使った演算
	public void p_65() {
		// 整数/整数（出力：3）
		System.out.println(10/3);

		// 整数/小数（出力：3.3333333333333335）
		System.out.println(10/3.0);
		// 小数/整数（出力：3.3333333333333335）
		System.out.println(10.0/3);
	}
	
	// 文字列と数値混合での出力
	public void p_66() {
		String s = "Hello";
		int n = 10;
		int m = 20;
		
		// 前から1つずつ足されていく
		System.out.println(s + n + m);  // Hello1020
		// s + n + m = (s + n) + m = "Hello10" + m = "Hello1020"
		
		System.out.println(n + m + s);  // 30Hello
		// n + m + s = (n + m) + s = 30 + s = "30Hello"
	}
	
	// インクリメント
	public void p_67() {
		int a = 10, b;
		int c = 10, d;
		int e = 10, f = 10;

		b = a++;
		// aの値をbに代入してから、aの値を++する
		System.out.println("a: " + a + ", b: " + b);  // a: 11, b: 10
		
		d = ++c;
		// cの値を++してから、dにcの値を代入する
		System.out.println("c: " + c + ", d: " + d);  // c: 11, d: 11
		
		// 出力してから++
		System.out.println("e++: " + e++);
		// ++してから出力
		System.out.println("++f: " + ++f);
	}
	
	// 論理演算子
	public void p_71() {
		int a = 10, b = 10, c = 10, d= 10;
		
		// &は、1つでもfalseがあったら、全体でもfalseを返す
		// （falseとtrueでfalse、falesとfalseでfalseのように）

		// だから、&&の場合は、a++ > 10でfalseがでた時点で結果がfalseになるってわかるから、
		// それ以降は実行されない
		Boolean result1 = a++ > 10 && ++b > 10;
		System.out.println("result1: " + result1 + ", a: " + a + ", b: " + b);
		// result1: false, a: 11, b: 10

		// &が1つの場合は、最後まで実行してくれる
		Boolean result2 = c++ > 10 & ++d > 10;
		System.out.println("result2: " + result2 + ", c: " + c + ", d: " + d);
		// result2: false, c: 11, d: 11
	}
	
	// Stringクラスの掻い摘んだやつ1
	public void p_73_1() {
		String str = "abcdefg";

		// "c"が前から何番目に出てくるか知りたいとき（intでいける）
		int c = 'c';
		System.out.println("何番目？ " + str.indexOf(c));  // 何番目？ 2
		
		// "def"が前から何番目に出てくるか知りたいとき（こっちはString）
		String def = "def";
		System.out.println("何番目？ " + str.indexOf(def));  // 何番目？ 3

		// ちなみに先頭は0番目
	}
	
	// Stringクラスの掻い摘んだやつ2
	public void p_73_2() {
		String str = "abcde";
		
		// replace(char oldChar, char newChar)
		char c1 = 'd', c2 = 'f';
		System.out.println(str.replace(c1, c2));  // abcfe		

		// replace(CharSequence target, CharSequence replacement)
		// StringはCharSequenceをimplementsしてるからStringでもいける
		String s1 = "bc", s2 = "gg";
		System.out.println(str.replace(s1, s2));  // aggde		
	}

	// 参照型の比較
	public void p_79() {
		int[] array1 = {10}, array2 = {10};
		// 参照先が同じであるかを比較
		System.out.println(array1 == array2);        // false
		// 値が同じであるかを比較
		System.out.println(array1[0] == array2[0]);  // true
		
		int[] array3 = {10}, array4 = array3;
		// 参照先を同じにしているためtrue
		System.out.println(array3 == array4);  // true
	}
	
	// 文字列の比較
	public void p_81() {
		String a = new String("aya");
		String b = new String("aya");
		// new String(文字列)で作っている場合、個別に作られるから
		// 参照している場所が異なり、falseになる
		System.out.println(a == b);  // false
		
		String c = "aya";
		String d = "aya";
		// 普通に代入している場合は、メモリ上に同じ文字列が存在すれば
		// 同じ場所を参照してくれるため、trueになる
		System.out.println(c == d);       // true
		System.out.println(c.equals(d));  // true
	}
	
	//booleanのif
	public void p_87() {
		boolean b1 = false;
		boolean b2 = true;
		
		// =が1つしかないためbooleanだと、ただb1にb2の値を代入しただけになってしまう
		if (b1 = b2) {
			System.out.println("b1: " + b1 + ", b2: " + b2);
			// b1: true, b2: true
		}
	}
	
	// switchのbreakがないときの動き
	public void p_96() {
		int num = 2;
		
		// breakがないときは、条件に合ったcase以降のcaseも実行される
		switch(num) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");  // 実行される
		case 3:
			System.out.println("3");  // 実行される
		}
	}
	
	// 練習問題　問題3-1
	public void p_99_1() {
		int x = 7;
		int y = 6 * x++;
		// y = 6 * 7 = 42 をやった後に、x = 8 になる
		System.out.println("x: " + x + ", y:" + y);  // x: 8, y:42

		int a = 7;
		int b = 6 * ++a;
		// a = 8 になってから、b = 6 * 8 = 48 をになる
		System.out.println("a: " + a + ", b:" + b);  // a: 8, b:48	
	}
	
	// 練習問題　問題3-2
	public void p_99_2() {
		byte x = 3;		
		// byte y = 2 * x++;        // エラー
		byte y = (byte) (2 * x++);  // (byte)を書いてあげれば通る
		
		// byte z = x * y;          // エラー
		byte z = (byte) (x * y);    // (byte)を書いてあげれば通る
		
		System.out.println(z);  // 24

		// double、long、float以外の型は全てintに変換されてから演算される
		x = 3;		
		int intY = 2 * x++;  // これなら通る（上のと同じもの）
		int intZ = x * y;    // これなら通る（上のと同じもの）

		System.out.println(intY);  // 6
		System.out.println(intZ);  // 24
	}
}
