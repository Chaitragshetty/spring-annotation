package com.stackroute.config;
import com.stackroute.beans.Actor;
import com.stackroute.beans.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class BeanConfig {
        @Bean(name="movie")
        public Movie getMovieBean()
        {
            return new Movie("conjuring","Tony Derosa",new Actor("Wilson",40,"Male"));
        }

        @Bean(name="actor")
        public Actor getBeanActor()
        {
            return new Actor("willson",50,"Male");
        }
    }

