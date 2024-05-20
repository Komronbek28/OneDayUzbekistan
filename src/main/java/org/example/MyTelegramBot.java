package org.example;

import org.json.simple.parser.ParseException;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyTelegramBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "YourBot'sUsername";
    }

    @Override
    public String getBotToken() {
        return "YourBotToken";
    }

    @Override
    public void onUpdateReceived(Update update) {

        long chatID = update.getMessage().getChatId();
        String messageFromUser = update.getMessage().getText();

        if (update.hasMessage() && update.getMessage().hasText()) {
            if (messageFromUser.equals("/start") || messageFromUser.equals("⬅ Orqaga")) {
                sendLanguageSelectionMenu(chatID);
            } else if (messageFromUser.equals("Ob-havo \uD83C\uDF24")) {
                weather(chatID);
            } else if (messageFromUser.equals("Valyuta kursi \uD83D\uDCB0")) {
                currency(chatID);
            } else if (messageFromUser.equals("Namoz vaqtlari ☪")) {
                PrayerTimes(chatID);
            } else if (messageFromUser.equals("\uD83C\uDF07 Toshkent")) {
                Tashkent(chatID);
            } else if (messageFromUser.equals("\uD83C\uDF07 Andijon")) {
                Andijan(chatID);
            } else if (messageFromUser.equals("\uD83C\uDF07 Farg'ona")) {
                Ferghana(chatID);
            } else if (messageFromUser.equals("\uD83C\uDF07 Samarqand")) {
                Samarkand(chatID);
            } else if (messageFromUser.equals("\uD83C\uDF07 Buxoro")) {
                Bukhara(chatID);
            } else if (messageFromUser.equals("\uD83C\uDF07 Sirdaryo")) {
                SyrDarya(chatID);
            } else if (messageFromUser.equals("\uD83C\uDF07 Navoiy")) {
                Navoi(chatID);
            } else if (messageFromUser.equals("\uD83C\uDF07 Qoraqalpog'iston")) {
                Karakalpakstan(chatID);
            } else if (messageFromUser.equals("\uD83C\uDF07 Surxondaryo")) {
                Surkhandarya(chatID);
            } else if (messageFromUser.equals("\uD83C\uDF07 Qashqadaryo")) {
                Kashkadarya(chatID);
            } else if (messageFromUser.equals("\uD83C\uDF07 Namangan")) {
                Namangan(chatID);
            } else if (messageFromUser.equals("\uD83C\uDF07 Xorazm")) {
                Khorezm(chatID);
            } else if (messageFromUser.equals("\uD83C\uDF07 Jizzax")) {
                Jizzakh(chatID);
            } else if (messageFromUser.equals("⬅⬅ Orqaga")) {
                PrayerTimes(chatID);
            } else if (messageFromUser.equals("\uD83C\uDDF7\uD83C\uDDFA Rossiya rubli")){
                try {
                    SendMessage(chatID, "RUB");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDF0\uD83C\uDDFF Qozog'iston tengesi")){
                try {
                    SendMessage(chatID, "KZT");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDEA\uD83C\uDDFA Yevro")){
                try {
                    SendMessage(chatID, "EUR");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDF8 AQSH dollari")){
                try {
                    SendMessage(chatID, "USD");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDEF\uD83C\uDDF5 Yaponiya iyenasi")) {
                try {
                    SendMessage(chatID, "JPY");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC65\uDB40\uDC6E\uDB40\uDC67\uDB40\uDC7F Angliya funt sterlinggi")) {
                try {
                    SendMessage(chatID, "GBP");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDFF Toshkent")) {
                try {
                    SendMessageForWeather(chatID, "Toshkent");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDFF Samarqand")) {
                try {
                    SendMessageForWeather(chatID, "Samarqand");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDFF Xiva")) {
                try {
                    SendMessageForWeather(chatID, "Xiva");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDFF Navoiy")) {
                try {
                    SendMessageForWeather(chatID, "Navoiy");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDFF Andijon")) {
                try {
                    SendMessageForWeather(chatID, "Andijon");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDFF Buxoro")) {
                try {
                    SendMessageForWeather(chatID, "Buxoro");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDFF Farg'ona")) {
                try {
                    SendMessageForWeather(chatID, "Farg'ona");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDFF Jizzax")) {
                try {
                    SendMessageForWeather(chatID, "Jizzax");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDFF Termiz")) {
                try {
                    SendMessageForWeather(chatID, "Termiz");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDFF Qarshi")) {
                try {
                    SendMessageForWeather(chatID, "Qarshi");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDFF Guliston")) {
                try {
                    SendMessageForWeather(chatID, "Guliston");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDFF Nukus")) {
                try {
                    SendMessageForWeather(chatID, "Nukus");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDDFA\uD83C\uDDFF Namangan")) {
                try {
                    SendMessageForWeather(chatID, "Namangan");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Toshkent")) {
                try {
                    SendMessageForPrayerTime(chatID, "Toshkent");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Angren")) {
                try {
                    SendMessageForPrayerTime(chatID, "Angren");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Piskent")) {
                try {
                    SendMessageForPrayerTime(chatID, "Piskent");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Bekobod")) {
                try {
                    SendMessageForPrayerTime(chatID, "Bekobod");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Parkent")) {
                try {
                    SendMessageForPrayerTime(chatID, "Parkent");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 G'azalkent")) {
                try {
                    SendMessageForPrayerTime(chatID, "G'azalkent");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Olmaliq")) {
                try {
                    SendMessageForPrayerTime(chatID, "Olmaliq");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Bo'ka")) {
                try {
                    SendMessageForPrayerTime(chatID, "Bo'ka");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Yangiyo'l")) {
                try {
                    SendMessageForPrayerTime(chatID, "Yangiyo'l");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Nurafshon")) {
                try {
                    SendMessageForPrayerTime(chatID, "Nurafshon");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Andijon")) {
                try {
                    SendMessageForPrayerTime(chatID, "Andijon");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Xonobod")) {
                try {
                    SendMessageForPrayerTime(chatID, "Xonobod");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Shahrixon")) {
                try {
                    SendMessageForPrayerTime(chatID, "Shahrixon");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Xo'jaobod")) {
                try {
                    SendMessageForPrayerTime(chatID, "Xo'jaobod");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Asaka")) {
                try {
                    SendMessageForPrayerTime(chatID, "Asaka");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Marhamat")) {
                try {
                    SendMessageForPrayerTime(chatID, "Marhamat");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Poytug'")) {
                try {
                    SendMessageForPrayerTime(chatID, "Poytug'");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Bo'ston")) {
                try {
                    SendMessageForPrayerTime(chatID, "Bo'ston");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Farg'ona")) {
                try {
                    SendMessageForPrayerTime(chatID, "Farg'ona");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Qo'qon")) {
                try {
                    SendMessageForPrayerTime(chatID, "Qo'qon");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Marg'ilon")) {
                try {
                    SendMessageForPrayerTime(chatID, "Marg'ilon");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Quva")) {
                try {
                    SendMessageForPrayerTime(chatID, "Quva");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Rishton")) {
                try {
                    SendMessageForPrayerTime(chatID, "Rishton");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Bog'dod")) {
                try {
                    SendMessageForPrayerTime(chatID, "Bog'dod");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Oltiariq")) {
                try {
                    SendMessageForPrayerTime(chatID, "Oltiariq");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Samarqand")) {
                try {
                    SendMessageForPrayerTime(chatID, "Samarqand");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Ishtixon")) {
                try {
                    SendMessageForPrayerTime(chatID, "Ishtixon");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Mirbozor")) {
                try {
                    SendMessageForPrayerTime(chatID, "Mirbozor");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Kattaqo'rg'on")) {
                try {
                    SendMessageForPrayerTime(chatID, "Kattaqo'rg'on");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Urgut")) {
                try {
                    SendMessageForPrayerTime(chatID, "Urgut");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Gazli")) {
                try {
                    SendMessageForPrayerTime(chatID, "Gazli");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 G'ijduvon")) {
                try {
                    SendMessageForPrayerTime(chatID, "G'ijduvon");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Qorako'l")) {
                try {
                    SendMessageForPrayerTime(chatID, "Qorako'l");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Buxoro")) {
                try {
                    SendMessageForPrayerTime(chatID, "Buxoro");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Jondor")) {
                try {
                    SendMessageForPrayerTime(chatID, "Jondor");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Guliston")) {
                try {
                    SendMessageForPrayerTime(chatID, "Guliston");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Sardoba")) {
                try {
                    SendMessageForPrayerTime(chatID, "Sardoba");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Sirdaryo")) {
                try {
                    SendMessageForPrayerTime(chatID, "Sirdaryo");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Boyovut")) {
                try {
                    SendMessageForPrayerTime(chatID, "Boyovut");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Paxtaobod")) {
                try {
                    SendMessageForPrayerTime(chatID, "Paxtaobod");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Navoiy")) {
                try {
                    SendMessageForPrayerTime(chatID, "Navoiy");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Zarafshon")) {
                try {
                    SendMessageForPrayerTime(chatID, "Zarafshon");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Konimex")) {
                try {
                    SendMessageForPrayerTime(chatID, "Konimex");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Nurota")) {
                try {
                    SendMessageForPrayerTime(chatID, "Nurota");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Uchquduq")) {
                try {
                    SendMessageForPrayerTime(chatID, "Uchquduq");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Nukus")) {
                try {
                    SendMessageForPrayerTime(chatID, "Nukus");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Mo'ynoq")) {
                try {
                    SendMessageForPrayerTime(chatID, "Mo'ynoq");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Taxtako'pir")) {
                try {
                    SendMessageForPrayerTime(chatID, "Taxtako'pir");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 To'rtko'l")) {
                try {
                    SendMessageForPrayerTime(chatID, "To'rtko'l");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Qo'ng'irot")) {
                try {
                    SendMessageForPrayerTime(chatID, "Qo'ng'irot");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Termiz")) {
                try {
                    SendMessageForPrayerTime(chatID, "Termiz");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Boysun")) {
                try {
                    SendMessageForPrayerTime(chatID, "Boysun");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            } else if (messageFromUser.equals("\uD83C\uDFD8 Urganch")) {
                try {
                    SendMessageForPrayerTime(chatID, "Urganch");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            } else if (messageFromUser.equals("\uD83C\uDFD8 Xiva")) {
                try {
                    SendMessageForPrayerTime(chatID, "Xiva");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Shovot")) {
                try {
                    SendMessageForPrayerTime(chatID, "Shovot");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Xonqa")) {
                try {
                    SendMessageForPrayerTime(chatID, "Xonqa");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Hazorasp")) {
                try {
                    SendMessageForPrayerTime(chatID, "Hazorasp");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            } else if (messageFromUser.equals("\uD83C\uDFD8 Yangibozor")) {
                try {
                    SendMessageForPrayerTime(chatID, "Yangibozor");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Jizzax")) {
                try {
                    SendMessageForPrayerTime(chatID, "Jizzax");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Forish")) {
                try {
                    SendMessageForPrayerTime(chatID, "Forish");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Zomin")) {
                try {
                    SendMessageForPrayerTime(chatID, "Zomin");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 G'allaorol")) {
                try {
                    SendMessageForPrayerTime(chatID, "G'allaorol");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }else if (messageFromUser.equals("\uD83C\uDFD8 Do'stlik")) {
                try {
                    SendMessageForPrayerTime(chatID, "Do'stlik");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            } else if (messageFromUser.equals("Yangiliklar \uD83D\uDDDE")) {
                SendMessageForNews(chatID);
            }
        }
    }

    private void sendLanguageSelectionMenu(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("Ob-havo \uD83C\uDF24"));
        row.add(new KeyboardButton("Yangiliklar \uD83D\uDDDE"));
        keyboard.add(row);

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Valyuta kursi \uD83D\uDCB0"));
        row1.add(new KeyboardButton("Namoz vaqtlari ☪"));
        keyboard.add(row1);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83E\uDD16 Bu telegram bot orqali siz har kunlik kerak bo'ladigan ma'lumotlardan xabardor bo'lish imkoniyatiga egasiz.\n" +
                "\uD83D\uDC68\u200D\uD83D\uDCBB Buyruqlardan birini tanlashingiz mumkin:";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void PrayerTimes(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDF07 Toshkent"));
        row1.add(new KeyboardButton("\uD83C\uDF07 Andijon"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDF07 Farg'ona"));
        row2.add(new KeyboardButton("\uD83C\uDF07 Samarqand"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDF07 Buxoro"));
        row3.add(new KeyboardButton("\uD83C\uDF07 Sirdaryo"));
        keyboard.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("\uD83C\uDF07 Navoiy"));
        row4.add(new KeyboardButton("\uD83C\uDF07 Qoraqalpog'iston"));
        keyboard.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("\uD83C\uDF07 Surxondaryo"));
        row5.add(new KeyboardButton("\uD83C\uDF07 Qashqadaryo"));
        keyboard.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        row6.add(new KeyboardButton("\uD83C\uDF07 Namangan"));
        row6.add(new KeyboardButton("\uD83C\uDF07 Xorazm"));
        keyboard.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("\uD83C\uDF07 Jizzax"));
        keyboard.add(row7);

        KeyboardRow row8 = new KeyboardRow();
        row8.add(new KeyboardButton("⬅ Orqaga"));
        keyboard.add(row8);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83D\uDCCD Qaysi hududning namoz vaqti haqida bilmoqchisiz ?";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void Tashkent(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDFD8 Toshkent"));
        row1.add(new KeyboardButton("\uD83C\uDFD8 Angren"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDFD8 Piskent"));
        row2.add(new KeyboardButton("\uD83C\uDFD8 Bekobod"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDFD8 Parkent"));
        row3.add(new KeyboardButton("\uD83C\uDFD8 G'azalkent"));
        keyboard.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("\uD83C\uDFD8 Olmaliq"));
        row4.add(new KeyboardButton("\uD83C\uDFD8 Bo'ka"));
        keyboard.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("\uD83C\uDFD8 Yangiyo'l"));
        row5.add(new KeyboardButton("\uD83C\uDFD8 Nurafshon"));
        keyboard.add(row5);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("⬅⬅ Orqaga"));
        keyboard.add(row7);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83D\uDCCD Aniq manzilni tanlang: ";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void Andijan(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDFD8 Andijon"));
        row1.add(new KeyboardButton("\uD83C\uDFD8 Xonobod"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDFD8 Shahrixon"));
        row2.add(new KeyboardButton("\uD83C\uDFD8 Xo'jaobod"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDFD8 Asaka"));
        row3.add(new KeyboardButton("\uD83C\uDFD8 Marhamat"));
        keyboard.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("\uD83C\uDFD8 Poytug'"));
        row4.add(new KeyboardButton("\uD83C\uDFD8 Bo'ston"));
        keyboard.add(row4);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("⬅⬅ Orqaga"));
        keyboard.add(row7);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83D\uDCCD Aniq manzilni tanlang: ";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void Ferghana(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDFD8 Farg'ona"));
        row1.add(new KeyboardButton("\uD83C\uDFD8 Qo'qon"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDFD8 Marg'ilon"));
        row2.add(new KeyboardButton("\uD83C\uDFD8 Quva"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDFD8 Rishton"));
        row3.add(new KeyboardButton("\uD83C\uDFD8 Bog'dod"));
        keyboard.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("\uD83C\uDFD8 Oltiariq"));
        keyboard.add(row4);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("⬅⬅ Orqaga"));
        keyboard.add(row7);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83D\uDCCD Aniq manzilni tanlang: ";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void Samarkand(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDFD8 Samarqand"));
        row1.add(new KeyboardButton("\uD83C\uDFD8 Ishtixon"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDFD8 Mirbozor"));
        row2.add(new KeyboardButton("\uD83C\uDFD8 Kattaqo'rg'on"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDFD8 Urgut"));
        keyboard.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("⬅⬅ Orqaga"));
        keyboard.add(row4);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83D\uDCCD Aniq manzilni tanlang: ";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void Bukhara(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDFD8 Gazli"));
        row1.add(new KeyboardButton("\uD83C\uDFD8 G'ijduvon"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDFD8 Qorako'l"));
        row2.add(new KeyboardButton("\uD83C\uDFD8 Buxoro"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDFD8 Jondor"));
        keyboard.add(row3);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("⬅⬅ Orqaga"));
        keyboard.add(row7);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83D\uDCCD Aniq manzilni tanlang: ";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void SyrDarya(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDFD8 Guliston"));
        row1.add(new KeyboardButton("\uD83C\uDFD8 Sardoba"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDFD8 Sirdaryo"));
        row2.add(new KeyboardButton("\uD83C\uDFD8 Boyovut"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDFD8 Paxtaobod"));
        keyboard.add(row3);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("⬅⬅ Orqaga"));
        keyboard.add(row7);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83D\uDCCD Aniq manzilni tanlang: ";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void Navoi(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDFD8 Navoiy"));
        row1.add(new KeyboardButton("\uD83C\uDFD8 Zarafshon"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDFD8 Konimex"));
        row2.add(new KeyboardButton("\uD83C\uDFD8 Nurota"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDFD8 Uchquduq"));
        keyboard.add(row3);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("⬅⬅ Orqaga"));
        keyboard.add(row7);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83D\uDCCD Aniq manzilni tanlang: ";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void Karakalpakstan(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDFD8 Nukus"));
        row1.add(new KeyboardButton("\uD83C\uDFD8 Mo'ynoq"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDFD8 Taxtako'pir"));
        row2.add(new KeyboardButton("\uD83C\uDFD8 To'rtko'l"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDFD8 Qo'ng'irot"));
        keyboard.add(row3);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("⬅⬅ Orqaga"));
        keyboard.add(row7);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83D\uDCCD Aniq manzilni tanlang: ";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void Surkhandarya(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDFD8 Termiz"));
        row1.add(new KeyboardButton("\uD83C\uDFD8 Boysun"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDFD8 Denov"));
        row2.add(new KeyboardButton("\uD83C\uDFD8 Sherobod"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDFD8 Sho'rchi"));
        keyboard.add(row3);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("⬅⬅ Orqaga"));
        keyboard.add(row7);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83D\uDCCD Aniq manzilni tanlang: ";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void Kashkadarya(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDFD8 Qarshi"));
        row1.add(new KeyboardButton("\uD83C\uDFD8 Dehqonobod"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDFD8 Shahrixon"));
        row2.add(new KeyboardButton("\uD83C\uDFD8 Muborak"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDFD8 Shahrisabz"));
        row3.add(new KeyboardButton("\uD83C\uDFD8 G'uzor"));
        keyboard.add(row3);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("⬅⬅ Orqaga"));
        keyboard.add(row7);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83D\uDCCD Aniq manzilni tanlang: ";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void Namangan(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDFD8 Namangan"));
        row1.add(new KeyboardButton("\uD83C\uDFD8 Chortoq"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDFD8 Chust"));
        row2.add(new KeyboardButton("\uD83C\uDFD8 Pop"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDFD8 Uchqo'rg'on"));
        row3.add(new KeyboardButton("\uD83C\uDFD8 Mingbuloq"));
        keyboard.add(row3);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("⬅⬅ Orqaga"));
        keyboard.add(row7);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "Q\uD83D\uDCCD Aniq manzilni tanlang: ";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void Khorezm(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDFD8 Urganch"));
        row1.add(new KeyboardButton("\uD83C\uDFD8 Hazorasp"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDFD8 Xonqa"));
        row2.add(new KeyboardButton("\uD83C\uDFD8 Yangibozor"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDFD8 Shovot"));
        row3.add(new KeyboardButton("\uD83C\uDFD8 Xiva"));
        keyboard.add(row3);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("⬅⬅ Orqaga"));
        keyboard.add(row7);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83D\uDCCD Aniq manzilni tanlang: ";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void Jizzakh(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDFD8 Jizzax"));
        row1.add(new KeyboardButton("\uD83C\uDFD8 Zomin"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDFD8 Forish"));
        row2.add(new KeyboardButton("\uD83C\uDFD8 G'allaorol"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDFD8 Do'stlik"));
        keyboard.add(row3);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("⬅⬅ Orqaga"));
        keyboard.add(row7);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "\uD83D\uDCCD Aniq manzilni tanlang: ";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void weather(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF Toshkent"));
        row1.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF Guliston"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF Jizzax"));
        row2.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF Samarqand"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF Qarshi"));
        row3.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF Termiz"));
        keyboard.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF Buxoro"));
        row4.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF Xiva"));
        keyboard.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF Andijon"));
        row5.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF Namangan"));
        keyboard.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        row6.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF Farg'ona"));
        row6.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF Navoiy"));
        keyboard.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF Nukus"));
        keyboard.add(row7);

        KeyboardRow row8 = new KeyboardRow();
        row8.add(new KeyboardButton("⬅ Orqaga"));
        keyboard.add(row8);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        String start = "Qaysi hududning obu-havosi haqida bilmoqchisiz ?";

        sendReplyMessage(chatId, start, keyboardMarkup);
    }

    private void currency(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("\uD83C\uDDF7\uD83C\uDDFA Rossiya rubli"));
        row.add(new KeyboardButton("\uD83C\uDDF0\uD83C\uDDFF Qozog'iston tengesi"));
        keyboardRows.add(row);

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("\uD83C\uDDEA\uD83C\uDDFA Yevro"));
        row1.add(new KeyboardButton("\uD83C\uDDFA\uD83C\uDDF8 AQSH dollari"));
        keyboardRows.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83C\uDDEF\uD83C\uDDF5 Yaponiya iyenasi"));
        row2.add(new KeyboardButton("\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC65\uDB40\uDC6E\uDB40\uDC67\uDB40\uDC7F Angliya funt sterlinggi"));
        keyboardRows.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("⬅ Orqaga"));
        keyboardRows.add(row3);

        keyboardMarkup.setKeyboard(keyboardRows);
        keyboardMarkup.setResizeKeyboard(true);

        String message = "Qaysi birini ko'rmoqchisiz ?";

        sendReplyMessage(chatId, message, keyboardMarkup);
    }

    private void sendReplyMessage(long chatId, String s, ReplyKeyboardMarkup keyboardMarkup) {

        SendMessage message = new SendMessage();

        message.setReplyMarkup(keyboardMarkup);
        message.setChatId(String.valueOf(chatId));
        message.setText(s);
        message.setParseMode("HTML");

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void SendMessage(long chatID, String text) throws IOException, ParseException {
        SendMessage sendMessage = new SendMessage();

        sendMessage.setText(OpenJSON.Course(text));
        sendMessage.setChatId(String.valueOf(chatID));
        sendMessage.setParseMode("HTML");

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void SendMessageForWeather(long chatID, String text) throws IOException, ParseException {
        SendMessage sendMessage = new SendMessage();

        sendMessage.setText(OpenJSON.getWeather(text));
        sendMessage.setChatId(String.valueOf(chatID));
        sendMessage.setParseMode("HTML");

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void SendMessageForPrayerTime(long chatId, String text) throws IOException, ParseException {

        SendMessage sendMessage = new SendMessage();

        sendMessage.setText(OpenJSON.getTimeOfPrayerTime(text));
        sendMessage.setChatId(String.valueOf(chatId));
        sendMessage.setParseMode("HTML");

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void SendMessages(long chatId, String str) {
        SendMessage sendMessage = new SendMessage();

        sendMessage.setText(str);
        sendMessage.setChatId(String.valueOf(chatId));
        sendMessage.setParseMode("HTML");

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void SendMessageForNews(long chatId) {
        String str = "15-maydan Toshkentdagi barcha transport karta sotish shoxobchalari yopiladi\n" +
                "\n" +
                "Shoxobchalar vazifalarini hududlardagi markaziy pochta bo‘limlari bajaradi. Unda yo‘lovchilar ATTO transport kartasini sotib olish, hisobini to‘ldirish yoki tarif sotib olish xizmatlaridan foydalanishlari mumkin.";
        SendMessages(chatId, str);

        str = "Yangilangan Cobalt 2025-yildan boshlab sotuvga chiqarilishi kutilyapti (https://kun.uz/news/2024/05/14/cobaltning-yangilangan-versiyasi-qachondan-boshlab-sotuvga-chiqarilishi-malum-qilindi). Uning ichki salon qismi va tashqi ko‘rinishi qanday bo‘lishi hamda narxi hozircha noma’lum.";
        SendMessages(chatId, str);

        str = "Parij-2024 yozgi Olimpiya o’yinlari yo’llanmasini qo’lga kiritgan futbol bo’yicha O’zbekiston olimpiya terma jamoasining bo’lajak musobaqaga tayyorgarlik doirasida dastlabki o’rtoqlik o’yinlaridagi raqibi ma’lum bo’ldi. FIFA kunlarida tashkil etiladigan bahslarda jamoamiz Mali bilan 2 bor kuch sinashadi.\n" +
                "\n" +
                "Eslatib o’tamiz, Arfikaning ushbu jamoasi ham Parij-2024 yo’llanmasini naqd qilgan. Har ikki uchrashuv 7 va 10-iyun kunlari Toshkentda bo’lib o’tadi.";
        SendMessages(chatId, str);

        str = "Temur Kapadze «Park de Prens»da bo'ldi\n" +
                "\n" +
                "O'zbekiston olimpiya jamoasi bosh murabbiyi Temur Kapadze Frantsiya poytaxti Parijga bordi.\n" +
                "\n" +
                "\uD83D\uDC49 http://tribuna.uz/6603";
        SendMessages(chatId, str);

        str = "Honda sotuvlar tushib ketgani ortidan Xitoydagi 1,7 ming xodimini ishdan bo‘shatadi — Nikkei\n" +
                "\n" +
                "2024-yil aprel oyida Xitoyda Honda avtomobillari savdosi o‘tgan yilning shu davriga nisbatan 22,2 foizga kamaygan. ";
        SendMessages(chatId, str);
    }
}
