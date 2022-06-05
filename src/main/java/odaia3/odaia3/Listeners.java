package odaia3.odaia3;

import io.papermc.paper.event.player.PlayerDeepSleepEvent;
import io.papermc.paper.event.player.PlayerTradeEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Listeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        e.setJoinMessage(p.getName() + "がサーバーに参加しました");
    }

    @EventHandler
    public void onSleep(PlayerDeepSleepEvent e) {
        Player p = e.getPlayer();

        if(p.isSleeping());
            Bukkit.broadcastMessage(p.getName() + "が深い眠りにつきました");
    }
    @EventHandler
    public void changeGM(PlayerGameModeChangeEvent e) {
        Player p = e.getPlayer();

        Bukkit.broadcastMessage(p.getName() + "がゲームモードを変更しました | 現在: " + p.getGameMode());
    }
    @EventHandler
    public void tradePlayer(PlayerTradeEvent e) {
        Player p = e.getPlayer();

        Bukkit.broadcastMessage(p.getName() + "が取引を行っています。");

    }
}

