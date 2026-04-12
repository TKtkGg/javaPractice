package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import explore.TextEnter;

public class CardList {
	private ArrayList<Card> cards;
	Scanner sc = new Scanner(System.in);

	TextEnter text = new TextEnter();
	
	public CardList() {
		this.cards = new ArrayList<>();
		this.cards.add(new EquipmentMaster());
		this.cards.add(new SlimeKiller());
	}
	
	public Object useCardList() {
		return cards.clone();
	}
	
	public void showCards() {
		Collections.shuffle(cards);
		System.out.println("カードを選べ");
		for(int i = 0; i < cards.size(); i++) {
			System.out.println((i + 1) + " : " + cards.get(i).getName());
			System.out.println("    " + cards.get(i).getText());
			if(i == 2) {
				break;
			}
		}
		int choiceNum = sc.nextInt() - 1;
		cards.get(choiceNum).isChosen();
		System.out.println(cards.get(choiceNum).getName() + "を手に入れた！");
		text.textEnter("");
	}
}
