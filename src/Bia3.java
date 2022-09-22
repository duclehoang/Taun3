import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bia3 {
    public static void main(String []args) throws FileNotFoundException {

        // Đọc dữ liệu từ File với Scanner
        String url = "D:\\HOC_TAP\\Lap Trinh Mang\\Thuc Hanh\\Taun3\\src\\input2.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        String ip;
        try {
            while (scanner.hasNextLine()) {

                ip=scanner.nextLine();
                int timeout = 1000;
                boolean address=InetAddress.getByName(ip).isReachable(timeout);
                if (address){
                    System.out.println("IP "+ip + " is reachable ");
                }
                else {
                    System.out.println("IP "+ip + " is not reachable ");
                }

            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(Bai2.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }
}
