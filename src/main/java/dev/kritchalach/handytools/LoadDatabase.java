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
            log.info("loading " + repository.save(new Storage("Boardgame", "Tonkung", "Dormitory M2", false, false, "", "", formattedDateTime1, "Buy items" )));
            log.info("loading " + repository.save(new Storage("Book", "Tete", "Dormitory Brownie", false, false, "", "", formattedDateTime2, "Buy items" )));
            log.info("loading " + repository.save(new Storage("Ipad", "Akeky", "Dormitory Jpark", false, false, "", "", formattedDateTime3, "Buy items" )));
        };
    }
}