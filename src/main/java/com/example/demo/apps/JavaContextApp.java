package com.example.demo.apps;

import com.example.demo.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class JavaContextApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие:\n1 - Включить музыку\n2 - Включить фильм\n3 - Включить игру");
        int actionType = scanner.nextInt();

        if (actionType == 1) {
            MusicAction musicAction = context.getBean("music", MusicAction.class);
            musicAction.play();
        }
        if (actionType == 2) {
            FilmAction filmAction = context.getBean("film", FilmAction.class);
            filmAction.play();
        }
        if (actionType == 3) {
            GameAction gameAction = context.getBean("game", GameAction.class);
            gameAction.play();
        }
        else{
            System.out.println("Ошибка");
        }

        }
    }

