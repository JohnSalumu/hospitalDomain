package com.Mukunafreeman.GymMembership.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class GymMembershipSecurity extends WebSecurityConfigurerAdapter {

    private static  final String MEMBER_ROLE = "MEMBER";
    private static  final String ADMIN_ROLE= "ADMIN";

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
        throws Exception{
        auth
                .inMemoryAuthentication()
                .withUser("user")
                .password(encoder().encode("password"))
                .roles(MEMBER_ROLE)
                .and()
                .withUser("admin")
                .password(encoder().encode("admin"))
                .roles(MEMBER_ROLE, ADMIN_ROLE);
    }

    @Override
    protected  void configure(HttpSecurity http) throws Exception {
       http
        .httpBasic()
        .and()
        .authorizeRequests()
        .antMatchers(HttpMethod.POST, "/GymMembership/administrato/**/create/**").hasRole(ADMIN_ROLE)
        .and()
        .csrf().disable()
        .formLogin().disable();
    }

    @Bean
    public PasswordEncoder encoder(){return new BCryptPasswordEncoder();
    }
}
