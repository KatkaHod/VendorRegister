import java.time.LocalDate;
import java.net.InetAddress;

public class Vendor {


    String name;
    String surname;
    LocalDate DateOfBirth;
    double numberOfNegotiatedContracts;

    double quantityTons;

    String headquarterCity; //The City of the merchant

    String vehicleRegistrationPlate;
    Double vehicleConsumptionPer100Km;

    String inetAddress;


    //constructor
    public Vendor(String name, String surname, LocalDate DateOfBirth, double numberOfNegotiatedContracts, double quantityTons, String headquarterCity, String vehicleRegistrationPlate, double vehicleConsumptionPer100Km, String inetAddress )
    {   this.name = name;
        this.surname = surname;
        this.DateOfBirth = DateOfBirth;
        this.numberOfNegotiatedContracts = numberOfNegotiatedContracts;
        this.quantityTons = quantityTons;
        this.headquarterCity = headquarterCity;
        this.vehicleConsumptionPer100Km = vehicleConsumptionPer100Km;
        this.vehicleRegistrationPlate = vehicleRegistrationPlate;
        this.inetAddress = inetAddress;
    }

    public void avgCarrotsSold(){
        double avgQuantityPerContracts = quantityTons / numberOfNegotiatedContracts;

    }


    @Override
    public String toString() {
        return name;
    }

}