package com.gildedrose;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.Assert.*;


public class GildedRoseTest {
    
    @Test
    public void normalItemAging() {
        Item[] items = new Item[]{new Item("applesauce", 10, 35)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Item applesauce = app.items[0];
        Assertions.assertEquals("applesauce", applesauce.name);
        Assertions.assertEquals(9, applesauce.sellIn);
        Assertions.assertEquals(34, applesauce.quality);
    }

    @Test
    public void normalItemCantGoPast0() {
        Item[] items = new Item[] { new Item("applesauce", 10, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Item applesauce = app.items[0];
        Assertions.assertEquals("applesauce", applesauce.name);
        Assertions.assertEquals(9, applesauce.sellIn);
        Assertions.assertEquals(0, applesauce.quality);
    }
    @Disabled
    @Test
    public void normalItemCantGoPast50() {
        Item[] items = new Item[] { new Item("applesauce", 10, 75) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Item applesauce = app.items[0];
        Assertions.assertEquals("applesauce", applesauce.name);
        Assertions.assertEquals(9, applesauce.sellIn);
        Assertions.assertEquals(50, applesauce.quality);
    }

    @Test
    public void normalItemAgingPastSellIn() {
        Item[] items = new Item[] { new Item("applesauce", 1, 35) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Item applesauce = app.items[0];
        Assertions.assertEquals(0, applesauce.sellIn, "first day");
        Assertions.assertEquals(34, applesauce.quality, "first day");

        app.updateQuality();
        Assertions.assertEquals(-1, applesauce.sellIn, "second day");
        Assertions.assertEquals(32, applesauce.quality, "second day");
    }

    @Test
    public void legendaryItemAging() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 10, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Item sulfuras = app.items[0];
        Assertions.assertEquals(10, sulfuras.sellIn);
        Assertions.assertEquals(80, sulfuras.quality);
    }

    @Test
    public void agedBrieAging(){
        Item[] items = new Item[]{new Item("Aged Brie", 10, 35)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Item brie = app.items[0];
        Assertions.assertEquals(9, brie.sellIn);
        Assertions.assertEquals(36, brie.quality);
    }

    @Test
    public void agedBrieAgingCantGoPast50(){
        Item[] items = new Item[]{new Item("Aged Brie", 10, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Item brie = app.items[0];
        Assertions.assertEquals(9, brie.sellIn);
        Assertions.assertEquals(50, brie.quality);
    }

    @Test
    public void agedBrieAgingIncreasesBy2PastSellIn(){
        Item[] items = new Item[]{new Item("Aged Brie", 0, 35)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Item brie = app.items[0];
        Assertions.assertEquals(-1, brie.sellIn);
        Assertions.assertEquals(37, brie.quality);
    }

    @Test
    public void backstagePassAging(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 20, 35)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Item pass = app.items[0];
        Assertions.assertEquals(19, pass.sellIn);
        Assertions.assertEquals(36, pass.quality);
    }
    @Test
    public void backstagePassAgingBelowSellIn10(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 35)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Item pass = app.items[0];
        Assertions.assertEquals(9, pass.sellIn);
        Assertions.assertEquals(37, pass.quality);
    }

    @Disabled
    @Test
    public void backstagePassAgingBelowSellIn5(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 6, 35)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Item pass = app.items[0];
        Assertions.assertEquals(5, pass.sellIn);
        Assertions.assertEquals(38, pass.quality);
    }

    @Test
    public void backstagePassAgingPastSellIn(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 0, 35)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Item pass = app.items[0];
        Assertions.assertEquals(-1, pass.sellIn);
        Assertions.assertEquals(0, pass.quality);
    }

    @Disabled
    @Test
    public void backstagePassAgingPast50(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 20, 55)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Item pass = app.items[0];
        Assertions.assertEquals(19, pass.sellIn);
        Assertions.assertEquals(50, pass.quality);
    }

}
