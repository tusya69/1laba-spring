package com.spring.datingsite.services;

import com.spring.datingsite.entities.Profile;
import com.spring.datingsite.repositories.ProfilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfilesService {
    private ProfilesRepository profilesRepository;

    @Autowired
    public ProfilesService(ProfilesRepository profilesRepository) {
        this.profilesRepository = profilesRepository;
    }

    public Profile getProfileById(long id) {
        return profilesRepository.getProfileById(id);
    }

    public List<Profile> getAllProfiles() {
        return profilesRepository.getProfiles();
    }

    public void saveProfile(Profile profile) {
        profilesRepository.addProfile(profile);
    }
}
