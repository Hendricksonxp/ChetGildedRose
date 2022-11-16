package com.gildedrose;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class GildedItem extends Item {
    public GildedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    void setQuality(int adjustment){
        if (sellIn < 0){
            adjustment = adjustment * 2;
        }
        quality = (max(0, min(50,quality += adjustment)));
    }

    void adjustSellIn(int adjustment){
        sellIn = sellIn += adjustment;
    }
    public boolean isConjured() {
        return false;
    }

}
