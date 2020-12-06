package com.example.telegrambottraining.controller;

import com.example.telegrambottraining.TelegramBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * @author Suren Kalaychyan
 */
@RestController
public class WebHockController {
    private final TelegramBot telegramBot;

    @Autowired
    public WebHockController(final TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BotApiMethod<?> onUpdateReceived(@RequestBody final Update update) {
        return telegramBot.onWebhookUpdateReceived(update);
    }
}
