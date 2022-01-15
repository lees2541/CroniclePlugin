package com.example.CroniclePlugin;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Mob;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import java.util.logging.Logger;
import com.example.CroniclePlugin.Utils;

public class CroniclePlugin extends JavaPlugin{



    private static Logger logger;

    @Override
    public void onEnable() {    //플러그인 활성화시 실행
        logger = getLogger();
        Utils.log("플러그인 갸꿀우우울");
        logger.info("zl존 개쩌는 플러그인이 활성화되었습니다!");  //서버의 로그에 출력
    }
    @Override
    public void onDisable() {   //플러그인 비활성화시 실행
        Utils.log("플러그인 엉엉");
        getLogger().info("zl존 개쩌는 플러그인이 비활성화되었습니다."); //서버의 로그에 출력
    }

    public static Logger getPluginLogger() {
        return logger;
    }


    @EventHandler
    public void givingDamageEvent(EntityDamageByEntityEvent event){
        Entity damager = event.getDamager();
        Entity damagee = event.getEntity();

    }


}
