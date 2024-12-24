package fr.rammex.datamanagergui;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class InternetChecker {

    public static boolean isConnected() {
        try {
            URL url = new URL("https://www.google.com");
            HttpURLConnection urlConnect = (HttpURLConnection) url.openConnection();
            urlConnect.setConnectTimeout(5000);
            urlConnect.connect();
            return urlConnect.getResponseCode() == 200;
        } catch (IOException e) {
            return false;
        }
    }
}
