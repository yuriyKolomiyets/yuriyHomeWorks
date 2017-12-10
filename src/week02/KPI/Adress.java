package week02.KPI;

public class Adress {

    private String city;
    private String streetName;
    private int houseNum;
    private int flatNum;

    public Adress(String city, String streetName, int houseNum, int flatNum) {
        this.city = city;
        this.streetName = streetName;
        this.houseNum = houseNum;
        this.flatNum = flatNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public int getFlatNum() {
        return flatNum;
    }

    public void setFlatNum(int flatNum) {
        this.flatNum = flatNum;
    }
}
