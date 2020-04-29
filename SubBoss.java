package testGame;

// 徐晃のクラス
public class SubBoss extends Fighter {

	public void attack(Fighter m) {

		System.out.println("");
		System.out.println(this.name + "は素早く刀を振りかざした!!");

		int probability = new java.util.Random().nextInt(2);

		switch(probability) {

		case 1:
			System.out.println(m.name + "はかわし切れない！！");
			System.out.println("50のダメージ!!");
			System.out.println("");

			m.hp -= 50;

			break;

		default :
			System.out.println(m.name + "は間一髪で刀をよけた！！");
			System.out.println("");

			break;
		}

	}


	public void run() {

		System.out.println("");
		System.out.println(this.name + "はその場に静かに倒れた.");
		System.out.println("<徐晃>そなたのような猛き者にこれを授けよう…");
		System.out.println("");
		System.out.println("▽張飛は『青龍偃月刀』をGETした！！");
		System.out.println("");
		System.out.println("張飛の攻撃力が2倍に上がった!!");
		System.out.println("");
	}


	// 徐晃のコンストラクタ
	public SubBoss() {
		this.name = "徐晃";
		this.hp = 100;
	}

}
