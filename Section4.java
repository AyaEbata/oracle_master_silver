package oracle_master_silver;

public class Section4 {

	// for文
	public void p129() {
		// 1つめ、3つめの式にカンマ区切りで複数個式をいれることも可能
		for (int i1 = 0, i2 = 0; i1 + i2 < 5; i1++ , i2 += 2) {
			System.out.println("i1: " + i1 + ", i2: " + i2);
		}
		// 出力
		// i1: 0, i2: 0
		// i1: 1, i2: 2
		
		// 無限ループ
		for (;;) {
			System.out.println("test");
			break; // 無限ループになっちゃうから一応いれとく
		}
	}
	
	// breakとcontinueのラベル
	public void p139() {
		loop1:
		// iが2のとき、loop1を抜ける
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 2) {
				System.out.println("break");
				break loop1;
			}
		}
	
		loop2:
		// nが13のとき、それ以降の処理を飛ばしてloop2のnの次の値から再開
		for (int n = 10; n < 20; n++) {
			if (n == 13) {
				System.out.println("continue");
				continue loop2;
			}			
			System.out.println(n);
		}
	}
}
