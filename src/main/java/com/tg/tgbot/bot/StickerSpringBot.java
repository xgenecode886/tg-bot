package com.tg.tgbot.bot;

import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.updates.SetWebhook;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.starter.SpringWebhookBot;

@Deprecated
public class StickerSpringBot extends SpringWebhookBot {

    public StickerSpringBot(SetWebhook setWebhook) {
        super(setWebhook);
    }

    public StickerSpringBot(DefaultBotOptions options, SetWebhook setWebhook) {
        super(options, setWebhook);
    }

    @Override public String getBotUsername() {
        return "Squ1rtle_bot";
    }

    @Override public String getBotToken() {
        return "1980282800:AAE1Jhs6648lo3WQmp5OdbWTZn1cUbsjjao";
    }

    @Override public void onRegister() {
        super.onRegister();
    }

    @Override public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        return null;
    }

    @Override public String getBotPath() {
        return "/stickerBot";
    }
}
