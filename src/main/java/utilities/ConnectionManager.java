package utilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class ConnectionManager {
    public final static String BASE = "http://localhost:9005/";


    public String sendHTTPRequest(URL url, String method) {
        try {
            String returnString = "";
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(method);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));
            String output;
            while ((output = br.readLine()) != null) {
                System.out.println(output);
                returnString = returnString + output;
            }
            return returnString;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
