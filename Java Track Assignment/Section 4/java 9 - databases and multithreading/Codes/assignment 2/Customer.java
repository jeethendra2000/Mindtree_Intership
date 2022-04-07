import javax.persistence.*;

@Entity
@Table(name = "colibri.customer")
public class Car {
    @Column(name = "cusId")
    private String cusID;
    @Column(name = "cusName")
    private String cusName;
    @Column(name = "city")
    private String city;
    @Column(name = "pin")
    private int pin;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public Customer(String cusID, String cusName, String city,int pin) {
        this.cusID = cusID;
        this.cusName = cusName;
        this.city = city;
        this.pin = pin;
    }

    public Customer()
    {

    public int getPin() {
        return pin;
    }

    public String getCity() {
        return city;
    }

    public String getcusName() {
        return cusName;
    }

    public String getcusID() {
        return cusID;
    }

    public String toCSVString() {
        return cusID + ", " + cusName + ", " + city + ", " + pin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setcusID(String cusID) {
        this.cusID = cusID;
    }

    public void setcusName(String cusName) {
        this.cusName = cusName;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public void setpin(int pin) {
        this.pin = pin;
    }
}
