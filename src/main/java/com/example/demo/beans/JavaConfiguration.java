package com.example.demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {
    @Bean("music")
    public MusicAction getMusicAction() {
        return new MusicAction();
    }
    @Bean("film")
    public FilmAction getFilmAction(){
        return new FilmAction();
    }
    @Bean("game")
    public GameAction getGameAction(){
        return new GameAction();
    }
}
