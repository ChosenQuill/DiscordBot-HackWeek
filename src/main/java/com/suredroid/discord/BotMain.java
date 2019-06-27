package com.suredroid.discord;

public class BotMain {
    public static void main(String[] args) {
        DiscordBot.start(System.getenv("hack_week_bot_key"));

    }
}
