import character.Player;
import character.Slime;
import equipment.Equipment;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Equipment e = new Equipment("木の剣",2);
		Player p = new Player("TKG", 100, 5, 5, 5 ,e);
		Slime s = new Slime();

		System.out.println("プレイヤー("+ p.name +")を生成しました！");

		p.status();
		p.rest();
		p.attack();
		
		System.out.println("エネミー(" + s.name + ")を生成しました！");
		
		s.status();
		s.attack();
	}

}
