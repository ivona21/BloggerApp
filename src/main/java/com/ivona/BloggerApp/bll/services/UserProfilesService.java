package com.ivona.BloggerApp.bll.services;

import com.ivona.BloggerApp.bll.models.UserProfile;
import com.ivona.BloggerApp.dal.entities.UserEntity;
import com.ivona.BloggerApp.dal.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserProfilesService implements BllService {
    @Autowired
    private UsersRepository repository;

    public UserProfile entityToDto(UserEntity entity){
        if (entity == null) return null;

        UserProfile profile = new UserProfile();
        profile.setId(entity.getId());
        profile.setUsername(entity.getUsername());
        profile.setEmail(entity.getEmail());
        profile.setFirstName(entity.getFirstName());
        profile.setLastName(entity.getLastName());
        profile.setFullName();
        profile.setProfileImage(entity.getProfileImage());
        profile.setDateOfBirth(entity.getDateOfBirth());
        profile.setAge();
        profile.setJobTitle(entity.getJobTitle());
        profile.setAboutMe(entity.getAboutMe());

        return profile;
    }

    public List<UserProfile> getAllApplicationUserProfiles(){
        List<UserEntity> entities = repository.findAll();
        List<UserProfile> allProfiles = new ArrayList<>();

        for(UserEntity entity: entities){
            UserProfile profile = entityToDto(entity);
            allProfiles.add(profile);
        }

        return allProfiles;
    }

    public UserProfile getUserProfileByUsername(String username) {
        UserEntity entity = repository.findByUsername(username);
        UserProfile userToReturn = entityToDto(entity);
        return userToReturn;
    }
}