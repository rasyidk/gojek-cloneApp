package com.example.gojek_cloneapp.ui.promo;

public class promoModel {

    Integer langLogo;
    String langName;
    String langDistance;
    String langRating;
    String langDiskon;

    public promoModel(Integer langLogo, String langName, String langDistance, String langRating, String langDiskon) {
        this.langLogo = langLogo;
        this.langName = langName;
        this.langDistance = langDistance;
        this.langRating = langRating;
        this.langDiskon = langDiskon;
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

    public String getLangDistance() {
        return langDistance;
    }

    public void setLangDistance(String langDistance) {
        this.langDistance = langDistance;
    }

    public String getLangRating() {
        return langRating;
    }

    public void setLangRating(String langRating) {
        this.langRating = langRating;
    }

    public String getLangDiskon() {
        return langDiskon;
    }

    public void setLangDiskon(String langDiskon) {
        this.langDiskon = langDiskon;
    }
}
