import character.Enemy;
import character.Player;
import character.Slime;
import equipment.Equipment;
import equipment.EquipmentList;
import explore.Move;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Equipment e = new Equipment("木の剣",2);
		EquipmentList el = new EquipmentList();
		Player p = new Player("TKG", 100, 5, 5, 5 ,e);
		Enemy s = new Slime();
		Move mv = new Move(p, s);

		System.out.println();
		mv.explore(p);
		
	}

}
