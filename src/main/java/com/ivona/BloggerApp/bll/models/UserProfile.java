package com.ivona.BloggerApp.bll.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UserProfile {
    private Long id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String fullName;
    private String profileImage;
    private Date dateOfBirth;
    private int age;
    private String jobTitle;
    private String aboutMe;

    public UserProfile(){};

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

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(){
        this.fullName = firstName == null ? "" : firstName + lastName == null ? "" : lastName;
    }

    public String getProfileImage(){
        return profileImage;
    }

    public void setProfileImage(String profileImage){
        this.profileImage = profileImage;
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

    public void setAboutMe(String aboutMe){
        this.aboutMe = aboutMe;
    }

    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth(){
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateOfBirth == null ? "" : dateFormat.format(dateOfBirth);
    }

    public void setAge(){
        if (dateOfBirth == null) {
            this.age = 0;
            return;
        }

        Date today = new Date();

        Calendar dateOfBirthCalendar = Calendar.getInstance();
        dateOfBirthCalendar.setTime(dateOfBirth);
        int dateOfBirthYear = dateOfBirthCalendar.get(Calendar.YEAR);

        Calendar todayCalendar = Calendar.getInstance();
        todayCalendar.setTime(today);
        int currentYear = todayCalendar.get(Calendar.YEAR);

        int age = currentYear - dateOfBirthYear;
        this.age = age;
    }

    public int getAge (){
       return this.age;
    }
}