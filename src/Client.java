import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Client {

    private static String BASE = "http://127.0.0.1:9005/";

    private void sendHTTPRequest(URL url, String method) {
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(method);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));
            String output;
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createCustomer(){
        try{
            URL url = new URL(BASE + "customer/createCustomer?name=" + "Jensi");
            sendHTTPRequest(url, "GET");
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        System.out.println("CREATE CUSTOMER");
        try{
            client.createCustomer();

        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

}

