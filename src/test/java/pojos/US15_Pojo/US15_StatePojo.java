package pojos.US15_Pojo;

public class US15_StatePojo {

    private int id;

    private String name;

    private US15_CountryPojo country;

    public US15_StatePojo() {
    }

    public US15_StatePojo(int id, String name, US15_CountryPojo country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public US15_CountryPojo getCountry() {
        return country;
    }

    public void setCountry(US15_CountryPojo country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "US15_StatePojo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}
