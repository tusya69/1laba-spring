package com.spring.datingsite.services;

import com.spring.datingsite.entities.Profile;
import com.spring.datingsite.repositories.ProfilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfilesService {
    private final ProfilesRepository profilesRepository;

    @Autowired
    public ProfilesService(ProfilesRepository profilesRepository) {
        this.profilesRepository = profilesRepository;
    }

    public Profile getProfileById(Long id) {
        return profilesRepository.findById(id).orElse(null);
    }

    public List<Profile> getAllProfiles() {
        return new ArrayList<>(profilesRepository.findAll());
    }

    public void addProfile(Profile profile) {
        if (profilesRepository.findProfileByPhone(profile.getPhone()).isPresent())
            throw new IllegalStateException("Profile with this phone number is already exists.");
        profilesRepository.save(profile);
    }

    public void deleteProfileById (Long id) {
        if (!profilesRepository.existsById(id))
            throw new IllegalStateException("This profile does not exist.");
        profilesRepository.deleteById(id);
    }
}
