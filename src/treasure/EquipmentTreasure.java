package treasure;

import java.util.ArrayList;

import character.Player;
import equipment.Equipment;
import equipment.EquipmentList;
import explore.TextEnter;

public class EquipmentTreasure extends Treasure {
	TextEnter text = new TextEnter();
	Equipment equipment;
	Equipment[] equipmentArray;
	public EquipmentTreasure(EquipmentList list) {
		super("装備宝箱");
		this.equipmentArray = list.useEquipmentList();
	}
	
	public void open(Player player) {
		int randomIndex = (int) (Math.random() * equipmentArray.length);
		
		Equipment receiveEquipment = equipmentArray[randomIndex];
		
		String eqName = receiveEquipment.getName();
		int eqAtk = receiveEquipment.getAtk();
		
		System.out.println(this.name + "を見つけた！");
		System.out.println(eqName + "(ATK:" + eqAtk + ")を手に入れた！");
		text.textEnter("");
		ArrayList<Equipment> equipments = player.getOwnEquipment();
		if(equipments.contains(receiveEquipment)) {
			System.out.println("すでに持っている装備なので、売っぱらった。");
			player.calcGold(receiveEquipment.getPrice() / 2);
			text.textEnter("");
		} else {
			player.gotEquipment(receiveEquipment);
			player.equip();
		}
		return;
	}
}
