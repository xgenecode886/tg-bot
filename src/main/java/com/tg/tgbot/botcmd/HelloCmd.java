package com.tg.tgbot.botcmd;

import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.internal.util.ExceptionUtils;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

@Slf4j
public class HelloCmd extends BotCommand {
    @Override void handle(TelegramLongPollingBot bot, Message msg, String commandText, List<String> commandArgs) {
        try {
            SendMessage method = new SendMessage();
            method.setChatId(String.valueOf(msg.getChatId()));
            method.setText(String.format("hi, %s", commandArgs.get(0)));
            bot.execute(method);
        } catch (TelegramApiException e) {
            log.warn("HelloCmd error: {}", ExceptionUtils.exceptionStackTraceAsString(e));
        }
    }
}
