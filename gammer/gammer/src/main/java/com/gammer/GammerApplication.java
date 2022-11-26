package com.gammer;

import com.gammer.game.Gammer;
import com.gammer.game.GammingConsole;
import com.gammer.game.MarioGame;
import com.gammer.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GammerApplication {

	private static GammingConsole game;

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(GammerApplication.class, args);

		Gammer runner = context.getBean(Gammer.class);

		MarioGame game = new MarioGame();

		//SuperContraGame game = new SuperContraGame();

		//Gammer runner = new Gammer(game);

		runner.runGame();
	}

}
