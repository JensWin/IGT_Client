package com.company.Controller;

import com.company.Interface.IController;

import java.net.URL;

public class CompanyController extends DatabaseController implements IController {

    public void create(String name){
        try{
            URL url = new URL(BASE + String.format("company/create?name=%s", name));
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void get(String id){
        try{
            URL url = new URL(BASE + String.format("company/get/%s", id));
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void delete(String id){
        try{
            URL url = new URL(BASE + String.format("company/delete?id=%s", id));
            sendHTTPRequest(url, "DELETE");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void update(){
        /*try{
            URL url = new URL(BASE + "customer/get/" + "1");
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }*/
    }
    public String getName(){
        return getClass().getName();
    }
}
