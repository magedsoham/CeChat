package com.logica_itech.seshat.model;

public class Character {

    char ch;
    /*
     * Syllabus folder will contain CharactersFolder for data for this class
	 */

    private String SpeechesFilePath[] = null;  // movements if arabic
    private Direction[][] FV = null;

    public Character(char ch) {
        super();
        this.ch = ch;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public String[] getSpeechFilePath() {
        return SpeechesFilePath;
    }

    public void setSpeechesFilePath(String[] speechesFilePath) {
        SpeechesFilePath = speechesFilePath;
    }

    public Direction[][] getFV() {
        return FV;
    }

    public void setFV(Direction[][] fv) {
        FV = fv;
    }

    @Override
    public String toString() {
        return "char: " + this.ch + "fv: " + this.FV.toString() + "SpeechFilePath: " + this.SpeechesFilePath;
    }
}
