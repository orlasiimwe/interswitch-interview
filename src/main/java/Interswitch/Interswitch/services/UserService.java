package Interswitch.Interswitch.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Interswitch.Interswitch.entities.User;
import Interswitch.Interswitch.repositories.RoleRepository;
import Interswitch.Interswitch.repositories.UserRepository;

@Service
@Transactional
public class UserService {

        private final UserRepository userRepository;

        @Autowired
        public UserService(UserRepository userRepository) {
                this.userRepository = userRepository;
        }


        public List<User> getUsers() {
                return userRepository.findAll();
        }

        public void createUser(User user) {
              Optional<User> userOptional = userRepository.findUserByEmail(user.getEmail());
              Optional<User> userNameOptional = userRepository.findUserByUsername(user.getUsername());
              if (userOptional.isPresent() || userNameOptional.isPresent()){
                      throw new IllegalStateException("email or username is already taken");
              } 
              userRepository.save(user);
              user.addAttribute("skills", "RoleRepository.findAll()");
                System.out.println(user);
        }

}
