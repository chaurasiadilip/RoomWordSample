package com.samayteck.roomwordsample.model;

@Entity(tableName = "word_table")
public class word {

    private String mWord;

    public word(String mWord) {
        this.mWord = mWord;
    }

    public String getmWord() {
        return mWord;
    }
}
