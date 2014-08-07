package eu.trentorise.game.plugin.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import eu.trentorise.game.plugin.model.CustomizedPlugin;

/**
 *
 * @author Luca Piras
 */
//Necessary for the getCustomizedPluginListService Test
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomizedPluginResponse {
    
    protected CustomizedPlugin customizedPlugin;

    public CustomizedPlugin getCustomizedPlugin() {
        return customizedPlugin;
    }

    public void setCustomizedPlugin(CustomizedPlugin customizedPlugin) {
        this.customizedPlugin = customizedPlugin;
    }

    @Override
    public String toString() {
        return "CustomizedPluginResponse{" + "customizedPlugin=" + customizedPlugin + '}';
    }
}