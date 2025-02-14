package dev.kritchalach.handytools;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    public static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    public LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime1 = now.format(formatter);

    LocalDateTime futureTime2 = now.plusHours(1).plusMinutes(30);
    String formattedDateTime2 = futureTime2.format(formatter);

    LocalDateTime futureTime3 = now.plusHours(4).plusMinutes(59);
    String formattedDateTime3 = futureTime3.format(formatter);

    @Bean
    CommandLineRunner initDatabase(StorageRepository repository) {
        return args -> {
            log.info("loading " + repository.save(new Storage("Boardgame", "Tonkung", "Dormitory M2", true, "", false, "", "", "", false, false, "", "", "Buy items")));
            log.info("loading " + repository.save(new Storage("Book", "Tete", "Dormitory Brownie", false, "nine", true, formattedDateTime1, "1.5 hour", "Dormitory Jpark", true, false, "", formattedDateTime2, "returned")));
            log.info("loading " + repository.save(new Storage("Ipad", "Akeky", "Dormitory AccomPark", false, "Tonkung", true, formattedDateTime3, "7 Day", "Dormitory M2", false, false, "Using", "", "Borrowed")));
        };
    }
}