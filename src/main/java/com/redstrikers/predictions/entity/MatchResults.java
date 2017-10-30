package com.redstrikers.predictions.entity;

import java.util.List;

public class MatchResults {
    private LinksEntity links;
    private Integer count;
    private List<FixturesEntity> fixtures = null;

    public LinksEntity getLinks() {
        return links;
    }

    public void setLinks(LinksEntity links) {
        this.links = links;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<FixturesEntity> getFixtures() {
        return fixtures;
    }

    public void setFixtures(List<FixturesEntity> fixtures) {
        this.fixtures = fixtures;
    }
}
