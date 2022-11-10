package com.example.gojek_cloneapp.ui.home;

public class MainModel {
    Integer langLogo;
    String langName;
    String langDesc;
    String langRating;

    public MainModel(Integer langLogo, String langName, String langDesc, String langRating) {
        this.langLogo = langLogo;
        this.langName = langName;
        this.langDesc = langDesc;
        this.langRating = langRating;
    }

    public Integer getLangLogo() {
        return langLogo;
    }

    public void setLangLogo(Integer langLogo) {
        this.langLogo = langLogo;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public String getLangDesc() {
        return langDesc;
    }

    public void setLangDesc(String langDesc) {
        this.langDesc = langDesc;
    }

    public String getLangRating() {
        return langRating;
    }

    public void setLangRating(String langRating) {
        this.langRating = langRating;
    }
}
