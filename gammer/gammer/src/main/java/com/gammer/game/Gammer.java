package com.gammer.game;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gammer {


    private GammingConsole game;

    @Autowired
    public void setGame(GammingConsole game) {
        this.game = game;
    }

    // public Gammer(GammingConsole game) {
    //   System.out.println("Using Constructor");
    // this.game = game;}

    public void runGame(){
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
