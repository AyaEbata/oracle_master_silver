package oracle_master_silver;

public class Section7 {

	// finally
	public void p290() {
		int[] array = {1, 2};
		
		// finallyはtryが実行されてもcatchが実行されても
		// 処理終わるごとに毎回実行される
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println("try" + array[i]);				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("例外！");
			} finally {
				System.out.println("--おわり--");
			}
		}
	}
}
