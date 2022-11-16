package com.gildedrose;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class ConjuredItem extends GildedItem {
    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void update() {
        sellIn--;
        int newQuality = quality -=2;
        setQuality(newQuality);
    }

    private void setQuality(int newQuality){
        quality = (max(0, min(50,newQuality)));
    }

    public boolean isConjured() {
        return true;
    }
}
