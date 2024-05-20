import java.util.Random;

public class TeamsManager {
    public void list(Teams[] team) {
        for (int i = 0; i < team.length; i++) {
            for (int j = i + 1; j < team.length; j++) {
                if (i == j)
                    continue;
                if (team[j].getPoints() > team[i].getPoints()) {
                    Teams temp = team[j];
                    team[j] = team[i];
                    team[i] = temp;
                } else if (team[j].getPoints() == team[i].getPoints()) {
                    if (team[j].getGoalDifference() > team[i].getGoalDifference()) {
                        Teams temp = team[j];
                        team[j] = team[i];
                        team[i] = temp;
                    } else if (team[j].getGoalDifference() == team[i].getGoalDifference()) {
                        if (team[j].getGoalsFor() > team[i].getGoalsFor()) {
                            Teams temp = team[j];
                            team[j] = team[i];
                            team[i] = temp;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < team.length; i++) {
            team[i].setPosition(i + 1);
        }
        for (Teams teams : team) {

            System.out.println(
                    String.valueOf(teams.getPosition() + " " + teams.getClub() + " " +
                            teams.getPlayed() + " "
                            + teams.getWon() + " "
                            + teams.getDrawn() + " " + teams.getLost() + " " + teams.getGoalsFor() + " "
                            + teams.getGoalsAgainst() + " "
                            + teams.getGoalDifference() + " " + teams.getPoints()));
        }

    }

    public void match(Teams team1, Teams team2) {
        Random number = new Random();
        int goal1 = number.nextInt(8);
        int goal2 = number.nextInt(8);

        if (goal1 > goal2) {
            team1.addWon();
            team2.addtLost();
            team1.addPoints(3);
        } else if (goal1 < goal2) {
            team2.addWon();
            team1.addtLost();
            team2.addPoints(3);
        } else {
            team1.addDrawn();
            team2.addDrawn();
            team1.addPoints(1);
            team2.addPoints(1);
        }
        team1.addPlayed();
        team1.addtGoalsFor(goal1);
        team1.addGoalsAgainst(goal2);
        team1.setGoalDifference();
        team2.addPlayed();
        team2.addtGoalsFor(goal2);
        team2.addGoalsAgainst(goal1);
        team2.setGoalDifference();
    }

}
