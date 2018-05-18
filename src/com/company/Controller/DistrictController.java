package com.company.Controller;

import com.company.Interface.IController;
import com.company.utilities.ConnectionManager;

import java.net.URL;

public class DistrictController  extends ConnectionManager implements IController {
    public void create(String name){
        try{
            URL url = new URL(BASE + String.format("district/create?name=%s", name));
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void get(String id){
        try{
            URL url = new URL(BASE + String.format("district/get?id=%s", id));
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void delete(String id){
        try{
            URL url = new URL(BASE + String.format("district/delete?id=%s", id));
            sendHTTPRequest(url, "GET");
            System.out.println("Deleted successfully");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void update(){
        /*try{
            URL url = new URL(BASE + "district/get/" + "1");
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }*/
    }

    public String getName(){
        return getClass().getName();
    }
}
