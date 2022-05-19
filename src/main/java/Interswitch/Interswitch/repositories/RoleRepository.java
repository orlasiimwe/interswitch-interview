package Interswitch.Interswitch.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Interswitch.Interswitch.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

}
