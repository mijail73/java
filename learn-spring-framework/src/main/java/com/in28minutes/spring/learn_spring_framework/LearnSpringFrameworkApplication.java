package com.in28minutes.spring.learn_spring_framework;

import com.in28minutes.spring.learn_spring_framework.game.GameRunner;
import com.in28minutes.spring.learn_spring_framework.game.MarioGame;
import com.in28minutes.spring.learn_spring_framework.game.PacMan;
import com.in28minutes.spring.learn_spring_framework.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		PacMan game = new PacMan();
		GameRunner runner = new GameRunner(game);

		runner.run();
	}

}
