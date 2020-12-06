package com.example.telegrambottraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Учебный телеграм бот.
 *
 * @author Suren Kalaychyan
 */
@SpringBootApplication
@SuppressWarnings({"HideUtilityClassConstructor", "PMD.UseUtilityClass"})
public class TelegramBotTrainingApplication {

    public static void main(final String[] args) {
        SpringApplication.run(TelegramBotTrainingApplication.class, args);
    }
}
