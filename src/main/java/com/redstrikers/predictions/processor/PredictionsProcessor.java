package com.redstrikers.predictions.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class PredictionsProcessor {
    @Autowired
    RestTemplate restTemplate;

    public String getMatchesForTheWeek() {
        return restTemplate.getForEntity("http://api.football-data.org/v1/competitions/445/fixtures?matchday=10",
                String.class).getBody();
    }


}
