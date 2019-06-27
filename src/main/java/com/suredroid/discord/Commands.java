package com.suredroid.discord;

import com.suredroid.discord.Annotations.Command;
import org.javacord.api.event.message.MessageCreateEvent;

public class Commands {

    @Command(desc = "Provides basic information about the bot.")
    public void info(String args, MessageCreateEvent e){
        DUtils.sendMessage(e,"HackWeek Bot Info","This bot was created for the Hackweek Bot challenge using Javacord and SimpleCord.\nThe team consists of <@217015504932438026>, <@98454097430073344>, <@104672280453320704>, <@204411501535166464>, and <@309469271656890368>.");
    }
}
