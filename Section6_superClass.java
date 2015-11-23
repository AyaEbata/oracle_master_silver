package oracle_master_silver;

// スーパークラス
public class Section6_superClass {
	
	// 継承
	public void p212_superClass() {
		System.out.println("section6 super class");
	}
	
	// オーバーライド
	public void p217_1() {
		System.out.println("スーパークラス！");
	}
	public void p217_2() {
		System.out.println("スーパークラス！！！");
	}
	
	// サブクラスとスーパークラスのコンストラクタ
	public Section6_superClass() {
		System.out.println("スーパークラスのコンスタント");
	}
	public Section6_superClass(String s) {
		System.out.println("スーパークラスのコンスタント" + s);
	}
}
