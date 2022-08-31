package pojos.ortakPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.javafaker.Country;

import javax.swing.plaf.nimbus.State;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Patient<InPatients> {

    private String createdBy;
    private String createdDate;
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String adress;
    private String email;
    private String description;
    private Country country;
    private InPatients [] inPatients;
    private State cstate;
}
