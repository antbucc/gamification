package eu.trentorise.game.plugin.point.service;

import eu.trentorise.game.plugin.container.CustomizedPluginContainer;
import eu.trentorise.game.plugin.point.model.PointPlugin;
import eu.trentorise.game.plugin.response.SettingCustomizedPluginResponse;
import eu.trentorise.game.plugin.service.ICustomizedPluginManager;
import eu.trentorise.game.plugin.service.MockPluginManager;
import eu.trentorise.game.response.MockResponder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("mockPointPluginManager")
public class MockPointPluginManager extends MockResponder implements ICustomizedPluginManager<PointPlugin> {

    @Override
    public SettingCustomizedPluginResponse setCustomizedGamificationPlugin(CustomizedPluginContainer<PointPlugin> container) {
        //TODO: create new customizedGamificationPlugin, obtain an id, then
        //create a customizedPluginGame using the new 
        //customizedGamificationPlugin with its id and the provided game
        PointPlugin plugin = manager.createGreenLeavesPointPlugin();
        
        SettingCustomizedPluginResponse response = new SettingCustomizedPluginResponse();
        response.setCustomizedPlugin(plugin);
        
        return ((SettingCustomizedPluginResponse) this.buildPositiveResponse(response));
    }
    
    @Qualifier("mockPluginManager")
    @Autowired
    protected MockPluginManager manager;
}