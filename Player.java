public class Player {
	String userName;
	static int health;
	int mana;
	String playerType;
	
	
	Player(String userName, int health, int mana, String playerType){
		this.userName = userName;
		this.health = health;
		this.mana = mana;
		this.playerType = playerType;
	}
	
	
	public String getUserName() {
		return userName;
	}
	
	
	public String setUserName(String name) {
		userName = name;
		return userName;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int setHealth(int pool) {
		health = pool;
		return health;
	}
	
	public int getMana() {
		return mana;
	}
	
	public int setMana(int pool) {
		mana = pool;
		return mana;
	}
	
	public String getPlayerType() {
		return playerType;
	}
	
	
	public String setPlayerType(String type) {
		playerType = type;
		return playerType;
	}
	
	public void clash() {
		System.out.println("You swing your sword dealing 5 damage! ");
		
		if (playerType == "Human") {
			Enemy.health -= 5;
		}
		else {
			Player.health -= 5;
		}
	}
	
	public static void main(String[] args) {
		Player Wizard = new Player("Miles", 100, 100, "Human");
		Enemy Ninja = new Enemy("Ninja", 100, 100, "Bot");
		
		Wizard.clash();
		Wizard.clash();
		System.out.println(Ninja.getHealth());

	}
	
}
	
class Enemy extends Player {
		String enemyType;

		Enemy(String userName, int health, int mana, String enemyType) {
			super(userName, health, mana, enemyType);
			this.userName = userName;
			this.health = health;
			this.mana = mana;
			this.enemyType = enemyType;

		}
	
}

	
