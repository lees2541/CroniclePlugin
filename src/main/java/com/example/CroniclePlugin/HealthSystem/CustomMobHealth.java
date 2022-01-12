package com.example.CroniclePlugin.HealthSystem;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public enum CustomMobHealth {
    ;

    private String name;
    private double maxHealth, takenDamage, givingDamage,physArmor,magicArmor;

    private EntityType type;


    CustomMobHealth(String name, double maxHealth, double takenDamage, double givingDamage, double physArmor, double magicArmor, EntityType type) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.takenDamage = takenDamage;
        this.givingDamage = givingDamage;
        this.physArmor = physArmor;
        this.magicArmor = magicArmor;
        this.type = type;
    }

    private String name;
    private double maxHealth, takenDamage, givingDamage,physArmor,magicArmor;

    private EntityType type;

}
