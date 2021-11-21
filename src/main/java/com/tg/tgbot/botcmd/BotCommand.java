package com.tg.tgbot.botcmd;

import java.util.Arrays;
import java.util.List;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public abstract class BotCommand {
    abstract void handle(TelegramLongPollingBot bot,Message msg, String commandText, List<String> commandArgs);

    public static void execute(TelegramLongPollingBot bot, Update update) {
        String msg = update.getMessage().getText();
        if (msg.startsWith("/")) {
            List<String> commands = Arrays.asList(msg.substring(1).split(" "));
            BotCommand defaultCommand = new HelloCmd();
            if ("hello".equalsIgnoreCase(commands.get(0))) {
                defaultCommand = new HelloCmd();
            }
            defaultCommand.handle(bot, update.getMessage(), commands.get(0), commands.subList(1, commands.size()));
        }
    }
}
