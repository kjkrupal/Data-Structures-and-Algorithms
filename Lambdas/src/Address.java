public class Address {

    private String street;
    private int zipcode;

    Address(int zipcode) {
        this.zipcode = zipcode;
    }

    Address(String street, int zipcode) {
        this.zipcode = zipcode;
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
