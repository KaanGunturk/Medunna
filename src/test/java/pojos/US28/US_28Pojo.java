package pojos.US28;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_28Pojo {

    private Integer id;
    private String name;

    public US_28Pojo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public US_28Pojo() {
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
        return "US_28Pojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
