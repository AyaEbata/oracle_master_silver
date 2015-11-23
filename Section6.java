package oracle_master_silver;

import java.util.Arrays;
import java.util.List;

// サブクラス
public class Section6 extends Section6_superClass {
	
	// 詳細はmainにて（継承）
	public void p212() {
		System.out.println("section6 sub class");
	}

	
	// オーバーライド
	// スーパークラスで定義したメソッドと同じメソッド名、引数で、
	// アクセス修飾子、戻り値の型はスーパークラスより公開範囲が広いものを使用
	public void p217_1() {
		System.out.println("サブクラス！");
	}

	// スーパークラスのp217_2()メソッドよりアクセス修飾子（publicとか）の
	// 公開範囲が狭いから、コンパイルエラー
	// void p217_2() { }
	
	
	// サブクラスとスーパークラスのコンストラクタ
	// どっちのコンストラクタをmainから呼び出しても、
	// スーパークラスのSection6_superClass()の方のコンストラクタが
	// 先に呼び出されてから呼び出される
	public Section6() {
		System.out.println("サブクラスのコンストラクタ");
	}
	public Section6(String s) {
		// ここでsuper("Hello");を呼ぶと、Section6_superClass()ではなく
		// Section6_superClass(String s)が呼び出される
		// （コンストラクタの先頭に書かないとコンパイルエラー）
		super("Hello");
		System.out.println("サブクラスのコンストラクタ" + s);
	}
	
	// 配列に関連するJava API
	public void p252() {
		int[] array = {10, 20, 30, 40, 50};
		int[] copy = new int[2];
		
		// array[2]から、copy[0]に2つ値をコピーする
		System.arraycopy(array, 2, copy, 0, 2);
		Arrays.stream(copy).forEach(System.out::println);
		
		// 配列かどうか isArray()
		System.out.println(array.getClass().isArray());
		
		// toArray()でコレクションを配列にする
		List<String> list = Arrays.asList("aya", "Hello", "World");
		String[] strArray = (String[])list.toArray();
		System.out.println("strArray[0]: " + strArray[0]);
	}
}

// 抽象クラスを継承
class P228_subClass extends Section6_abstractClass {
	// 抽象クラスにてp228メソッドにabstractを定義しているため、
	// サブクラス内で定義しないとコンパイルエラーになってしまう
	void p228() {
		System.out.println("abstract!");
	}
}