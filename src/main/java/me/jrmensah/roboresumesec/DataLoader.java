package me.jrmensah.roboresumesec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ResumeRepository resumeRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public void run(String...strings) throws Exception{
        System.out.println("Loading data...");


        roleRepository.save(new UserRole("USER"));
        roleRepository.save(new UserRole("RECRUITER"));

        UserRole adminRole = roleRepository.findByRole("RECRUITER");
        UserRole userRole = roleRepository.findByRole("USER");

//       Resume resume = new Resume("John"," J","Jingleheimer-Schmidt","jjjschmidt@gmail.com","BS","Psychology","UMaryland","2002","PHP","Amtrak", "Developer", "duty1","duty2", "highly skilled");
//       resumeRepository.save(resume);
//
//       resume = new Resume("Jane","B","Doe","jbdoe@gmail.com","MS", "Software Engineering", "Johns Hopkins U","2005","Ruby on Rails","DCPS","Business Analyst","duty1","duty2", "proficient" );
//       resumeRepository.save(resume);




    }



}
