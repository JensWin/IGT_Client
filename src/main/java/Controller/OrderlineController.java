package Controller;

import Interface.IController;
import utilities.ConnectionManager;

import java.net.URL;

public class OrderlineController  extends ConnectionManager implements IController {
    public String create(String item, String order){
        try{
            URL url = new URL(BASE + String.format("orderline/create?item="+item+"&order="+order));
            return sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
            return null;
        }
    }

    public void get(String id){
        try{
            URL url = new URL(BASE + String.format("orderline/get/id=%s", id));
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void delete(String id){
        try{
            URL url = new URL(BASE + String.format("orderline/delete?id=%s", id));
            sendHTTPRequest(url, "DELETE");
            System.out.println("Deleted successfully");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void update(String item, String order, String id){
        try{
            URL url = new URL(BASE + String.format("orderline/create?item="+item+"&order="+order+"&id="+id));
            sendHTTPRequest(url, "PUT");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public String getName(){
        return getClass().getName();
    }
}