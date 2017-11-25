package me.jrmensah.roboresumesec;

import org.springframework.data.repository.CrudRepository;

public interface RoleRepository {
    UserRole findByRole(String role);

}
