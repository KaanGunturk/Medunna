package pojos.US15_Pojo;

public class US15_CountryPojo {
    private int id;
    private String name;

    public US15_CountryPojo() {
    }

    public US15_CountryPojo(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "US15_StatePojo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
