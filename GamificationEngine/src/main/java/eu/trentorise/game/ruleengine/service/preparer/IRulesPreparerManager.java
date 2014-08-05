package eu.trentorise.game.ruleengine.service.preparer;

import eu.trentorise.game.plugin.PluginIdentifier;
import eu.trentorise.game.ruleengine.service.IKnowledgeBuilder;


/**
 *
 * @author Luca Piras
 */
public interface IRulesPreparerManager {
    
    public void prepareRules(IKnowledgeBuilder kbuilder, 
                             PluginIdentifier gamificationApproachId);
}