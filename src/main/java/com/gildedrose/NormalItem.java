package com.gildedrose;

public class NormalItem extends GildedItem {
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void update() {
        adjustSellIn(-1);
        setQuality(-1);
    }
}
