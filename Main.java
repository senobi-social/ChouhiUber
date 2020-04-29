package testGame;

public class Main {

	public static void main(String[] args) {


		Story.opening();
		Story.pdfRead();
		Story.koumeiTapioka();
		Story.tapiokaGet();
		Story.koumeiRules();
		Story.departure();


		/*
		 * バトルシーンここから
		 */

		// 登場人物をnewする
		MainCharacter mc = new MainCharacter();
		Soldier s = new Soldier();
		SubBoss sub = new SubBoss();
		SuperCharacter sc = new SuperCharacter();
		LastBoss last = new LastBoss();
		
		Story.menu(mc);

		// ステージ１ ここから
		Story.stage1();

		// 残りHP残量の確認
		System.out.println("★" + mc.name + "のHPは" + mc.hp + "です");
		System.out.println("★" + s.name + "のHPは" + s.hp + "です");

		Story.battle1(mc, s);
		
		Story.menu(mc);
		
		// ステージ２ ここから
		Story.stage2();

		// 残りHP残量の確認
		System.out.println("★" + mc.name + "のHPは" + mc.hp + "です");
		System.out.println("★" + sub.name + "のHPは" + sub.hp + "です");

		Story.battle2(mc, sub);
		
		Story.menu(mc);
		
		// ステージ３ ここから
		Story.stage3();

		// 残りHP残量の確認
		System.out.println("★" + sc.name + "のHPは" + sc.hp + "です");
		System.out.println("★" + last.name + "のHPは" + last.hp + "です");

		Story.battle3(sc, last);


		/*
		 * バトルシーンここまで
		 */


		Story.arrival();
		Story.ending1();
		Story.ending2();
		Story.ending3();







	}

}
