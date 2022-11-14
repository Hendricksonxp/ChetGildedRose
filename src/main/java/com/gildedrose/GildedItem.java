package com.gildedrose;

public class GildedItem extends Item {
    public GildedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public boolean isConjured() {
        return false;
    }

}
