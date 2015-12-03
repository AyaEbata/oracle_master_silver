package oracle_master_silver;

import p188_package.P188_class;

public class Section5 {

	// コンストラクタの定義
	// Section5 s5 = new Section5(100);で呼び出せる
	Section5(int i) {
		System.out.println(i);
	}
	
	// 上記のコンストラクタをいつも通りに書いてみると…
	// Section5 s5 = new Section5();
	// s5.p163(100); で呼び出すことになる
	public void p163(int i) {
		System.out.println(i);		
	}

	
	// オーバーロード
	// 引数のデータ型、並び、数が違えばオーバーロードできる
	String p167(int a, String b) { return a + b; }
	String p167(int a, int b) { return "a, b"; }
	
	// 戻り値の型が違っても、引数のデータ型、並び、数が同じならば
	// オーバーロードできない
	// void p167(int a, String b) { }
	// int p167(int a, int b) { return a + b; }
	
	
	// static変数とstaticメソッドの呼び出し（説明はmainにて）
	static int staticI = 10;
	static void p170(int i) {
		staticI = i;
		System.out.println("static i: " + staticI);
	}
	
	// 値渡しと参照渡し（呼び出し側）
	public void p179() {
		SubSection5Class sub = new SubSection5Class();
		
		// 値渡し
		// p179_Aメソッド側のnumには値のコピーが渡される
		// だから、ここのメソッドのnumをここで出力すると10のまま
		int num = 10;
		sub.p179_A(num);
		System.out.println("呼び出す側num: " + num);
		// 呼び出す側num: 10
		
		// 参照渡し
		// 値のコピーではなく、その値への参照を渡している
		// だから、ここのメソッドでarrayを呼び出しても値が書き換わっている
		int[] array = {10, 11, 12};
		sub.p179_B(array);
		System.out.println("呼び出す側array[0]: " + array[0]);
		// 呼び出す側array[0]: 20
	}
	
	// 他パッケージの参照
	public void p188() {
		// 別のパッケージを参照する場合、importにて使用したいパッケージを指定しないと
		// P188_classをインスタンス化できない
		P188_class p188Class = new P188_class();
		p188Class.p188PackageClass();
	}
}

class SubSection5Class {
	// 値渡し（呼び出される側）
	public void p179_A(int num) {
		num += 10;
		System.out.println("呼び出される側num: " + num);
		// 呼び出される側num: 20
	}
	
	// 参照渡し（呼び出される側）
	public void p179_B(int[] array) {
		array[0] += 10;
		System.out.println("呼び出される側array[0]: " + array[0]);
		// 呼び出される側array[0]: 20
	}
}

// staticイニシャライザ
class P_174 {
	// クラスファイルがロードされたタイミングで実行
	static {
		System.out.println("P174 static");
	}
	
	// コンストラクタ
	P_174() {
		System.out.println("P174 コンストラクタ");		
	}
}