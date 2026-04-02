import character.Enemy;
import character.Player;
import character.Slime;
import equipment.Equipment;
import equipment.EquipmentList;
import treasure.EquipmentTreasure;
import treasure.StatusTreasure;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Equipment e = new Equipment("木の剣",2);
		EquipmentList el = new EquipmentList();
		Player p = new Player("TKG", 100, 5, 5, 5 ,e);
		Enemy s = new Slime();
		StatusTreasure st = new StatusTreasure();
		EquipmentTreasure et = new EquipmentTreasure(el);

		System.out.println("プレイヤー("+ p.getName() +")");

		p.status();
		p.rest();
		
		st.open(p);
		et.open();
		
		p.status();
		
		System.out.println();
		System.out.println("敵("+ s.getName() +")");
		s.status();
		
		p.attack(s);
		s.attack(p);
		
		p.status();
		s.status();
			
	}

}
