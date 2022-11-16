package com.gildedrose;

public class LegendaryItem extends GildedItem{
    public LegendaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, 80);
    }
    public void update(){
        adjustSellIn(0);
    }
}
