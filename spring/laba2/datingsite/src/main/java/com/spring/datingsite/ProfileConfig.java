package com.spring.datingsite;

import com.spring.datingsite.entities.Profile;
import com.spring.datingsite.repositories.ProfilesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class ProfileConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProfilesRepository profilesRepository) {
        return args -> profilesRepository.saveAll(List.of(
                new Profile("Анна", "Петренко", LocalDate.of(2001, 8, 5), "0663245867", "Ukraine"),
                new Profile("Катерина", "Коваленко", LocalDate.of(1995, 6, 2), "0503248657", "Ukraine"),
                new Profile("Віталій", "Степаненко", LocalDate.of(2002, 12, 15), "0605748966", "Ukraine")
        ));
    }

}
