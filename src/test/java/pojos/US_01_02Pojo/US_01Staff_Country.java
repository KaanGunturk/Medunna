package pojos.US_01_02Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class US_01Staff_Country {

    private Integer Countryid;
    private String Countryname;

    public US_01Staff_Country(Integer countryid, String countryname) {
        Countryid = countryid;
        Countryname = countryname;
    }

    public US_01Staff_Country() {
    }

    public Integer getCountryid() {
        return Countryid;
    }

    public void setCountryid(Integer countryid) {
        Countryid = countryid;
    }

    public String getCountryname() {
        return Countryname;
    }

    public void setCountryname(String countryname) {
        Countryname = countryname;
    }

    @Override
    public String toString() {
        return "US_01Staff_Country{" +
                "Countryid=" + Countryid +
                ", Countryname='" + Countryname + '\'' +
                '}';
    }
}
