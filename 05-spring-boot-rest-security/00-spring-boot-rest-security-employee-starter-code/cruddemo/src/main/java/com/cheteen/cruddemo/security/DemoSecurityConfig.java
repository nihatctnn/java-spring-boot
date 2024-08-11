package com.cheteen.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails nihat = User.builder()
                .username("nihat")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails fatih = User.builder()
                .username("fatih")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails harun = User.builder()
                .username("harun")
                .password("{noop}test123")
                .roles("EMPLOYEE, MANAGER, ADMIN")
                .build();

        return  new InMemoryUserDetailsManager(nihat, fatih, harun);

    }


}