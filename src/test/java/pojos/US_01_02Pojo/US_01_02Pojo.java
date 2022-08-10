package pojos.US_01_02Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)
public class US_01_02Pojo {

// https://medunna.com/api/staff


    private String adress;
    private String birthDate;
    private String bloodGroup;
    private US_01Staff_Country country;
    private String createdBy;
    private String createdDate;
    private US_01Staff_Cstate cstate;
    private String description;
    private String firstName;
    private String gender;
    private Integer id;
    private String lastName;
    private String phone;
    private String ssn;
    private US_01Staff_User user;


    public US_01_02Pojo(String adress, String birthDate, String bloodGroup, US_01Staff_Country country, String createdBy, String createdDate, US_01Staff_Cstate cstate, String description, String firstName, String gender, Integer id, String lastName, String phone, String ssn, US_01Staff_User user) {
        this.adress = adress;
        this.birthDate = birthDate;
        this.bloodGroup = bloodGroup;
        this.country = country;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.cstate = cstate;
        this.description = description;
        this.firstName = firstName;
        this.gender = gender;
        this.id = id;
        this.lastName = lastName;
        this.phone = phone;
        this.ssn = ssn;
        this.user = user;
    }

    public US_01_02Pojo() {
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public US_01Staff_Country getCountry() {
        return country;
    }

    public void setCountry(US_01Staff_Country country) {
        this.country = country;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public US_01Staff_Cstate getCstate() {
        return cstate;
    }

    public void setCstate(US_01Staff_Cstate cstate) {
        this.cstate = cstate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public US_01Staff_User getUser() {
        return user;
    }

    public void setUser(US_01Staff_User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "US_01_02Pojo{" +
                "adress='" + adress + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", country=" + country +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", cstate=" + cstate +
                ", description='" + description + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", ssn='" + ssn + '\'' +
                ", user=" + user +
                '}';
    }

}
