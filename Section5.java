package oracle_master_silver;

public class Section5 {

	// コンストラクタの定義
	// Section5 s5 = new Section5(100);で呼び出せる
	Section5(int i) {
		System.out.println(i);
	}
	
	// 上記のコンストラクタをいつも通りに書いてみると…
	// Section5 s5 = new Section5();
	// s5.p_163(100); で呼び出すことになる
	public void p_163(int i) {
		System.out.println(i);		
	}

	
	// オーバーロード
	// 引数のデータ型、並び、数が違えばオーバーロードできる
	String p_167(int a, String b) { return a + b; }
	String p_167(int a, int b) { return "a, b"; }
	
	// 戻り値の型が違っても、引数のデータ型、並び、数が同じならば
	// オーバーロードできない
	// void p_167(int a, String b) { }
	// int p_167(int a, int b) { return a + b; }
	
	
	// static変数とstaticメソッドの呼び出し（説明はmainにて）
	static int staticI = 10;
	static void p_170(int i) {
		staticI = i;
		System.out.println("static i: " + staticI);
	}
}

// staticイニシャライザ
class P_174 {
	// クラスファイルがロードされたタイミングで実行
	static {
		System.out.println("P_174 static");
	}
	
	// コンストラクタ
	P_174() {
		System.out.println("P_174 コンストラクタ");		
	}
}