package br.com.zupacademy.gabrielamartins.transacao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;


@Configuration
@EnableWebSecurity
public class ResourceServerConfig extends WebSecurityConfigurerAdapter {

   @Override
   protected void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests(authorizeRequests -> authorizeRequests
               .antMatchers(HttpMethod.GET, "/cartoes/**").hasAuthority("SCOPE_escopo-transacao")
               .anyRequest().authenticated()).oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
   }
}
