package com.gammer.game;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GammingConsole{

    public void up(){
        System.out.println("Up");
    }

    public void down(){
        System.out.println("Down");
    }

    public void right(){
        System.out.println("Right");
    }

    public void left(){
        System.out.println("Left");
    }
}
