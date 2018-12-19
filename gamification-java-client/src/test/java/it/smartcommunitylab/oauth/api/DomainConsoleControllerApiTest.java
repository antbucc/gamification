/**
 * Copyright 2018-2019 SmartCommunity Lab(FBK-ICT).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

/*
 * Gamification Engine API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package it.smartcommunitylab.oauth.api;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import it.smartcommunitylab.ApiException;
import it.smartcommunitylab.model.BadgeCollectionConcept;
import it.smartcommunitylab.model.GameDTO;
import it.smartcommunitylab.model.GeneralClassificationDTO;
import it.smartcommunitylab.model.PlayerStateDTO;
import it.smartcommunitylab.model.PointConcept;
import it.smartcommunitylab.model.RuleDTO;
import it.smartcommunitylab.model.TeamDTO;

/**
 * API tests for DomainConsoleControllerApi
 */
@Ignore
public class DomainConsoleControllerApiTest {

    private final DomainConsoleControllerApi api = new DomainConsoleControllerApi();

    
    /**
     * addBadge
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addBadgeUsingPOST1Test() throws ApiException {
        String domain = null;
        String gameId = null;
        BadgeCollectionConcept badge = null;
        api.addBadgeUsingPOST1(domain, gameId, badge);

        // TODO: test validations
    }
    
    /**
     * addClassificationTask
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addClassificationTaskUsingPOST1Test() throws ApiException {
        String domain = null;
        String gameId = null;
        GeneralClassificationDTO task = null;
        GeneralClassificationDTO response = api.addClassificationTaskUsingPOST1(domain, gameId, task);

        // TODO: test validations
    }
    
    /**
     * addPoint
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPointUsingPOSTTest() throws ApiException {
        String domain = null;
        String gameId = null;
        PointConcept point = null;
        api.addPointUsingPOST(domain, gameId, point);

        // TODO: test validations
    }
    
    /**
     * addRule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRuleUsingPOSTTest() throws ApiException {
        String domain = null;
        String gameId = null;
        RuleDTO rule = null;
        RuleDTO response = api.addRuleUsingPOST(domain, gameId, rule);

        // TODO: test validations
    }
    
    /**
     * createPlayer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPlayerUsingPOSTTest() throws ApiException {
        String domain = null;
        String gameId = null;
        PlayerStateDTO player = null;
        api.createPlayerUsingPOST(domain, gameId, player);

        // TODO: test validations
    }
    
    /**
     * createTeam
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTeamUsingPOSTTest() throws ApiException {
        String domain = null;
        String gameId = null;
        TeamDTO team = null;
        api.createTeamUsingPOST(domain, gameId, team);

        // TODO: test validations
    }
    
    /**
     * deleteClassificationTask
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClassificationTaskUsingPOSTTest() throws ApiException {
        String domain = null;
        String gameId = null;
        GeneralClassificationDTO task = null;
        api.deleteClassificationTaskUsingPOST(domain, gameId, task);

        // TODO: test validations
    }
    
    /**
     * deleteDbRule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbRuleUsingDELETETest() throws ApiException {
        String domain = null;
        String gameId = null;
        String ruleUrl = null;
        Boolean response = api.deleteDbRuleUsingDELETE(domain, gameId, ruleUrl);

        // TODO: test validations
    }
    
    /**
     * deleteGame
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGameUsingDELETETest() throws ApiException {
        String domain = null;
        String gameId = null;
        api.deleteGameUsingDELETE(domain, gameId);

        // TODO: test validations
    }
    
    /**
     * deletePlayer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePlayerUsingDELETETest() throws ApiException {
        String domain = null;
        String gameId = null;
        String playerId = null;
        api.deletePlayerUsingDELETE(domain, gameId, playerId);

        // TODO: test validations
    }
    
    /**
     * deleteTeam
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTeamUsingDELETETest() throws ApiException {
        String domain = null;
        String gameId = null;
        String teamId = null;
        api.deleteTeamUsingDELETE(domain, gameId, teamId);

        // TODO: test validations
    }
    
    /**
     * editClassificationTask
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editClassificationTaskUsingPUT1Test() throws ApiException {
        String domain = null;
        String gameId = null;
        GeneralClassificationDTO task = null;
        api.editClassificationTaskUsingPUT1(domain, gameId, task);

        // TODO: test validations
    }
    
    /**
     * readBadgeCollections
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readBadgeCollectionsUsingGET1Test() throws ApiException {
        String domain = null;
        String gameId = null;
        List<BadgeCollectionConcept> response = api.readBadgeCollectionsUsingGET1(domain, gameId);

        // TODO: test validations
    }
    
    /**
     * readDbRule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readDbRuleUsingGETTest() throws ApiException {
        String domain = null;
        String gameId = null;
        String ruleUrl = null;
        RuleDTO response = api.readDbRuleUsingGET(domain, gameId, ruleUrl);

        // TODO: test validations
    }
    
    /**
     * readGame
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readGameUsingGETTest() throws ApiException {
        String domain = null;
        String gameId = null;
        GameDTO response = api.readGameUsingGET(domain, gameId);

        // TODO: test validations
    }
    
    /**
     * readGames
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readGamesUsingGETTest() throws ApiException {
        String domain = null;
        List<GameDTO> response = api.readGamesUsingGET(domain);

        // TODO: test validations
    }
    
    /**
     * readPoints
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readPointsUsingGETTest() throws ApiException {
        String domain = null;
        String gameId = null;
        List<PointConcept> response = api.readPointsUsingGET(domain, gameId);

        // TODO: test validations
    }
    
    /**
     * readTeamsByMember
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readTeamsByMemberUsingGETTest() throws ApiException {
        String domain = null;
        String gameId = null;
        String playerId = null;
        List<TeamDTO> response = api.readTeamsByMemberUsingGET(domain, gameId, playerId);

        // TODO: test validations
    }
    
    /**
     * saveGame
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveGameUsingPOST1Test() throws ApiException {
        String domain = null;
        GameDTO game = null;
        GameDTO response = api.saveGameUsingPOST1(domain, game);

        // TODO: test validations
    }
    
    /**
     * updateCustomData
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomDataUsingPUTTest() throws ApiException {
        String domain = null;
        String gameId = null;
        String playerId = null;
        Object customData = null;
        PlayerStateDTO response = api.updateCustomDataUsingPUT(domain, gameId, playerId, customData);

        // TODO: test validations
    }
    
    /**
     * updateTeamMembers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTeamMembersUsingPOSTTest() throws ApiException {
        String domain = null;
        String gameId = null;
        String teamId = null;
        List<String> members = null;
        api.updateTeamMembersUsingPOST(domain, gameId, teamId, members);

        // TODO: test validations
    }
    
    /**
     * validateRule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateRuleUsingPOSTTest() throws ApiException {
        String domain = null;
        String ruleContent = null;
        List<String> response = api.validateRuleUsingPOST(domain, ruleContent);

        // TODO: test validations
    }
    
}
