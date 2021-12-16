package com.coronavirus.model;

public class Score implements Comparable<Score>{
    private final int days;
    private final int infectedPeople;
    private final int allPeople;

    public Score(int days, int infectedPeople, int allPeople) {
        this.days = days;
        this.infectedPeople = infectedPeople;
        this.allPeople = allPeople;
    }

    public int getDays() {
        return days;
    }

    public int getInfectedPeople() {
        return infectedPeople;
    }

    public int getAllPeople() {
        return allPeople;
    }

    @Override
    public String toString() {
        return "Score{" +
                "days=" + days +
                ", infectedPeople=" + infectedPeople +
                ", allPeople=" + allPeople +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Score score = (Score) o;

        if (days != score.days) return false;
        if (infectedPeople != score.infectedPeople) return false;
        return allPeople == score.allPeople;
    }

    @Override
    public int hashCode() {
        int result = days;
        result = 31 * result + infectedPeople;
        result = 31 * result + allPeople;
        return result;
    }

    @Override
    public int compareTo(Score o) {
        int p1 = percentage(infectedPeople, allPeople);
        int p2 = percentage(o.getInfectedPeople(), o.getAllPeople());
        int diff = p1 - p2;
        if (diff == 0) {
            diff = (o.getDays()-days) * (-1);
        }
        return diff;
    }

    private int percentage(int n, int all) {
        return (n / all) * 100;
    }
}
