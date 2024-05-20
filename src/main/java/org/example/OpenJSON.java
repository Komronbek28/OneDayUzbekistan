package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OpenJSON {
    public static String Course(String CoursCode) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        String str = "";

        JSONArray a = (JSONArray) parser.parse(new FileReader("C:\\Users\\Den\\IdeaProjects\\OneDayUzbekistan\\src\\main\\java\\org\\example\\jsonFiles\\valyuta.json"));
        for (Object o : a) {
            JSONObject employee = (JSONObject) o;

            String code1 = (String) employee.get("code");
            if (code1.equals(CoursCode)) {
                String title = (String) employee.get("title");
                str = str + "<b>" + title + "</b>\n\n";

                String code = (String) employee.get("code");
                str = str + "\uD83D\uDD11 Kodi - <b>" + code + "</b>\n";

                String cb_price = (String) employee.get("cb_price");
                str = str + "\uD83D\uDCB3 Narxi - <b>" + cb_price + "</b>\n";

                String nbu_buy_price = (String) employee.get("nbu_buy_price");
                str = str + "\uD83C\uDFE6 Sotib olish narxi - <b>" + nbu_buy_price + "</b>\n";

                String nbu_cell_price = (String) employee.get("nbu_cell_price");
                str = str + "\uD83C\uDFE6 Sotish narxi - <b>" + nbu_cell_price + "</b>\n";

                String date = (String) employee.get("date");
                str = str + "\uD83D\uDCC5 Sana - <b>" + date + "</b>\n\n";

                str = str + "\uD83D\uDDDE Ma'lumotlar <b>NBU (Milliy bank)</b> dan olindi " + "\n";

                str = str + "\uD83C\uDF10 https://nbu.uz/uz/exchange-rates/ \n\n";

                str = str + "@one_day_uzb_bot";
            }
        }

        return str;
    }

    public static String getWeather(String weatherCode) throws IOException, ParseException {

        JSONParser parser = new JSONParser();

        String str = "";

        JSONArray a = (JSONArray) parser.parse(new FileReader("C:\\Users\\Den\\IdeaProjects\\OneDayUzbekistan\\src\\main\\java\\org\\example\\jsonFiles\\ob-havo.json"));
        for (Object o : a) {
            JSONObject employee = (JSONObject) o;

            String code1 = (String) employee.get("city");
            if (code1.equals(weatherCode)) {

                String city = (String) employee.get("city");
                str = str + "\uD83C\uDF07 <b>" + city + "</b> \n\n";

                String title = (String) employee.get("date");
                str = str + "\uD83D\uDCC5 Sana : <b>" + title + "</b>\n";

                String code = (String) employee.get("condition");
                str = str + "\uD83C\uDF0F Holat : <b>" + code + "</b>\n";

                String cb_price = (String) employee.get("afternoon");
                str = str + "\uD83C\uDF24 Kunduzi : <b>" + cb_price + "</b>\n";

                String nbu_buy_price = (String) employee.get("night");
                str = str + "⛅ Kechasi : <b>" + nbu_buy_price + "</b>\n";

                String nbu_cell_price = (String) employee.get("humidity");
                str = str + "\uD83D\uDCA7 Namlik : <b>" + nbu_cell_price + "</b>\n";

                String date = (String) employee.get("moon");
                str = str + "\uD83C\uDF17 Oy : <b>" + date + "</b>\n\n";

                str = str + "@one_day_uzb_bot";
            }
        }

        return str;
    }

    public static String getTimeOfPrayerTime(String PrayerLocation) throws IOException, ParseException {

        JSONParser parser = new JSONParser();

        String str = "";

        JSONArray a = (JSONArray) parser.parse(new FileReader("C:\\Users\\Den\\IdeaProjects\\OneDayUzbekistan\\src\\main\\java\\org\\example\\jsonFiles\\NamozVaqtlari.json"));
        for (Object o : a) {
            JSONObject employee = (JSONObject) o;

            String code1 = (String) employee.get("place");
            if (code1.equals(PrayerLocation)) {

                String place = (String) employee.get("place");
                str = str + "\uD83D\uDCCD <b>" + place + "</b> \n";

                String sana = (String) employee.get("sana");
                str = str + "\uD83D\uDCC5 Sana : <b>" + sana + "</b> \n\n";

                String bomdod = (String) employee.get("bomdod");
                str = str + "\uD83C\uDF25 Bomdod : <b>" + bomdod + "</b>\n";

                String quyosh = (String) employee.get("quyosh");
                str = str + "☀ Quyosh : <b>" + quyosh + "</b>\n";

                String peshin = (String) employee.get("peshin");
                str = str + "\uD83C\uDF24 Peshin : <b>" + peshin + "</b>\n";

                String asr = (String) employee.get("asr");
                str = str + "⛅ Asr : <b>" + asr + "</b>\n";

                String shom = (String) employee.get("shom");
                str = str + "⛅ Shom : <b>" + shom + "</b>\n";

                String xufton = (String) employee.get("xufton");
                str = str + "\uD83C\uDF25 Xufton : <b>" + xufton + "</b>\n\n";

                str = str + "@one_day_uzb_bot";
            }
        }
        return str;
    }
}
