package winlyps.noDaylightCycle

import org.bukkit.plugin.java.JavaPlugin

class NoDaylightCycle : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doDaylightCycle", "false")
        }
        logger.info("NoDaylightCycle plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoDaylightCycle plugin has been disabled.")
    }
}