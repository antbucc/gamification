/**
 * Copyright 2015 Fondazione Bruno Kessler - Trento RISE
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package eu.trentorise.game.config;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import eu.trentorise.game.core.LogHub;
import eu.trentorise.game.model.AuthUser;
import eu.trentorise.game.sec.UsersProvider;

@Configuration
@EnableWebSecurity
@Profile({"sec"})
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(SecurityConfig.class);

    @Autowired
    private UsersProvider usersProvider;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

    	for (AuthUser user : usersProvider.getUsers()) {
            auth.inMemoryAuthentication().withUser(user.getUsername()).password("{noop}"+user.getPassword())
                    .roles(user.getRole());
            LogHub.info(null, logger, "Loaded auth user {}", user.getUsername());
        }
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // application never creates an http session
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        http.authorizeRequests()
                .antMatchers("/gengine/**", "/console/**", "/model/**", "/data/**", "/exec/**",
                        "/notification/**", "/userProfile/**")
                .access("hasRole('ROLE_ADMIN')").and().httpBasic();

//        http.authorizeRequests().antMatchers("/api/**").anonymous();


        // disable csrf permits POST http call to DomainConsoleController
        // without using csrf token
        http.csrf().disable();

    }
}
