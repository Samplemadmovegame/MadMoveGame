package com.example.madmovegame.home.model;

public class AllSports {

    private String team1, team2, leagueName;
    private long timeleft;

    public AllSports() {

    }



    public AllSports(String team1, String team2, String leagueName, long timeleft) {
        this.team1 = team1;
        this.team2 = team2;
        this.leagueName = leagueName;
        this.timeleft = timeleft;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public long getTimeleft() {
        return timeleft;
    }

    public void setTimeleft(long timeleft) {
        this.timeleft = timeleft;
    }
}
