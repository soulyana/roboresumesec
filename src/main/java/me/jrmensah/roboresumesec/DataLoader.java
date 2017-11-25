package me.jrmensah.roboresumesec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;




@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    ResumeRepository resumeRepository;

    @Override
    public void run(String...strings) throws Exception{
        System.out.println("Loading data...");


       Resume resume = new Resume("John"," ","Doe",);
       resumeRepository.save(resume);

       resume = new Resume("Jane"," ","Doe",);
       resumeRepository.save(resume);




    }



}
