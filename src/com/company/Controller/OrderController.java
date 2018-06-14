package com.company.Controller;

import com.company.Interface.IController;
import com.company.utilities.ConnectionManager;

import java.net.URL;

public class OrderController  extends ConnectionManager implements IController {
    public String create(String name, String customer){
        try{
            URL url = new URL(BASE + String.format("order/create?name="+name+"&customer="+customer));
            return sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
            return null;
        }
    }

    public void get(String id){
        try{
            URL url = new URL(BASE + String.format("order/get/id=%s", id));
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void delete(String id){
        try{
            URL url = new URL(BASE + String.format("order/delete?id=%s", id));
            sendHTTPRequest(url, "DELETE");
            System.out.println("Deleted successfully");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void update(String name, String id, String customer){
        try{
            URL url = new URL(BASE + String.format("order/update?name="+name+"&customer="+customer+"&id="+id));
            sendHTTPRequest(url, "PUT");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public String getName(){
        return getClass().getName();
    }
}
