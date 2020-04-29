package testGame;

/*
 * コマンドでセレクトさせるためのクラス
 */

public class Select {


	//次へ進むためのメソッド（数で選択）
	public static int next() {

		System.out.println("1:次へ");

		int next = new java.util.Scanner(System.in).nextInt();

		return next;
	}

	// 文書を読むためのメソッド（数で選択）
	public static int selectRead() {

		System.out.println("[メニュー]1:PDFを見る 2:PDFを見ない");

		int selected1 = new java.util.Scanner(System.in).nextInt();

		return selected1;
	}


	// 道具や武器を手に入れるメソッド（数で選択）
	public static int selectGet() {

		System.out.println("[メニュー]1:受け取る 2:受け取らない");

		int selected2 = new java.util.Scanner(System.in).nextInt();

		return selected2;

	}


	// 話の聞き取りができるメソッド（数で選択）
	public static int selectListen() {
		
		System.out.println("[メニュー]1:聞く 2:聞かない");

		int selected3 = new java.util.Scanner(System.in).nextInt();

		return selected3;
	}

	
	// 行動を決定できるメソッド（数で選択）
	public static int selectMenu() {
		
		System.out.println("[メニュー] 1:次へ 2:寝る 3:飲む");
		
		int selected4 = new java.util.Scanner(System.in).nextInt();
		
		return selected4;
		
	}
	
	
	// 攻撃するかどうかを決めるためのメソッド（数で選択）
	public static int selectAttack() {
		
		System.out.println("");
		
		System.out.println("張飛はどうする？");
		
		System.out.println("[メニュー] 1:攻撃 2:何もしない");
		
		int selected5 = new java.util.Scanner(System.in).nextInt();
		
		return selected5;
	}

}
