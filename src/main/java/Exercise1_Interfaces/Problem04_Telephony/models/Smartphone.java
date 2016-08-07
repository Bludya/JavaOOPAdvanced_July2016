package Exercise1_Interfaces.Problem04_Telephony.models;

import Exercise1_Interfaces.Problem04_Telephony.Interfaces.Browsable;
import Exercise1_Interfaces.Problem04_Telephony.Interfaces.Callable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bludya on 7/14/16.
 * All rights reserved!
 */
public class Smartphone implements Callable, Browsable {

    public Smartphone() {
    }

    @Override
    public String call(String number) {
        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(number);
        if (matcher.find()) {
            return "Invalid number!";
        }
        return String.format("Calling... %s", number);
    }

    @Override
    public String browse(String url) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            return "Invalid URL!";
        }
        return String.format("Browsing: %s!", url);
    }
}
