package composition;

public class Address {
    private String city;
    private String line;

    public Address(String city, String line) {
        this.line = line;
        this.city = city;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
