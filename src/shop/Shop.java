package shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import card.Card;
import card.CardList;
import character.Player;
import equipment.Equipment;
import equipment.EquipmentList;

public class Shop {
	private Scanner sc = new Scanner(System.in);
	
	private Map<String, String> items = new HashMap<>();
	private Set<String> ownedCards = new HashSet<>();
	private ArrayList<Equipment> ownEquipments = new ArrayList<>();
	private ArrayList<Card> shopCards = new ArrayList<>();
	
	private Equipment[] shopEquipments;
	
	public Map<String, String> getItems(Player player, EquipmentList el, CardList cl) {
		items.clear();
		this.ownedCards = player.getOwnedCards();
		this.ownEquipments = player.getOwnEquipment();
		this.shopEquipments = el.useEquipmentList();
		this.shopCards = cl.getUnHavingCards(player);
		
		for (Card card : this.shopCards) {
			if (!ownedCards.contains(card.getName())) {
				items.put(card.getName(), "CARD");
			}
		}
		for (Equipment equipment : this.shopEquipments) {
			if (!ownEquipments.contains(equipment)) {
				items.put(equipment.getName(), "EQUIPMENT");
			}
		}
		return items;
	}
	
	public void enter(Player player, EquipmentList el, CardList cl) {
		this.items = getItems(player, el, cl);
		
		ArrayList<Integer> itemNumber = new ArrayList<>();
		for(int i = 0; i < items.size(); i++) {
			itemNumber.add(i);
		}
		Collections.shuffle(itemNumber);

		System.out.println("ショップに入りました。");
		while(items.size() > 0) {
			System.out.println("何を得る？");
			for(int i = 0; i < items.size(); i++) {
				System.out.println(i+1 + ":" + items.keySet().toArray()[itemNumber.get(i)] + " (" + items.get(items.keySet().toArray()[itemNumber.get(i)]) + ")");
			}
			System.out.println("0:ショップを出る");
			
			int choiceNum = sc.nextInt() - 1;
			if(choiceNum == -1) {
				System.out.println("ショップを出ました。");
				System.out.println();
				break;
			}
			
			String chosenItem = (String) items.keySet().toArray()[choiceNum];
			
			String itemType = items.get(chosenItem);
			
			if(itemType.equals("CARD")) {
				player.obtainCard(chosenItem);
			} else if(itemType.equals("EQUIPMENT")) {
				player.gotEquipment(el.getEquipmentByName(chosenItem));
			}
			
			System.out.println(chosenItem + "を手に入れた！");
			System.out.println();
		}
		
	}
}
