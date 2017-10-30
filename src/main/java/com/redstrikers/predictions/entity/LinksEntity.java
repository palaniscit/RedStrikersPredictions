package com.redstrikers.predictions.entity;

public class LinksEntity {

    private HrefEntity self;
    private HrefEntity competition;
    private HrefEntity homeTeam;
    private HrefEntity awayTeam;

    public HrefEntity getSelf() {
        return self;
    }

    public void setSelf(HrefEntity self) {
        this.self = self;
    }

    public HrefEntity getCompetition() {
        return competition;
    }

    public void setCompetition(HrefEntity competition) {
        this.competition = competition;
    }

    public HrefEntity getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HrefEntity homeTeam) {
        this.homeTeam = homeTeam;
    }

    public HrefEntity getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(HrefEntity awayTeam) {
        this.awayTeam = awayTeam;
    }
}
