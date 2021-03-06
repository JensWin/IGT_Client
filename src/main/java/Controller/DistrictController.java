package Controller;

import Interface.IController;
import utilities.ConnectionManager;

import java.net.URL;

public class DistrictController  extends ConnectionManager implements IController {
    public String create(String name, String warehouse){
        try{
            URL url = new URL(BASE + String.format("district/create?name="+name+"&warehouse="+warehouse));
            return sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
            return null;
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
            sendHTTPRequest(url, "DELETE");
            System.out.println("Deleted successfully");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void update(String name, String id, String warehouse){
        try{
            URL url = new URL(BASE + "district/get?name="+name+"&id="+id+"&warehouse="+warehouse);
            sendHTTPRequest(url, "PUT");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public String getName(){
        return getClass().getName();
    }
}