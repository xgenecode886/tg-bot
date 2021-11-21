package com.tg.tgbot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.tg.tgbot.bot.StickerLongPollingBot;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InitialApplication implements ApplicationListener<ContextRefreshedEvent> {
//    @Autowired
//    private StickerBot stickerBot;
    @Autowired
    private StickerLongPollingBot stickerLongPollingBot;
//    @Bean
//    public TelegramBotInitializer telegramBotInitializer(TelegramBotsApi telegramBotsApi,
//        ObjectProvider<List<LongPollingBot>> longPollingBots, List<SpringWebhookBot> webHookBots) {
//        return new TelegramBotInitializer(telegramBotsApi,
//            longPollingBots.getIfAvailable(Collections::emptyList),
//            webHookBots);
//    }

    @Override public void onApplicationEvent(ContextRefreshedEvent event) {
//        Update update = new Update();
//        update.setUpdateId(1);
//        stickerLongPollingBot.onUpdateReceived(update);

////        sti/ckerBot.onRegister();
//        DefaultBotOptions defaultBotOptions = new DefaultBotOptions();
//        DefaultWebhook defaultWebhook = new DefaultWebhook();
//        SetWebhook setWebhook = SetWebhook.builder().url("http://localhost:7007/").build();
//        try {
//            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class, defaultWebhook);
//            StickerSpringBot stickerBot = new StickerSpringBot(defaultBotOptions, setWebhook);
//            telegramBotsApi.registerBot(stickerBot, stickerBot.getSetWebhook());
//        } catch (TelegramApiException e) {
//            log.error(e.getMessage(), e);
//        }
    }
}
