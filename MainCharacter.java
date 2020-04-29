package testGame;

// 張飛のクラス
public class MainCharacter extends Fighter {

	public void attack(Fighter m) {

		System.out.println("");
		System.out.println(this.name + "の攻撃！");
		System.out.println(m.name + "に40ポイントのダメージ！");
		System.out.println("");

		m.hp -= 40;
	}

	public void sleep() {

		System.out.println("");
		System.out.println(this.name + "は眠った！");

		// ここから計算処理
		
		int diff = 200 - this.hp;
		
		this.hp += 50;

		if(this.hp >= 200) {
			
			if(diff == 0) {
				
				System.out.println(this.name + "は寝すぎてこれ以上回復しない！！");
				System.out.println("");
				this.hp = 200;
				
				
			} else {
				
				System.out.println(this.name + "は" + diff + "ポイント回復した！！");
				System.out.println("");
				this.hp = 200;
				
				
			}

		} else {

			System.out.println(this.name + "は50ポイント回復した！！");
			System.out.println("");
		}

	}

	public void eat() {

		System.out.println("");
		System.out.print(this.name + "は『たぴおかみるくてぃー』");
		System.out.println("を飲んでしまった!!");
		System.out.println(this.name + "は震えながら死んだ。");
		System.out.println("GAME OVER");
		System.out.println("");
		// 処理の中断
		System.exit(0);
	}

	public void run() {

		System.out.println("");
		System.out.println(this.name + "はやむなく退却した!!");
		System.out.println("GAME OVER");
		System.out.println("");
		// 処理の中断
		System.exit(0);
	}


	// 張飛のコンストラクタ
	public MainCharacter() {
		this.name = "張飛";
		this.hp = 200;
	}

}
