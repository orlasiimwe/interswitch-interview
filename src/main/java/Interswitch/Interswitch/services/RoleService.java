package Interswitch.Interswitch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Interswitch.Interswitch.entities.Role;
import Interswitch.Interswitch.repositories.RoleRepository;

@Service
public class RoleService {

        private final RoleRepository roleRepository;

        @Autowired
        public RoleService(RoleRepository roleRepository) {
                this.roleRepository = roleRepository;
        }

        public List<Role> getRoles() {
                return roleRepository.findAll();
        }
     

}
