package eu.trentorise.game.ruleengine.container;

import eu.trentorise.game.plugin.model.Plugin;

/**
 *
 * @author Luca Piras
 */
public interface IPluginOperatorContainer {
    
    public Plugin getGamificationPlugin();
    public void setGamificationPlugin(Plugin gamificationPlugin);
}