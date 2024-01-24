import java.net.UnknownHostException;
import java.time.LocalDate;
import java.net.InetAddress;

public class CarrotsQuantity {
    public static void main(String[] args)
    {Vendor vendor = new Vendor("Jan", "Novak",LocalDate.of(1970,12,4),10.0,2, "Prague", "4A2380",6.0, "8.8. 8.8");

    System.out.println("Hello! Here you can see carrots merchant information: ");
    System.out.println(" ");
    System.out.println(vendor);

    System.out.println("--------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    vendor.avgCarrotsSold();
    System.out.println("Have a nice day, Bye!");






    }




}
