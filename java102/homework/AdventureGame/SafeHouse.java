
public class SafeHouse extends NormalLoc {

	SafeHouse(Player player) {
		super(player, "Guvenli Ev");
	}

	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("Iyilestiniz...");
		System.out.println("Suan Guvenli Ev adli yerdesiniz.");
		return true;
	}

}
