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
		Slime s = new Slime();

		System.out.println("プレイヤー("+ p.getName() +")を生成しました！");

		p.status();
		p.rest();
		p.attack(s);
		
		StatusTreasure st = new StatusTreasure();
		EquipmentTreasure et = new EquipmentTreasure(el);
		
		st.open(p);
		et.open();
		
		p.status();
		
		System.out.println();
		System.out.println("エネミー(" + s.getName() + ")を生成しました！");
		
		s.status();
		//s.attack();
	}

}
