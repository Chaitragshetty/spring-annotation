package com.stackroute.config;
import  com.stackroute.beans.Movie;
import  com.stackroute.beans.Actor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

    public class Main {
        public static void main(String[] args) {
            AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

            annotationConfigApplicationContext.register(AppConfig.class);
            annotationConfigApplicationContext.refresh();
            Movie movie=(Movie)annotationConfigApplicationContext.getBean("movie");
            Actor actor=(Actor)annotationConfigApplicationContext.getBean("actor");
            System.out.println(movie);
            System.out.println(actor);




        }
    }


