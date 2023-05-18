package com.example.demo.beans;

import com.example.demo.Interface.Action;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor

@Data
public class MusicAction implements Action {
    @Override
    public void play() {
        System.out.println("Music has been started");
    }
}
