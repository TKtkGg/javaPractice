
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Player p = new Player();
		
		p.name = "TKG";
		p.max_hp = 100;
		System.out.println("プレイヤー("+ p.name +")を生成しました！");
		
		p.status();
		p.rest();
	}

}
