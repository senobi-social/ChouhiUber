package testGame;

// 伏兵のクラスです
public class Soldier extends Fighter {

	public void attack(Fighter m) {

		System.out.println("");
		System.out.println("伏兵は思いっきり槍を振った");

		int probability = new java.util.Random().nextInt(3);

		switch(probability) {

		case 0:
			System.out.println("太ももに刺さった！");
			System.out.println("20のダメージ！");
			System.out.println("");

			m.hp -= 20;

			break;
		default :
			System.out.println("槍先は大きく宙を舞った！");
			System.out.println("");
			
			break;
		}
	}


	public void run() {
		System.out.println("");
		System.out.println("こ、こいつはバケモンだー！！");
		System.out.println(this.name + "は背中を見せて逃げた!!");
		System.out.println("");
	}


	// 伏兵のコンストラクタ
	public Soldier() {
		this.name = "伏兵";
		this.hp = 50;
	}


}
