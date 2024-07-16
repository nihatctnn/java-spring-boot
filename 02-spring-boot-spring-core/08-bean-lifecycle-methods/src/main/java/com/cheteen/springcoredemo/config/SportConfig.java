package com.cheteen.springcoredemo.config;

import com.cheteen.springcoredemo.common.ICoach;
import com.cheteen.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public ICoach swimCoach(){
        return new SwimCoach();
    }

}