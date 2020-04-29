package testGame;

// 夏侯惇のクラス
public class LastBoss extends Fighter{


	public void attack(Fighter m) {

		System.out.println("");
		System.out.println(this.name + "は鋭く矛を突き刺した！！");
		System.out.println(m.name + "の腹部に直撃した！！");
		System.out.println("60のダメージ!!");
		System.out.println("");

		m.hp -= 60;

	}


	public void run() {

		System.out.println("");
		System.out.println(this.name + "は馬からのけぞり落ちた.");
		System.out.println("<夏侯惇>我が一生の不覚…");
		System.out.print("　　　" + "なぜ天は張飛なぞ生まれさせず、");
		System.out.println("我一人にさせてくれなかったのか！！");
		System.out.println("");
	}


	// 徐晃のコンストラクタ
	public LastBoss() {
		this.name = "夏侯惇";
		this.hp = 200;
	}


}
