public class Teams {

    private int position;
    private String club;
    private int played;
    private int won;
    private int drawn;
    private int lost;
    private int goalsFor;
    private int goalsAgainst;
    private int goalDifference;
    private int points;

    public Teams(String club) {
        this.position = 0;
        this.club = club;
        this.played = 0;
        this.won = 0;
        this.drawn = 0;
        this.lost = 0;
        this.goalsFor = 0;
        this.goalsAgainst = 0;
        this.goalDifference = 0;
    }


    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getClub() {
        return this.club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getPlayed() {
        return this.played;
    }

    public void addPlayed() {
        this.played++;
    }

    public int getWon() {
        return this.won;
    }

    public void addWon() {
        this.won++;
    }

    public int getDrawn() {
        return this.drawn;
    }

    public void addDrawn() {
        this.drawn++;
    }

    public int getLost() {
        return this.lost;
    }

    public void addtLost() {
        this.lost++;
    }

    public int getGoalsFor() {
        return this.goalsFor;
    }

    public void addtGoalsFor(int goalsFor) {
        this.goalsFor += goalsFor;
    }

    public int getGoalsAgainst() {
        return this.goalsAgainst;
    }

    public void addGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst += goalsAgainst;
    }

    public int getGoalDifference() {
        return this.goalDifference;
    }

    public void setGoalDifference() {
        this.goalDifference = this.goalsFor - this.goalsAgainst;
    }

    public int getPoints() {
        return this.points;
    }

    public void addPoints(int point) {
        this.points += point;
    }
}
