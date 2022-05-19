package Interswitch.Interswitch.configs;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import Interswitch.Interswitch.entities.User;
import Interswitch.Interswitch.repositories.UserRepository;

@Configuration
public class UserConfig {
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User orlasiimwe = new User(
                    "orlasiimwe",
                    "Orla",
                    "Asiimwe",
                    "orla@gmail.com",
                    "password");
            User orlanerys = new User(
                    "orlasiimwe",
                    "Orla",
                    "Asiimwe",
                    "orla@gmail.com",
                    "password");
            repository.saveAll(
                    List.of(orlanerys, orlasiimwe));
        };
    }

}
