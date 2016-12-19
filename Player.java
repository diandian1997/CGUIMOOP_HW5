import java.util.ArrayList;

public class Player extends Person{

	// TODO Auto-generated method stub
	private String name;
	private int chips;
	private int bet = 0;
	private ArrayList<Card> oneRoundCard = new ArrayList<Card>();
	private Table tbl;

	public Player(String name, int chips) {
		this.name = name;
		this.chips = chips;
	}

	public String get_name() {
		return name;
	}

	public int make_bet() {
		bet=1;
		if ( chips > bet) {
			bet = 1;
		}
		else
			bet=0;
		return bet;
	}


	public boolean hit_me(Table table) {
		boolean shouldHit = true;
		int TotalValue = getTotalValue();
		if (TotalValue > 15) {
			shouldHit = false;
		}
		return shouldHit;
	}

	/**public int getTotalValue() {
		int TotalValue = 0, NumberOfA = 0;
		for (Card item : oneRoundCard) {
			if (item.getRank() == 1) {
				NumberOfA++;
				TotalValue += item.getRank();
			} else if (item.getRank() > 10) {
				TotalValue += 10;
			} else {
				TotalValue += item.getRank();
			}
		}
		for (int i = 0; i < NumberOfA; i++) {
			if ((TotalValue + 10) <= 21) {
				TotalValue += 10;
			}
		}
		return TotalValue;
	}
**/
	public int get_current_chips() {
		return chips;
	}

	public void increase_chips(int diff) {
		chips += diff;
	}

	public void say_hello() {
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}

}
