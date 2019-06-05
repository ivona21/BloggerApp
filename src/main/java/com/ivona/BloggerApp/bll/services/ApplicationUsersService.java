package com.ivona.BloggerApp.bll.services;

import com.ivona.BloggerApp.bll.models.ApplicationUserProfile;
import com.ivona.BloggerApp.dal.models.ApplicationUser;
import com.ivona.BloggerApp.dal.repositories.ApplicationUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ApplicationUsersService implements BllService {
    @Autowired
    private ApplicationUsersRepository repository;

    public ApplicationUserProfile modelToDto(ApplicationUser applicationUser){
        if (applicationUser == null) return null;

        ApplicationUserProfile profile = new ApplicationUserProfile();
        profile.setId(applicationUser.getId());
        profile.setUsername(applicationUser.getUsername());
        profile.setEmail(applicationUser.getEmail());
        profile.setFirstName(applicationUser.getFirstName());
        profile.setLastName(applicationUser.getLastName());
        profile.setFullName();
        profile.setProfileImage(applicationUser.getProfileImage());
       // profile.setDateOfBirth(applicationUser.getDateOfBirth());
       // profile.setAge();
        profile.setJobTitle(applicationUser.getJobTitle());
        profile.setAboutMe(applicationUser.getAboutMe());

        return profile;
    }

    public List<ApplicationUserProfile> getAllApplicationUsers(){
        List<ApplicationUser> allUsers = repository.findAll();
        List<ApplicationUserProfile> allProfiles = new ArrayList<>();

        for(ApplicationUser user: allUsers){
            ApplicationUserProfile profile = modelToDto(user);
            allProfiles.add(profile);
        }

        return allProfiles;
    }

    public ApplicationUserProfile getUserByUsername(String username) {
        ApplicationUser foundUser = repository.findByUsername(username);
        ApplicationUserProfile userToReturn = modelToDto(foundUser);
        return userToReturn;
    }
}