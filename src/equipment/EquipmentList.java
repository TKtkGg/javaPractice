package equipment;

public class EquipmentList {
	static Equipment woodenSword = new Equipment("木の剣", 2);
	static Equipment stoneSword = new Equipment("石の剣", 5);
	static Equipment ironSword = new Equipment("鉄の剣", 8);
	public static Equipment[] useEquipmentList() {
		Equipment[] EquipmentList = {woodenSword, stoneSword, ironSword};
		
		return EquipmentList;
	}
}
