package com.example.demo.apps;

import com.example.demo.Interface.Action;
import com.example.demo.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Scanner;

public class JavaContextApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        HashMap<Integer, Action> map = new HashMap<>();
        map.put(1, context.getBean("music",MusicAction.class));
        map.put(2, context.getBean("film",FilmAction.class));
        map.put(3, context.getBean("game",GameAction.class));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие:\n1 - Включить музыку\n2 - Включить фильм\n3 - Включить игру");
        int actionType = scanner.nextInt();
        map.get(actionType).play();
        
        }
    }

