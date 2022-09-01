package pojos.US1_2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_01Staff_Cstate {

    private Integer id;
    private String name;

    public US_01Staff_Cstate(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public US_01Staff_Cstate() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "US_01Staff_Cstate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
