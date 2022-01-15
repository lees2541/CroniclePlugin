package com.example.CroniclePlugin.CustomClass;

import org.bukkit.entity.EntityType;

public enum CustomMobClass {
    SKELETON(10,10,5), ZOMBIE(20,20,2), SPIDER(15,15,10);

    private int maxReHP, maxCustomHP, armor;

    CustomMobClass(int maxReHP, int maxCustomHP, int armor) {
        this.maxReHP = maxReHP;
        this.maxCustomHP = maxCustomHP;
        this.armor = armor;
    }
}
