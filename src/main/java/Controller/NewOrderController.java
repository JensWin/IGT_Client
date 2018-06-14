package Controller;

import Interface.IController;
import utilities.ConnectionManager;

import java.net.URL;

public class NewOrderController extends ConnectionManager implements IController {

    public String create(String order){
        try{
            URL url = new URL(BASE + String.format("neworder/create?order="+ order));
            return sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
            return null;
        }
    }

    public void get(String id){
        try{
            URL url = new URL(BASE + String.format("neworder/get/"+ id));
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void delete(String id){
        try{
            URL url = new URL(BASE + String.format("neworder/delete?id=%s", id));
            sendHTTPRequest(url, "DELETE");
            System.out.println("Deleted successfully");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void update(String id, String order){
        try{
            URL url = new URL(BASE + "neworder/update?id="+id+"&order="+order);
            sendHTTPRequest(url, "PUT");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public String getName(){
        return getClass().getName();
    }
}