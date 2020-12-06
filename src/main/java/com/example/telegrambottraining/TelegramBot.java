package com.example.telegrambottraining;

import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * @author Suren Kalaychyan
 */
public class TelegramBot extends TelegramWebhookBot {

    private String botUsername;
    private String botToken;
    private String webHookPath;

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public String getBotPath() {
        return webHookPath;
    }

    public void setBotUsername(final String botUsername) {
        this.botUsername = botUsername;
    }

    public void setBotToken(final String botToken) {
        this.botToken = botToken;
    }

    public void setWebHookPath(final String webHookPath) {
        this.webHookPath = webHookPath;
    }

    @Override
    public BotApiMethod onWebhookUpdateReceived(Update update) {
        if (update.getMessage() != null && update.getMessage().hasText()) {
            long chatId = update.getMessage().getChatId();

            try {
                execute(new SendMessage(Long.toString(chatId), "Hello Bot!"));
            } catch (TelegramApiException ex) {
                ex.printStackTrace();
            }
        }

        return null;
    }
}
