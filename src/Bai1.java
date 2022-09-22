import java.net.*;
import java.rmi.UnknownHostException;

public class Bai1 {
    public static void main(String args[]){
        getByNAme("sgu.edu.vn");

    }

    public static void getByNAme(String hostName){

        try{
            InetAddress address=InetAddress.getByName(hostName);
            System.out.println(address.getHostAddress());

        }catch (java.net.UnknownHostException ex){
            System.out.println("Could not find host !");
        }


    }
}
