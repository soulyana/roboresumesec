package me.jrmensah.roboresumesec;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserData findByEmail(String email){
        return userRepository.findByEmail(email);
    }
    public Long countByEmail(String email){
        return userRepository.countByEmail(email);
    }
    public UserData findByUsername(String username){
        return userRepository.findByUsername(username);
    }
    public void saveUser(UserData user){
        user.addRole(roleRepository.findByRole("USER"));
        user.setEnabled(true);
        userRepository.save(user);
    }
    public void saveAdmin(UserData user){
        user.addRole(roleRepository.findByRole("ADMIN"));
        user.setEnabled(true);
        userRepository.save(user);

    }
}
