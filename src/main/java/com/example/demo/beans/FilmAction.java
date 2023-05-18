package com.example.demo.beans;

import com.example.demo.Interface.Action;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor

@Data
public class FilmAction implements Action {
    @Override
    public void play() {
        System.out.println("Film has been started");
    }
}
