package equipment;

public class EquipmentList {
	private Equipment[] equipments;
	public EquipmentList() {
		this.equipments = new Equipment[] {
			new Equipment("木の剣", 2),
			new Equipment("石の剣", 5),
			new Equipment("鉄の剣", 8)
		};
	}
	public Equipment[] useEquipmentList() {
		return equipments.clone();
	}
}