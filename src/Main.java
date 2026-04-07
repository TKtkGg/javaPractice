import character.Enemy;
import character.Player;
import character.Slime;
import equipment.EquipmentList;
import explore.Move;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		EquipmentList el = new EquipmentList();
		Player p = new Player("TKG", 100, 5, 5, 5, el.useEquipmentList()[0]);
		Enemy s = new Slime();
		Move mv = new Move(p, s, el);

		System.out.println();
		mv.explore(p);
		
	}

}
