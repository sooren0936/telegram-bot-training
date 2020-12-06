package com.example.telegrambottraining.config;

import com.example.telegrambottraining.TelegramBot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Suren Kalaychyan
 */
@Configuration
@ConfigurationProperties(prefix = "telegrambot")
public class TelegramBotConfig {

    @Value("${telegrambot.botUsername}")
    private String botUsername;

    @Value("${telegrambot.botToken}")
    private String botToken;

    @Value("${telegrambot.webHookPath}")
    private String webHookPath;

    @Bean
    public TelegramBot telegramBotBeanConfig() {
        TelegramBot telegramBot = new TelegramBot();
        telegramBot.setBotUsername(botUsername);
        telegramBot.setBotToken(botToken);
        telegramBot.setWebHookPath(webHookPath);

        return telegramBot;
    }
}
