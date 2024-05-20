public class App {
    public static void main(String[] args) throws Exception {
        Teams[] team = { new Teams("Arsenal"), new Teams("Manchester City"), new Teams("Manchester United"),
                new Teams("Tottenham Hotspur"), new Teams("Newcastle United"), new Teams("Liverpool"),
                new Teams("Brighton and Hove Albion"), new Teams("Brentford"), new Teams("Fulham"),
                new Teams("Chelsea"), new Teams("Aston Villa"), new Teams("Crystal Palace"),
                new Teams("Wolverhampton Wanderers"), new Teams("Leeds United"), new Teams("Everton"),
                new Teams("Nottingham Forest"), new Teams("Leicester City"), new Teams("West Ham United"),
                new Teams("Bournemouth"), new Teams("Southampton") };
        TeamsManager teamsManager = new TeamsManager();
        for (int i = 0; i < team.length; i++) {
            for (int j = 0; j < team.length; j++) {
                if (i == j)
                    continue;
                teamsManager.match(team[i], team[j]);
            }
        }

        teamsManager.list(team);

    }
}
