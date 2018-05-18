package com.company.Controller;

import com.company.Interface.IController;
import com.company.utilities.ConnectionManager;

import java.net.URL;

public class ItemController  extends ConnectionManager implements IController {
    public void create(String name){
        try{
            URL url = new URL(BASE + String.format("item/create?name=%s", name));
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void get(String id){
        try{
            URL url = new URL(BASE + String.format("item/get?id=%s", id));
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void delete(String id){
        try{
            URL url = new URL(BASE + String.format("item/delete?id=%s", id));
            sendHTTPRequest(url, "GET");
            System.out.println("Deleted successfully");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void update(){
        /*try{
            URL url = new URL(BASE + "item/get/" + "1");
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }*/
    }

    public String getName(){
        return getClass().getName();
    }
}
