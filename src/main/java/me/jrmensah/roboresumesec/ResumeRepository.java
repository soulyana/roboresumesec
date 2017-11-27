package me.jrmensah.roboresumesec;

import org.springframework.data.repository.CrudRepository;

<<<<<<< HEAD
import java.util.List;

public interface ResumeRepository extends CrudRepository<Resume, Long> {

    public List<Resume> findById(int id);

    public List<Resume> findAllByFirstName(String firstName);
    public List<Resume> findAllByLastName(String lastName);

    public List<Resume> findAllBySchool(String School);

    public List<Resume> findAllByWorkplace(String workplace);
    public List<Resume> findAllBySkill(String skill);


=======
public interface ResumeRepository extends CrudRepository<Resume, Long> {

>>>>>>> origin/master
}
