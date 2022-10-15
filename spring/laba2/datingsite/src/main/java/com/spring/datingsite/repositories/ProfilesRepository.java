package com.spring.datingsite.repositories;

import com.spring.datingsite.entities.Birthday;
import com.spring.datingsite.entities.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProfilesRepository {

    private static long COUNT_PROFILES;
    private List<Profile> profiles = new ArrayList<> (Arrays.asList(
            new Profile(++COUNT_PROFILES, "Анастасія", "Коваленко", new Birthday(5, 11, 2000), "0662584961", "Ukraine"),
            new Profile(++COUNT_PROFILES, "Віталій", "Петренко", new Birthday(15, 2, 2001), "0506124597", "Ukraine"),
            new Profile(++COUNT_PROFILES, "Сергій", "Іваненко", new Birthday(29, 1, 1999), "0679584636", "Ukraine")
    ));

    public List<Profile> getProfiles() {
        return profiles;
    }

    public Profile getProfileById(long id) {
        return profiles.stream().filter(profile -> profile.getId().equals(id)).findFirst().orElseThrow();
    }

    public void addProfile(Profile profile) {
        profile.setId(++COUNT_PROFILES);
        profiles.add(profile);
    }
}
