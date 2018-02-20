package com.logica_itech.seshat;

/**
 * Created by seif on 2/20/18.
 */

public class ScoreTracker {
    int phase, unit, lesson, word;

    public ScoreTracker(int phase, int unit, int lesson, int word) {
        this.phase = phase;
        this.unit = unit;
        this.lesson = lesson;
        this.word = word;
    }

    public int getPhase() {
        return phase;
    }

    public int getUnit() {
        return unit;
    }

    public int getLesson() {
        return lesson;
    }

    public int getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "ScoreTracker{" +
                "phase=" + phase +
                ", unit=" + unit +
                ", lesson=" + lesson +
                ", word=" + word +
                '}';
    }
}
