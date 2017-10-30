package com.redstrikers.predictions.entity;

public class ResultEntity {

    private HrefEntity goalsHomeTeam;
    private HrefEntity goalsAwayTeam;
    //private HalfTime halfTime;

    public HrefEntity getGoalsHomeTeam() {
        return goalsHomeTeam;
    }

    public void setGoalsHomeTeam(HrefEntity goalsHomeTeam) {
        this.goalsHomeTeam = goalsHomeTeam;
    }

    public HrefEntity getGoalsAwayTeam() {
        return goalsAwayTeam;
    }

    public void setGoalsAwayTeam(HrefEntity goalsAwayTeam) {
        this.goalsAwayTeam = goalsAwayTeam;
    }


//    public HalfTime getHalfTime() {
//        return halfTime;
//    }
//
//    public void setHalfTime(HalfTime halfTime) {
//        this.halfTime = halfTime;
//    }
}
