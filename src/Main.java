import character.Player;
import equipment.Equipment;
import equipment.EquipmentList;
import explore.Move;
import treasure.EquipmentTreasure;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		EquipmentList el = new EquipmentList();
		EquipmentTreasure et = new EquipmentTreasure(el);
		Equipment default_equipment = el.useEquipmentList()[0];
		Player p = new Player("TKG", 1, 100, 5, 5, 5, 0 ,default_equipment);
		Move mv = new Move(p, el, et);

		System.out.println();
		mv.explore(p);
		
	}

}
