package com.spring.datingsite.controllers;

import com.spring.datingsite.entities.Profile;
import com.spring.datingsite.repositories.ProfilesRepository;
import com.spring.datingsite.services.ProfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/profiles")
public class ProfilesController {

    private ProfilesService profilesService;

    @Autowired
    public ProfilesController(ProfilesService profilesService) {
        this.profilesService = profilesService;
    }

    @GetMapping()
    public String getAllProfiles (Model model) {
        model.addAttribute("profiles", profilesService.getAllProfiles());
        return "index.html";
    }

    @GetMapping("/{id}")
    public String getProfileById (@PathVariable long id, Model model) {
        model.addAttribute("profile", profilesService.getProfileById(id));
        return "profileView.html";
    }

    @GetMapping("/new")
    public String newProfile(Model model) {
        model.addAttribute("profile", new Profile());
        return "newProfile.html";
    }

    @PostMapping
    public String saveProfile(@ModelAttribute Profile profile) {
        profilesService.saveProfile(profile);
        return "redirect:/profiles";
    }
}
