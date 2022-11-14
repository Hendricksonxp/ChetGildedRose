package com.gildedrose;

public class ConjuredItem extends GildedItem {
    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public boolean isConjured() {
        return true;
    }
}
