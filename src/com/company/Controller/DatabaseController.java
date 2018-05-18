package com.company.Controller;

import com.company.utilities.ConnectionManager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DatabaseController extends ConnectionManager {

    public void switchDatabaseTo(String databaseType){
        try{
            URL url = new URL(BASE + String.format("db/%s", databaseType));
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
