package testGame;

// すべての戦闘キャラの抽象クラスです
public abstract class Fighter {

	String name;
	int hp;

	public abstract void attack(Fighter m);
	public abstract void run();

}
