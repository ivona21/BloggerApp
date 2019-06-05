package com.ivona.BloggerApp.dal.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;

@Entity
@Table(name="application_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username", nullable = false, unique = true)
    private String username;

    @Column(name="email", nullable = false, unique = true)
    @Email
    private String email;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="profile_image")
    private String profileImage;

    @Column(name="date_of_birth")
    private Date dateOfBirth;

    @Column(name="job_title")
    private String jobTitle;

    @Column(name="about_me")
    private String aboutMe;

    public UserEntity(){};

//    public ApplicationUser(Long id, String username, String email, String firstName, String lastName, String password, Date dateOfBirth, String jobTitle, String aboutMe) {
//        this.id = id;
//        this.username = username;
//        this.email = email;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.password = password;
//        this.dateOfBirth = dateOfBirth;
//        this.jobTitle = jobTitle;
//        this.aboutMe = aboutMe;
//    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {this.email = email; }

    public String getFirstName() {return firstName; }
    public void setFirstName(String firstName) {this.firstName = firstName; }

    public String getLastName(){ return lastName; }
    public void setLastName(String lastName){ this.lastName = lastName; }

    public String getProfileImage() { return profileImage; }
    public void setProfileImage(String profileImage){this.profileImage = profileImage; }

    public String getPassword() { return password; }
    public void setPassword(String password) {this.password = password; }

    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public String getAboutMe(){
        return aboutMe;
    }
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
}