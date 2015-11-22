package oracle_master_silver;

import java.util.ArrayList;

public class Section2 {
	
	// 配列のいろいろな書き方
	public void p_37() {
		int[] i1;          // 配列を宣言
		i1 = new int[50];  // 配列に値を50個入れる領域確保
		
		int[] i2 = new int[50];  // こっちでもok
		
		// 50個しか領域確保していないため、
		// i2[0]から始まるから51個目のi2[50]はコンパイルエラー
		// System.out.println("i2[50]: " + i2[50]);

		// 最初っから初期値として値を入れておく場合
		int[] i3 = {1, 2, 3, 4, 5};
		// 長くなるけど、この書き方でもいける
		int[] i4 = new int[]{1, 2, 3};			
	}
	
	// ArrayList
	public void p_46(){
		// いつも括弧の中身は空にしちゃってたけど、
		ArrayList<String> arrayList1 = new ArrayList<>();
		// 括弧に値入れれば初期サイズの指定ができる
		ArrayList<String> arrayList2 = new ArrayList<>(5);		
	}
	
	// コマンドライン引数
	public void p_52(String[] args) {
		// コマンドライン引数に値を入れて実行（複数いれられる）
		// > java Main aya 111 的な感じで
		// ちなみに今回はp_52メソッドのString[] argsに
		// コマンドラインからの値が入るようにmainにて指定済み
		System.out.println("args[0]:" + args[0]);
		System.out.println("args[1]:" + args[1]);
	}
}
