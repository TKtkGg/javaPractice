package shop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import card.Card;
import card.CardList;
import character.Player;
import equipment.Equipment;
import equipment.EquipmentList;

public class Shop {
	private ArrayList<String> items = new ArrayList<>();
	private Set<String> ownedCards = new HashSet<>();
	private ArrayList<Equipment> ownEquipments = new ArrayList<>();
	private Equipment[] shopEquipments;
	private ArrayList<Card> shopCards = new ArrayList<>();
	public Shop(Player player, EquipmentList el, CardList cl) {
		this.ownedCards = player.getOwnedCards();
		this.ownEquipments = player.getOwnEquipment();
		this.shopEquipments = el.useEquipmentList();
		this.shopCards = cl.getUnHavingCards(player);
		
		for (Card card : this.shopCards) {
			if (!ownedCards.contains(card.getName())) {
				items.add(card.getName());
			}
		}
		for (Equipment equipment : this.shopEquipments) {
			if (!ownEquipments.contains(equipment)) {
				items.add(equipment.getName());
			}
		}
	}
	
	public void enter() {
		System.out.println("ショップに入りました。");
		for(int i = 0; i < items.size(); i++) {
			System.out.println(i+1 + ":" + items.get(i));
		}
	}
}
