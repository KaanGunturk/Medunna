package pojos.US15_Pojo;

public class US15_PatientPojo {

    private String createdBy  ;
    private String createdDate;
    private int id         ;
    private String firstName  ;
    private String lastName   ;
    private String birthDate  ;
    private String phone      ;
    private String gender     ;
    private String bloodGroup ;
    private String adress     ;
    private String email      ;
    private String description;
    private US15_UserPojo user;
    private String appointments;
    private String inPatients;
    private US15_CountryPojo country;
    private US15_StatePojo cstate;

    public US15_PatientPojo() {
    }

    public US15_PatientPojo(String createdBy, String createdDate, int id, String firstName, String lastName, String birthDate, String phone, String gender, String bloodGroup, String adress, String email, String description, US15_UserPojo user, String appointments, String inPatients, US15_CountryPojo country, US15_StatePojo cstate) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.email = email;
        this.description = description;
        this.user = user;
        this.appointments = appointments;
        this.inPatients = inPatients;
        this.country = country;
        this.cstate = cstate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public US15_PatientPojo(String firstName, String lastName, String phone, String adress, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.adress = adress;
        this.email = email;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public US15_UserPojo getUser() {
        return user;
    }

    public void setUser(US15_UserPojo user) {
        this.user = user;
    }

    public String getAppointments() {
        return appointments;
    }

    public void setAppointments(String appointments) {
        this.appointments = appointments;
    }

    public String getInPatients() {
        return inPatients;
    }

    public void setInPatients(String inPatients) {
        this.inPatients = inPatients;
    }

    public US15_CountryPojo getCountry() {
        return country;
    }

    public void setCountry(US15_CountryPojo country) {
        this.country = country;
    }

    public US15_StatePojo getCstate() {
        return cstate;
    }

    public void setCstate(US15_StatePojo cstate) {
        this.cstate = cstate;
    }

    @Override
    public String toString() {
        return "US15_PatientPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", appointments='" + appointments + '\'' +
                ", inPatients='" + inPatients + '\'' +
                ", country=" + country +
                ", cstate=" + cstate +
                '}';
    }
}
