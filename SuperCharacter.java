package testGame;

// 『青龍偃月刀』をもった後の張飛クラス
public class SuperCharacter extends MainCharacter {

	public void attack(Fighter m) {

		System.out.println("");
		System.out.println(this.name + "の攻撃！");
		System.out.println("『青龍偃月刀』を踊るように振り下ろした！！");
		System.out.println(m.name + "に80のダメージ！！");
		System.out.println("");

		m.hp -= 80;
	}
	
	
	
	// 張飛のコンストラクタ
	public SuperCharacter() {
		this.name = "張飛";
		this.hp = 200;
	}
	
}
