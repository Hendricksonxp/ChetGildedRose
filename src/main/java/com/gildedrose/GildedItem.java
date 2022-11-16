package com.gildedrose;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class GildedItem extends Item {
    public GildedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    void setQuality(int newQuality){
        quality = (max(0, min(50,newQuality)));
    }
    public boolean isConjured() {
        return false;
    }

}
