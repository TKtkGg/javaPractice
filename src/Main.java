import character.Player;
import character.enemy.Enemy;
import character.enemy.Slime;
import equipment.Equipment;
import equipment.EquipmentList;
import explore.Move;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		EquipmentList el = new EquipmentList();
		Equipment default_equipment = el.useEquipmentList()[0];
		Player p = new Player("TKG", 1, 100, 5, 5, 5 ,default_equipment);
		Enemy s = new Slime();
		Move mv = new Move(p);

		System.out.println();
		mv.explore(p);
		
	}

}
