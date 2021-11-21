package com.tg.tgbot.bot;

import java.util.List;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import com.tg.tgbot.botcmd.BotCommand;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class StickerLongPollingBot extends TelegramLongPollingBot {

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

    @Override public void onUpdateReceived(Update update) {
        log.info("onUpdateReceived: {}", update);
        BotCommand.execute(this, update);
    }

    @Override public void onUpdatesReceived(List<Update> updates) {
//        log.info("onUpdatesReceived: {}", updates);
        super.onUpdatesReceived(updates);
    }
}
