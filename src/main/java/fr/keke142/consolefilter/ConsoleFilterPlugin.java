package fr.keke142.consolefilter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class ConsoleFilterPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        ConsoleFilter filter = new ConsoleFilter();

        Logger rootLogger = LogManager.getRootLogger();
        org.apache.logging.log4j.core.Logger rootLoggerAsApache = (org.apache.logging.log4j.core.Logger) rootLogger;

        rootLoggerAsApache.addFilter(filter);
    }
}
