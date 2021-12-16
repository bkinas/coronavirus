package com.coronavirus.model;

import java.io.Serializable;

public class Result implements Comparable<Result>, Serializable {
    private final String player;
    private final Level level;
    private final Score score;

    public Result(String player, Level level, Score score) {
        this.player = player;
        this.level = level;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Result result = (Result) o;

        if (player != null ? !player.equals(result.player) : result.player != null) return false;
        if (level != result.level) return false;
        return score != null ? score.equals(result.score) : result.score == null;
    }

    @Override
    public int hashCode() {
        int result = player != null ? player.hashCode() : 0;
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }

    public String getPlayer() {
        return player;
    }

    public Level getLevel() {
        return level;
    }

    public Score getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Result{" +
                "player='" + player + '\'' +
                ", level=" + level +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Result o) {
        return o.getScore().compareTo(score);
    }
}
