package com.ivona.BloggerApp.dal.models;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;

@Entity
@Table(name="application_user")
public class ApplicationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username", nullable = false)
    @UniqueElements
    private String username;

    @Column(name="email", nullable = false)
    @UniqueElements
    @Email
    private String email;

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

    public ApplicationUser(){};

    public ApplicationUser(Long id, String username, String email, String password, Date dateOfBirth, String jobTitle, String aboutMe) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.jobTitle = jobTitle;
        this.aboutMe = aboutMe;
    }

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