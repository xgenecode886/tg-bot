package com.tg.tgbot.bot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Deprecated
public class StickerBot extends TelegramWebhookBot {
    @Override public String getBotUsername() {
        return "Squ1rtle_bot";
    }

    @Override public String getBotToken() {
        return "1980282800:AAE1Jhs6648lo3WQmp5OdbWTZn1cUbsjjao";
    }

    @Override public void onRegister() {
        log.info("Register Bot: {}", getBotUsername());
        super.onRegister();
    }

    @Override public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        log.info("onWebhookUpdateReceived: {}", update);
        return null;
    }

    @Override public String getBotPath() {
        return "/stickerBot";
    }
}
