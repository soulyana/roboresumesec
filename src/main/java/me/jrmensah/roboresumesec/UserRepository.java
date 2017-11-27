package me.jrmensah.roboresumesec;


public interface UserRepository {
    UserData findByUsername(String username);
    UserData findByEmail(String email);
    Long countByEmail(String email);
    Long countByUsername(String username);
}
