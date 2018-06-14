package Controller;
import Interface.IController;
import utilities.ConnectionManager;

import java.net.URL;

public class ItemController  extends ConnectionManager implements IController {
    public String create(String name, String warehouse, String stock){
        try{
            URL url = new URL(BASE + String.format("item/create?name="+name+"&warehouse="+warehouse+"&stock="+stock));
            return sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
            return null;
        }
    }

    public void get(String id){
        try{
            URL url = new URL(BASE + String.format("item/get/id=%s", id));
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void delete(String id){
        try{
            URL url = new URL(BASE + String.format("item/delete?id=%s", id));
            sendHTTPRequest(url, "DELETE");
            System.out.println("Deleted successfully");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void update(String name, String id,String warehouse, String stock){
        try{
            URL url = new URL(BASE + String.format("item/update?name="+name+"&warehouse="+warehouse+"&stock="+stock+"&id="+id));
            sendHTTPRequest(url, "PUT");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public String getName(){
        return getClass().getName();
    }
}