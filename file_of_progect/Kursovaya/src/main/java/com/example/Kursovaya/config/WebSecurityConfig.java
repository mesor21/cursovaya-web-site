package com.example.Kursovaya.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Autowired
    private DataSource dataSource;
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                    .disable()
                .authorizeRequests()
                    .antMatchers("/admin/**").hasAuthority("Admin")
                    .antMatchers("/cheafEditor/**").hasAuthority("Cheaf Editor")
                    .antMatchers("/departmentEditor/**").hasAuthority("Department Editor")
                    .antMatchers("/autor/**").hasAuthority("Author")
                    .antMatchers("/login","/").permitAll()
                .and()
                    .formLogin()
                        .loginPage("/login")
                        .permitAll();
    }

}