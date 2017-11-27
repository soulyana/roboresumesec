package me.jrmensah.roboresumesec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public void run(String...strings) throws Exception{
        System.out.println("Loading data...");

        roleRepository.save(new UserRole("USER"));
        roleRepository.save(new UserRole("ADMIN"));

        UserRole adminRole = roleRepository.findByRole("ADMIN");
        UserRole userRole = roleRepository.findByRole("USER");


        UserData user = new UserData("bob@bob.com", "bob", "Bob", "Bobberson", true, "bob");
        user.addRole(roleRepository.save(userRole));
        userRepository.save(user);

        user = new UserData("jim@jim.com", "jim", "Jim", "Jimmerson", true, "jim");
        user.addRole(roleRepository.save(userRole));
        userRepository.save(user);

        user = new UserData("admin@adm.com", "pass", "Admin", "User", true, "admin");
        user.addRole(roleRepository.save(adminRole));
        userRepository.save(user);

        user = new UserData("sam@ev.com", "pass", "Sam", "Everyman", true, "sam");
        user.addRole(roleRepository.save(userRole)); roleRepository.save(adminRole);
        userRepository.save(user);


    }



}
