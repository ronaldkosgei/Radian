package com.gammer.game;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GammingConsole {

    @Override
    public void up(){
        System.out.println("Jump");
    }

    @Override
    public void down(){
        System.out.println("Slide");
    }

    @Override
    public void right(){
        System.out.println("Go faster");
    }

    @Override
    public void left(){
        System.out.println("Stop");
    }
}
