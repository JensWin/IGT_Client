package com.company.Controller;

import com.company.Interface.IController;
import com.company.utilities.ConnectionManager;

import java.net.URL;

public class CustomerController extends ConnectionManager implements IController {


    public String create(String name, String district, String pw){
        try{
            URL url = new URL(BASE + String.format("customer/create?name="+name+"&district="+district+"&pw="+pw));
            return sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
            return null;
        }
    }

    public void get(String id){
        try{
            URL url = new URL(BASE + String.format("customer/get/id=%s", id));
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void delete(String id){
        try{
            URL url = new URL(BASE + String.format("customer/delete?id=%s", id));
            sendHTTPRequest(url, "DELETE");
            System.out.println("Deleted successfully");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void update(String name, String id, String district, String pw){
        try{
            URL url = new URL(BASE + "customer/get?name="+name+"&id="+id+"&district="+district+"&pw="+pw);
            sendHTTPRequest(url, "PUT");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public String getName(){
        return getClass().getName();
    }
}
