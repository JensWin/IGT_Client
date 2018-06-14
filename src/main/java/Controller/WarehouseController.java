package Controller;

import Interface.IController;
import utilities.ConnectionManager;

import java.net.URL;

public class WarehouseController  extends ConnectionManager implements IController {
    public String create(String name){
        try{
            URL url = new URL(BASE + String.format("warehouse/create?name=%s", name));
            return sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
            return null;
        }
    }

    public void get(String id){
        try{
            URL url = new URL(BASE + String.format("warehouse/get?id=%s", id));
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void delete(String id){
        try{
            URL url = new URL(BASE + String.format("warehouse/delete?id=%s", id));
            sendHTTPRequest(url, "DELETE");
            System.out.println("Deleted successfully");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void update(String id, String name){
        try{
            URL url = new URL(BASE + "warehouse/get?id="+id+"&name="+name);
            sendHTTPRequest(url, "PUT");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public String getName(){
        return getClass().getName();
    }
}