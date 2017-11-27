package me.jrmensah.roboresumesec;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserData,Long> {
    UserData findByUsername(String username);

}
