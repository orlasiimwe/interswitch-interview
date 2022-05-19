package Interswitch.Interswitch.repositories;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Interswitch.Interswitch.entities.User;

// type of object, id
// for CRUD
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findUserByEmail(String email);

    Optional<User> findUserByUsername(String username);

    
}
