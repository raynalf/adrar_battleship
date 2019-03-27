package adrar.battleship;

public class Main {

	public static void main(String[] args) {
		PlayerStrikesHistory playerStrikesHistory = new PlayerStrikesHistory();
		Square square = new Square();
		square.setX('D');
		square.setY(4);
		System.out.println(square.getStatus());
		System.out.println(playerStrikesHistory.checkIfStrikeExists(square));
		playerStrikesHistory.addStrike(square);
		System.out.println(playerStrikesHistory.getStrikesHistory());
		playerStrikesHistory.addStrike(square);
		System.out.println(playerStrikesHistory.getStrikesHistory());

		// System.out.println(playerStrikesHistory.checkIfStrikeExists(square));
		// playerStrikesHistory.addStrike(square);
	}

}
