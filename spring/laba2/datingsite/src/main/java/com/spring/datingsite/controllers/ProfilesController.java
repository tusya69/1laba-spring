package com.spring.datingsite.controllers;

import com.spring.datingsite.entities.Profile;
import com.spring.datingsite.services.ProfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/profiles")
public class ProfilesController {

    private final ProfilesService profilesService;

    @Autowired
    public ProfilesController(ProfilesService profilesService) {
        this.profilesService = profilesService;
    }

    @GetMapping()
    public List<Profile> getAllProfiles () {
        return profilesService.getAllProfiles();
    }

    @GetMapping("/{profileId}")
    public Profile getProfileById (@PathVariable Long profileId) {
        return profilesService.getProfileById(profileId);
    }

    @PostMapping
    public void createProfile(@RequestBody Profile profile) {
        profilesService.addProfile(profile);
    }

    @DeleteMapping("/{profileId}")
    public void deleteProfileById (@PathVariable Long profileId) {
        profilesService.deleteProfileById(profileId);
    }

}
