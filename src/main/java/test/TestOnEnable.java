package test;
import org.bukkit.plugin.java.JavaPlugin;

public class TestOnEnable extends JavaPlugin {
	
    @Override
    public void onEnable() {
    	getLogger().info("onEnable has been invoked!");
    	
    }
    @Override
    public void onDisable() {
    	getLogger().info("onEnable has been invoked!");
    }
}
