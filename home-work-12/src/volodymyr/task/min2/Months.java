package volodymyr.task.min2;

public enum Months {
	
	January(Seasons.WINTER, 31),
	February(Seasons.WINTER, 28),
	March(Seasons.SPRING, 31),
	April(Seasons.SPRING, 30),
	May(Seasons.SPRING, 31),
	June(Seasons.SUMMER, 30),
	July(Seasons.SUMMER, 31),
	August(Seasons.SUMMER, 31),
	September(Seasons.AUTUMN, 30),
	October(Seasons.AUTUMN, 31),
	November(Seasons.AUTUMN, 30),
	December(Seasons.WINTER, 31);

	Seasons seasons;

	int inDays;

	Months(Seasons seasons, int inDays) {
		this.seasons = seasons;
		this.inDays = inDays;
	}
	
	public int getinDays() {
		return inDays;
	}
	
	public Seasons getSeasons() {
		return seasons;
	}
	
}
